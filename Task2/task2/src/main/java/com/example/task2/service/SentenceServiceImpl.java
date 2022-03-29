package com.example.task2.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.task2.dto.Sentence;

@Service
public class SentenceServiceImpl implements SentenceService {

	@Override
	public Sentence generateSentences() throws IOException {
		Sentence s = new Sentence();
		String result = new String();
		Random random = new Random();

		Integer numberOfSentences = random.nextInt(10 - 1 + 1) + 1;

		for (Integer i = 0; i < numberOfSentences; i++) {
			Integer numberOfStringsLength = random.nextInt(15 - 2 + 1) + 1;
			String temp = generateString(numberOfStringsLength);
			if (i == 0) {
				temp = temp.substring(0, 1).toUpperCase() + temp.substring(1).toLowerCase();
			}
			if (i == numberOfSentences - 1) {
				temp = temp + ".";
			}
			result = result + " " + temp;
		}
		s.setSentence(result.stripLeading());
		s.setTimestamp(LocalDateTime.now());

		return s;
	}

//	private void writeToFile() {
//	      myWriter.write("Files in Java might be tricky, but it is fun enough!");
//	}

	private String generateString(Integer length) {
		int leftLimit = 97;
		int rightLimit = 122;
		int targetStringLength = length;
		Random random = new Random();

		String generatedString = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

		return generatedString;
	}

}
