package day1;
abstract class Person
{
	abstract void walk();
}
class Tom extends Person{ //we need to follow contract of abstraction
	@Override
	void walk() {
		System.out.println("tom is walking");
	}
}
public class MainClass {

	public static void main(String[] args) {
		Tom t=new Tom();
		t.walk();

	}

}
