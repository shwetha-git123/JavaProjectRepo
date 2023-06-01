package day2;
interface Swiggy{
	int id=10;
	void orderFood();
	void cancelFood();
}
class Customer implements Swiggy{
	public void orderFood() {
		System.out.println("Ordering Dahi poori,ice-cream,masala-dosa ");
	}
	public void cancelFood() {
		System.out.println("ordered food is cancled");
	}
}
public class MainSwiggy {

	public static void main(String[] args) {
		Customer c=new Customer();
		System.out.println("Id of Swiggy interface is:"+Swiggy.id);
		c.orderFood();
		c.cancelFood();

	}

}
