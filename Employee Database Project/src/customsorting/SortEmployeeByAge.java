package customsorting;

import java.util.Comparator;

import edbms.Employee;

public class SortEmployeeByAge implements Comparator<Employee> {

	@Override
	public int compare(Employee x, Employee y) {
		
		Integer i=x.getAge();
		Integer j=y.getAge();
		return i.compareTo(j);
		//return x.getAge()-y.getAge();
	}

}
