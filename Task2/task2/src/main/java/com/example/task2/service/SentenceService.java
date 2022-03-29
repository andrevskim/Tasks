package com.example.task2.service;

import java.io.IOException;

import com.example.task2.dto.Sentence;

public interface SentenceService {

	Sentence generateSentences() throws IOException;

}
