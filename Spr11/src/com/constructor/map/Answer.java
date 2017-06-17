package com.constructor.map;

public class Answer {
	private int id;
	private String answer;
	private String postedDate;
	public Answer(int id, String answer, String postedDate) {
		super();
		this.id = id;
		this.answer = answer;
		this.postedDate = postedDate;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + ", postedDate="
				+ postedDate + "]";
	}
	

}
