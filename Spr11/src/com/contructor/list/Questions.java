package com.contructor.list;

import java.util.Iterator;
import java.util.List;

public class Questions {
	private int id;
	private String name;
	private List<Answer> answers;

	public Questions(int id, String name, List<Answer> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void display() {
		System.out.println(id + "\n" + name);
		System.out.println("Answer are: ");
		Iterator<Answer> itr = answers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
