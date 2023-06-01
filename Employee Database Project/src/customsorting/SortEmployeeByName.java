package customsorting;

import java.util.Comparator;

import edbms.Employee;

public class SortEmployeeByName implements Comparator<Employee>{

	@Override
	public int compare(Employee x, Employee y) {
		String s1=x.getName();
		String s2=y.getName();
		return s1.compareTo(s2);
	}

}

