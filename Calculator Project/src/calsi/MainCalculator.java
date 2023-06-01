package calsi;
import java.util.Scanner;
public class MainCalculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Welcome To Calculator Project!");
		Calculator calci=new CalculatorImpl(); //upcasting too achieve abstraction
		while(true) {
			System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
			System.out.println("Enter your choice");
			int choice=s.nextInt();
			int x=0,y=0;
			if(choice>=1&&choice<=4) {
				System.out.println("Enter the first number");
				x=s.nextInt();
				System.out.println("Enter the second number");
				y=s.nextInt();
			}
			switch(choice) {
			case 1:
				System.out.println("Sum of "+x +" and "+y+" is="+calci.add(x, y));
				break;
			case 2:
				System.out.println("Difference of "+x +" and "+y+" is="+calci.add(x, y));
				break;
			case 3:
				System.out.println("Product  of "+x +" and "+y+" is="+calci.add(x, y));
				break;
			case 4:
				System.out.println("Quotient of "+x +" and "+y+" is="+calci.add(x, y));
				break;
			case 5:System.out.println("Thank you!! Visit again");
			System.exit(0);
			break;
			default:
				try {
					throw new InvalidChoiceException("Invalid choice!!!");
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}

}
