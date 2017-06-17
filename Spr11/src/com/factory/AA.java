package com.factory;

public class AA {
private static final AA obj = new AA();
private AA(){
	System.out.println("Private Constructor.");
}
public static AA getA(){
	System.out.println("Factory Method.");
	return obj;
}

public void msg(){
	System.out.println(" Hello User ");
}
}
