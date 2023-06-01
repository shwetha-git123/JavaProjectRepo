package day1;
import java.util.Scanner;
public class MainEmployee {

	public static void main(String[] args) {
		Employee emp=new Employee();
		Scanner s=new Scanner(System.in);
		System.out.println("enter employee id,name,salary");
		emp.setId(s.nextInt());
		emp.setName(s.next());
		emp.setSalary(s.nextDouble());
		System.out.println("Employee id="+emp.getId()+"\nEmployee Name is="+emp.getName()+"\nEmployee Salary="+emp.getSalary());


	}

}

