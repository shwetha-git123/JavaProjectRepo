package sdbms;
import java.util.Scanner;
public class Solution {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);

		StudentManagementSystem sms=new StudentManagementSystemImpl();// Upcasting to achieve abstraction.

		System.out.println("Welcome to Student DataBase");

		while(true) {
			
//			Menu Driven program
			System.out.println("1.Add Student\n2.Display Student\n3.Display All Student\n4.Remove Student\n5.Remove All Student\n6.Update Student\n7.Count Student\n8.Sort Student\n9.Find Student With Highest Marks\n10.Find Student With Lowest Marks\n11.Exit");
			System.out.println("Enter Your Choice");
			int choice=s.nextInt();
			switch(choice) {
			case 1:
				sms.addStudent();
				break;
			case 2:
				sms.displayStudent();
				break;
			case 3:
				sms.displayAllStudent();
				break;
			case 4:
				sms.removeStudent();
				break;
			case 5:
				sms.removeAllStudent();
				break;
			case 6:
				sms.updateStudent();
				break;
			case 7:
				sms.countStudent();
				break;
			case 8:
				sms.sortStudent();
				break;
			case 9:
				sms.findStudentWithHighestMarks();
				break;
			case 10:
				sms.findStudentWithLowestMarks();
				break;
			case 11:
				System.exit(0);

			default:
				System.out.println("Invalid Choice enter a proper choice");
			}//end of switch
			
		}//end of while()


	}//end of main()
	
}//end of class

