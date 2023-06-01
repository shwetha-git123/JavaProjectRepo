package day2;
interface Mobile{
	int id=101;//public static final int id=101;
	void call();//public void call();
}
class Tom implements Mobile{
	public void call() {
		System.out.println("calling jerry");
	}
}
public class Solution {

	public static void main(String[] args) {
		Tom t=new Tom();
		t.call();
		System.out.println("Id is:"+Mobile.id);

	}

}
/*
 * contract of abstraction is to override the abstract method in the implemented class
 * or else make the implemented class as abstract/
 */