package day1;
class Student1 {
	String name;
	int marks;
	public Student1(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
	}
public class MainStudent {
public static void main(String[] args) {
		Student1 s1=new Student1("tom",50);
		Student1 s2=new Student1("jack",70);
		Student1 s3=new Student1("Jerry",90);
		Student1 s4=new Student1("merry",60);
		Student1 stu[]= {s1,s2,s3,s4};
		Student1 max=stu[0];
	for(int i=0;i<stu.length;i++) {
		if(max.marks<stu[i].marks) {
			max=stu[i];
			}
	}
	System.out.println("name of student who scored highest marks is:"+max.name);
		}

}
