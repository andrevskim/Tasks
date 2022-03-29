package com.example.task2.rest;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.task2.dto.Sentence;
import com.example.task2.service.SentenceService;

@RestController
public class SentenceController {
	@Autowired
	private SentenceService sentenceService;
	
	@GetMapping("/restEndPoint")
	public Sentence getSentence() {		
		try {
			return sentenceService.generateSentences();
		} catch (IOException e) {
			throw new RuntimeException();
		}
	}

}
