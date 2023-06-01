package lambdaexpression;

@FunctionalInterface
interface Amazon{
	void purchase(String name);
}

//conventional way
class Tom implements Amazon{
	@Override
	public void purchase(String name) {
		System.out.println("Purchasing "+name);
	}
}
public class Example {

	public static void main(String[] args) {
		
		//1.by having explicit implementation class
		
		Tom t=new Tom();
		t.purchase("laptop");
		
		System.out.println("------------");
		
		//2.Anonymous inner class
		
		Amazon amazon=new Amazon() {
			public void purchase(String name) {
				System.out.println("Purchasing "+name);
		}
			};
			amazon.purchase("laptop");
			
			System.out.println("-----------");
			
			
			//3.LambdaExpression
			Amazon a=(name)->{
				System.out.println("Purchasing "+name);
			};
			
			a.purchase("laptop");

	}

}
