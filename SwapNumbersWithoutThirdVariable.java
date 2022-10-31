package swapnumbers;

public class SwapNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		
			int a,b;
			a = 5;
			b = 2;
			System.out.println("Before interchanging a="+a+" and b="+b);
			
			a = a+b;
			b = a-b;
			a = a-b;
			System.out.println("After interchanging a="+a+" and b="+b);

	}

}
