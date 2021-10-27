package week3.day1;

public class Calculator {
	
	public void add(int a, int b) {
		int c =a+b;
		System.out.println("add:"+ c);
		
	}
	
	public void sub(double a, double b) {
		double  sub=a-b;
		System.out.println("subtraction:"+sub);
		
	}
	
	public void mul(double d, int b) {
		int  mul1=(int) (d*b);
		System.out.println("multiplication:" + mul1 );
	}
	
	public void mul(int a , double b) {
		double mul2=a*b*b;
		System.out.println("multiply intand  double:"    + mul2);
	}
	
	
	
	
	
	
	
	
	
	
	
	

	
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.add(3, 7);
		obj.sub(9, 6);
		//obj.mul(5,5);
		obj.mul2(3,5,7);
		
		
		
		// TODO Auto-generated method stub

	}

	private void mul2(int i, int j, int k) {
		// TODO Auto-generated method stub
		
	}

	public char[] divide(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

}
