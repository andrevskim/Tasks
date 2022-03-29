package com.example.task3;

import java.io.File;
import java.io.FileWriter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Task3Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Task3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String url = "http://localhost:8080/restEndPoint";
		RestTemplate restTemplate = new RestTemplate();
		File task3 = new File("task3.txt");
		FileWriter myWriter = new FileWriter("task3.txt");
		for (Integer i = 0; i < 100; i++) {
			Sentence s = restTemplate.getForObject(url, Sentence.class);			
			myWriter.write(s.toString() + "\n");
		}
		myWriter.flush();

		if (task3.createNewFile()) {
			System.out.println("File created: " + task3.getName());
		}

	}

}
