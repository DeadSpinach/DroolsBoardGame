package com.sample;

public class Answer {
	public String question;
	public String answer;
	
	public Answer() {}
	
	public Answer(String question, String answer) {
		this.question = question;
		this.answer = answer;
	}
	public String getQuestion() {
		return this.question;
	}
	
	public String getAnswer() {
		return this.answer;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
