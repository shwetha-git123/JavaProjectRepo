package day2;
public class Student implements Comparable<Student> {
	int id;
	String name;
	int marks;
	Student(int id,String name,int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "Name="+name+"\nId="+id+"\nMarks="+marks;
	}
	public int compareTo(Student s) {
		return this.marks-s.marks;
	}
}
