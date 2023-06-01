package customsorting;

import java.util.Comparator;

import edbms.Employee;

public class SortEmployeeBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee x, Employee y) {
		Double d1=x.getSalary();
		Double d2=y.getSalary();
		return d1.compareTo(d2);
		//return x.getSalary().compareTo(y.getSalary());
	}

}
