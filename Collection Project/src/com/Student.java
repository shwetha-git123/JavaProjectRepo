package com;

public class Student {
	public int id;
	public int age;
	public String name;
	public Student(int id,int age,String name) {
		this.id=id;
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Id:"+id+"\nAge:"+age+"\nName:"+name;
	}
}

// alt + shift + s=>source