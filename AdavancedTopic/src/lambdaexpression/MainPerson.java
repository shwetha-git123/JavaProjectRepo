package lambdaexpression;

interface Person{
	String display(String name,int age);
}
public class MainPerson {
	public static void main(String[] args) {

		Person p=(name,age)->{
			return "Name is "+name+" and age is "+age;
		};
		System.out.println(p.display("raju", 20));
	}
}
