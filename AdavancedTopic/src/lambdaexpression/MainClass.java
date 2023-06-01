package lambdaexpression;

@FunctionalInterface
interface Calculator{
	void add(int x,int y);
}

public class MainClass {

	public static void main(String[] args) {

		Calculator calsi=(x,y)->{
			System.out.println("Sum of "+x+" and "+y+" ="+(x+y));	
		};
		calsi.add(10, 55);
	}
}
