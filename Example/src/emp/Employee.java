package emp;

public class Employee {
	String id;
	static int count=101;//consider a counter variable

	Employee(){
		this.id="JSP"+count;//initialize id

		count++;//increment counter variable
	}
	public static void main(String[] args) {

		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		
		System.out.println(e1.id);
		System.out.println(e2.id);
		System.out.println(e3.id);
	}

}
