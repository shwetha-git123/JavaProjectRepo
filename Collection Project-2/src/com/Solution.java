package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Employee e1=new Employee(200,"tommy",5.5);
		Employee e2=new Employee(300,"jack",8.5);
		Employee e3=new Employee(400,"adams",4.5);
		Employee e4=new Employee(100,"smith",3.5);

		Map<Integer,Employee> m=new LinkedHashMap<Integer,Employee>();

		m.put(e1.getId(), e1);
		m.put(e2.getId(), e2);
		m.put(e3.getId(), e3);
		m.put(e4.getId(), e4);

		Set<Integer> keys=m.keySet();

		List<Employee> l= new ArrayList<Employee>();

		for(int key:keys) {
			l.add(m.get(key));
		}

		while(true) {
			System.out.println("1.Sort by employee id\n2.Sort by employee Salary\n3.Sort by employee Name\n4.Exit");
			System.out.println("enter your choice");
			int choice =scan.nextInt();

			switch(choice){
			case 1:Collections.sort(l,new SortEmployeeById());	
			for(Employee ele:l) {
				System.out.println(ele);
			}
			break;

			case 2:Collections.sort(l,new SortEmployeeBySalary());
			Collections.reverse(l);// to arrange the salary in descending order
			for(Employee ele:l) {
				System.out.println(ele);
			}
			break;

			case 3:
				Collections.sort(l,new SortEmployeeByName());					
				for(Employee ele:l) {
					System.out.println(ele);
				}

				break;

			case 4:System.out.println("Thank you!!");
			System.exit(0);

			default:
				try {
					
					throw new InvalidChoiceException("Invalid choice");
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
