package inneerclass;

import java.util.Scanner;

interface Student{
	String study(String name,String subject);
}

public class Runner {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name");
		String name=s.next();
		System.out.println("Enter subject");
		String sub=s.next();
		Student student=new Student() {
			public String study(String name,String subject) {
				return name+" is studying "+sub;
			}
		};
		System.out.println(student.study(name, sub));
	}

}

/** DOCUMENTATION

 * Anonymous inner class
 * a class without any name
 * with the help of anonymous inner class we can implement methods

 * syntax:
  ClassName referenceName=new ClassName(){
 //    Override the methods
  };



 */

