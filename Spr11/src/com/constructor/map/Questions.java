package com.constructor.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Questions {
	private int id;
	private String name;
	private Map<Answer,User> answers;
	public Questions(int id, String name, Map<Answer, User> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void display(){
		
		System.out.println("Question ID: " + id);
		System.out.println("Question Name: " + name);
		System.out.println("Answers ");
		Set<Entry<Answer,User>> set = answers.entrySet();
		Iterator<Entry<Answer,User>> itr = set.iterator();
		while(itr.hasNext()){
			Entry<Answer, User> entry = itr.next();
			Answer ans = entry.getKey();
			User user = entry.getValue();
			System.out.println("--------------------------");
			System.out.println("Answer Info:---- " + ans);
			System.out.println("Posted By:---- " + user);
			System.out.println("--------------------------");
		}
				
	}

}
