package com.yamkovyy.spring.di;

public class Student implements Human{

	String name = "Student";
	
	public Student(){}
	public Student(String name){
		this.name = name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void hello() {
		System.out.println("Hello, my name is " + name + "!");	
	}

}
