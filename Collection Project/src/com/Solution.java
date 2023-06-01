package com;
import java.util.*;
public class Solution {
	
	public static void main(String[] args) {
		Student s1=new Student(10,18,"Anu");
		Student s2=new Student(30,15,"Tarun");
		Student s3=new Student(50,23,"Janu");
		Student s4=new Student(20,22,"Bhavish");
		
		LinkedHashMap<Integer,Student> lm=new LinkedHashMap<Integer,Student>();
		lm.put(s1.id, s1);
		lm.put(s2.id, s2);
		lm.put(s3.id, s3);
		lm.put(s4.id, s4);
		
		//creating ArrayList to store student objects
		ArrayList<Student> al=new ArrayList<Student>();
		
		//converting map into set using keySet()=>returns a set of keys
		Set<Integer> keys=lm.keySet();
		
		//Traversing keys using for each loop
		for(Integer key:keys) {
			al.add(lm.get(key));//adding value(student objects) inside ArrayList
			//System.out.println(lm.get(key));//printing student objects	
		}
		
		System.out.println("--------------------");
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("1.Sort Student by Id");
		
		System.out.println("2.Sort Student by Age");
		
		System.out.println("3.Sort Student by Name");
		
		System.out.println("--------------------");
		
		System.out.println("Enter your choice");
		int choice=s.nextInt();
		
		switch(choice) {
		case 1:System.out.println("sorting by id");
		Collections.sort(al,new SortStudentById());
		for(Student stu:al)
			System.out.println(stu);
		break;
		case 2:System.out.println("sorting by Age");
		Collections.sort(al,new SortStudentByAge());
		for(Student stu:al) 
			System.out.println(stu);
		break;
		case 3:System.out.println("sorting by Name");
		Collections.sort(al,new SortStudentByName());
		for(Student stu:al) 
			System.out.println(stu);
		break;
		default:System.out.println("invalid choice");

		}
	}
}
