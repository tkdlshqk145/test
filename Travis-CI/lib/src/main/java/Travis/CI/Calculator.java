package Travis.CI;

public class Calculator {
	
	static int i,j,sum,minus;
	
	
	public static int Sum(int a, int b) {
		i = a;
		j = b;
		sum = i + j;
		return sum;
	}
	
	public static int Minus(int a, int b) {
		i = a;
		j = b;
		minus = i - j;
		return minus; 
	}

}
