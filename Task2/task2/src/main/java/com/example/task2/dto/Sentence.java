package com.example.task2.dto;

import java.time.LocalDateTime;

public class Sentence {
	private LocalDateTime timestamp;
	private String sentence;

	public Sentence(LocalDateTime timestamp, String sentence) {
		super();
		this.timestamp = timestamp;
		this.sentence = sentence;
	}

	public Sentence() {
		super();
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime localDateTime) {
		this.timestamp = localDateTime;
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	@Override
	public String toString() {
		return "Sentence [timestamp=" + timestamp + ", sentence=" + sentence + "]";
	}

}
