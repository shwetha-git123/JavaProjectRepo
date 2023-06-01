package edbms;
import java.util.Scanner;

import customexception.InvalidChoiceException;


public class Solution {
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		EmployeeManagementSystem emp=new EmployeeManagementSystemImplementation();  //upcasting

		System.out.println("Welcome to Employee Database System!!!");

		while(true) {
			//Menu driven Program

			System.out.println("1.Add Employee\n2.Display Employee\n3.Display All Employee\n4.Remove Employee\n5.Remove All Employee\n6.Update Employee\n7.Count Employee\n8.Sort Employee\n9.Find Student With Highest Salary\n10.Find Student With Lowest Salary\n11.Exit");

			System.out.println("Enter Your Choice");

			int choice=scan.nextInt();

			switch(choice) {
			case 1:
				emp.addEmployee();
				break;
			case 2:
				emp.displayEmployee();
				break;
			case 3:
				emp.displayAllEmployee();
				break;
			case 4:
				emp.removeEmployee();
				break;
			case 5:
				emp.removeAllEmployee();
				break;
			case 6:
				emp.updateEmployee();
				break;
			case 7:
				emp.countEmployee();
				break;
			case 8:
				emp.sortEmployee();
				break;
			case 9:
				emp.findEmployeeWithHighSalary();
				break;
			case 10:
				emp.findEmployeeWithLowSalary();
				break;
			case 11:
				System.exit(0);

			default:
				try {
					throw new InvalidChoiceException("Invalid Choice..please enter a valid choice");
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
