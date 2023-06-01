package inneerclass;

abstract class Person{
	abstract void eat();
}
class Tom extends Person{
	void eat() {
		System.out.println("Tom is eating");
	}
}
public class Solution {

	public static void main(String[] args) {
		Tom t=new Tom();
		t.eat();//conventional way

		System.out.println("-------------------");

		Person p=new Person() {
			void eat() {
				System.out.println("Person class implementation using anonymous class");
			}
		};
		p.eat();

	}

}
