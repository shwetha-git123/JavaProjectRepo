
package calsi;

public interface Calculator {
int add(int x,int y);
int sub(int x,int y);
int mul(int x,int y);
int div(int x,int y);
}
class CalculatorImpl implements Calculator{
	@Override
	public int add(int x,int y) {
		return x+y;
	}
	@Override
	public int sub(int x,int y) {
		return x-y;
	}
	@Override
	public int mul(int x,int y) {
		return x*y;
	}
	@Override
	public int div(int x,int y) {
		return x/y;
	}
}
