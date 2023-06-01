package day2;
import java.util.*;
public class SortStudent {
	public static void main(String[] args) {
		Student s1=new Student(10,"clerk",50);
		Student s2=new Student(20,"turner",80);
		Student s3=new Student(30,"merry",40);
		Student s4=new Student(40,"john",90);
		LinkedHashMap<Integer,Student> map=new LinkedHashMap<Integer,Student>();
		map.put(s1.id, s1);
		map.put(s2.id,s2);
		map.put(s3.id,s3);
		map.put(s4.id, s4);
		TreeSet<Student> t=new TreeSet<Student>();
		Set<Integer> keys=map.keySet();//converting map to set
		for(int key:keys) {
			t.add(map.get(key));//TreeSet calls compareTo() internally
		}
		for(Student s:t) {
			System.out.println(s);
		}
	}
}
