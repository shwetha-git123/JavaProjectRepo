package com;

import java.util.Comparator;

public class SortEmployeeBySalary implements Comparator<Employee>{
@Override
public int compare(Employee x,Employee y) {
	return x.getSalary().compareTo(y.getSalary());
}
}
