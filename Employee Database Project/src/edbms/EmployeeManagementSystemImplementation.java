package edbms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import customexception.EmployeeNotFoundException;
import customexception.EmployeeNotFoundException;
import customexception.InvalidChoiceException;
import customsorting.SortEmployeeByAge;
import customsorting.SortEmployeeById;
import customsorting.SortEmployeeByName;
import customsorting.SortEmployeeBySalary;
import customsorting.SortEmployeeBySalary;
import edbms.Employee;
import edbms.Employee;

public class EmployeeManagementSystemImplementation implements EmployeeManagementSystem {
Scanner s=new Scanner(System.in);

Map<String,Employee> eb=new LinkedHashMap<String,Employee>();


	@Override
	public void addEmployee() {
		System.out.println("Enter Employee name");		
		String name=s.next();
		
		System.out.println("Enter Employee Age");
		int age=s.nextInt();
		
		System.out.println("Enter Employee salary");
		double salary=s.nextDouble();
		
		Employee emp=new Employee(name,age,salary);
		
		eb.put(emp.getId(), emp);
		 
		System.out.println("Employee records added !!");
		
		System.out.println("Employee id="+emp.getId());
		System.out.println();
	}

	@Override
	public void displayEmployee() {

System.out.println("Enter Employee id:");
String id=s.next().toLowerCase();
Employee emp=eb.get(id);

if(eb.containsKey(emp.getId())) {
	System.out.println("Employee record found!!");
	System.out.println(emp);
}
else {
	try {
		throw new EmployeeNotFoundException("Invalid id");
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
		
	}

	@Override
	public void displayAllEmployee() {
		if(!eb.isEmpty()) {
			System.out.println("Employee records are as follows...");
			Set<String> keys=eb.keySet(); 
			for(String key:keys) {
			Employee emp=eb.get(key);
			System.out.println(emp);
			}
		}
		else {
			try {
				throw new EmployeeNotFoundException("No employee found");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

	@Override
	public void removeEmployee() {
		System.out.println("Enter employee id");
		
		String id=s.next();
		id=id.toLowerCase();

		if(eb.containsKey(id)) {
			System.out.println("Student record found");
			System.out.println(eb.get(id));
			eb.remove(id);
			System.out.println("Employee record deleted successfully!!");
		}
		else {
			try {
				throw new EmployeeNotFoundException("No employee found with id="+id);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

	@Override
	public void removeAllEmployee() {
		if(!eb.isEmpty()) {
			System.out.println("no of students records:"+eb.size());
			eb.clear();
			System.out.println("All Employee records deleted successfully!!");
		}
		else {
		try {
			throw new EmployeeNotFoundException("Employee database is empty");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
		
	}

	@Override
	public void updateEmployee() {
		System.out.println("Enter  the id:");
		String id=s.next().toLowerCase();
		if(eb.containsKey(id)) {
			System.out.println("Employee record found!");
			Employee emp=eb.get(id);//getting value(Employee Object)

			System.out.println("1:Update age \n2:Update Name\n3:Update the Salary\4:Enter the Choice");
			int choice=s.nextInt();

			switch(choice) {
			case 1:
				System.out.println("Enter the Age");
				emp.setAge(s.nextInt());
				System.out.println("Age updated sucessfully");
				break;

			case 2:
				System.out.println("Enter the Name");
				emp.setName(s.next());
				System.out.println("Name updated sucessfully");
				break;

			case 3:	
				System.out.println("Enter the Salary");
				emp.setSalary(s.nextDouble());
				System.out.println("Salary updated sucessfully");
				break;

			default:
				try {
					String message="Invalid choice ";
					throw new InvalidChoiceException(message) ;
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		else
		{
			try {
				throw new EmployeeNotFoundException("Employee not found");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}	
		}
		
	}

	@Override
	public void countEmployee() {
		System.out.println("Number of Employees ="+eb.size());
		
	}

	@Override
	public void sortEmployee() {
		/**
		 * we cannot sort the map based on values,
		 * so we are getting the values from map and storing it inside the list
		 *  so that we can sort list using ->collection.sort(list,sorting logic object)
		 */
		//reference of list & object of arraylist storing Student objects
		List<Employee> list=new ArrayList<Employee>();

		//converting map into set, which stores keys(id)
		Set<String>keys=eb.keySet();

		for(String key:keys) {
			//getting value (student object) and storing it into list
			list.add(eb.get(key));
		}

		System.out.println("1:Sort by age \n2:sort by Name\n3:sort by the Salary\n4:Sort by id\n5:Enter your choice");
		int choice=s.nextInt();
		switch(choice) {
		
		case 1:Collections.sort(list,new SortEmployeeByAge());
		for(Employee e:list) {
			System.out.println(e.getAge());
		}
			break;
			
		case 2:Collections.sort(list,new SortEmployeeByName());
		for(Employee e:list) {
			System.out.println(e.getName());
		}
			break;
			
		case 3:Collections.sort(list,new SortEmployeeBySalary());
		for(Employee e:list) {
			System.out.println(e.getSalary());
		}
			break;
			
		case 4:Collections.sort(list,new SortEmployeeById());
		for(Employee e:list) {
			System.out.println(e.getId());
		}
			break;
			
			default:
				try {
					throw new InvalidChoiceException("Invalid choice");
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
				
		}
		
	}

	@Override
	public void findEmployeeWithHighSalary() {
		List<Employee> l=new ArrayList<Employee>();
		Set<String> keys=eb.keySet();
		for(String key:keys) {
			l.add(eb.get(key));
		}
		Collections.sort(l,new SortEmployeeBySalary());
		System.out.println("Employee with highest salary:");
		System.out.println(l.get(l.size()-1));
		
	}

	@Override
	public void findEmployeeWithLowSalary() {
		List<Employee> l=new ArrayList<Employee>();
		Set<String> keys=eb.keySet();
		for(String key:keys) {
			l.add(eb.get(key));
		}
		Collections.sort(l,new SortEmployeeBySalary());
		System.out.println("Student with lowest Salary:");
		System.out.println(l.get(0));
		
	}

}
