package com.contructor.list;

public class Answer {
private int id;
private String name;
private String by;
public Answer(int id, String name, String by) {
	super();
	this.id = id;
	this.name = name;
	this.by = by;
}
public Answer() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Answer [id=" + id + ", name=" + name + ", by=" + by + "]";
}


}