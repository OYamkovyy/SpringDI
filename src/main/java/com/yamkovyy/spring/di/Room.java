package com.yamkovyy.spring.di;

import java.util.List;

public class Room {
	
	public Room(){};
	
	private List<Student> students;
	
	public void setStudents(List<Student> students){
		this.students = students;
	}
	
	public void students(){
		System.out.println("Student from this room says: ");
		for(Student student:students){
			student.hello();
		}
	}
}
