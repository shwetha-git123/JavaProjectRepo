package day1;
import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
	
Scanner s=new Scanner(System.in);
System.out.println("enter age and name");
int age=s.nextInt();
String name=s.nextLine();
Student stu=new Student(age,name);
System.out.println("enter age");
stu.setAge(s.nextInt());
System.out.println("enter name");
stu.setName(s.nextLine());
System.out.println(stu.getAge());
System.out.println(stu.getName());
System.out.println("Student name is:"+stu.getName()+" and age is:"+stu.getName());
	}

}
