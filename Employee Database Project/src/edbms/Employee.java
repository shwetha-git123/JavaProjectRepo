package edbms;

//java bean class

public class Employee {
private String id;
private String name;
private int age;
private Double salary;
private static int count=101;


public Employee(String name,int age,double salary) {
	this.id="jsp"+count;
	count++;
	this.name=name;
	this.age=age;
	this.salary=salary;
}

public String getId() {
	return id;
}

public int getAge() {
	return age;
}

public String getName() {
	return name;
}

public Double getSalary() {
	return salary;
}

public void setAge(int age) {
	this.age = age;
}

public void setName(String name) {
	this.name = name;
}

public void setSalary(Double salary) {
	this.salary = salary;
}

public String toString() {
	
	return "Id="+id+" name="+name+" Age="+age+" Salary="+salary;
}
}
