package com;

import java.util.Comparator;

public class SortStudentByAge implements Comparator<Student> {
@Override
public int compare(Student x,Student y) {
	return x.age-y.age;//ascending order 
}
}
//x=object to be inserted & y=already existing object
//for descending order y.age-x.age