package com;

public class Employee {
	private int id;
	private String name;
	private Double salary;
	
	public Employee(int id,String name,Double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return "Id:"+id+" Name:"+name+" Salary:"+salary+" LPA";
	}
	
}
