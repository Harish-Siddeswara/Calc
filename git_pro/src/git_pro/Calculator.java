package git_pro;

public class Calculator {

	public static void main(String[] args) {

		System.out.println("This is a Calculator pro");
		int a=22;
		int b=32;
		
		System.out.println("Add: "+add(a,b));
		System.out.println("Sub: "+sub(a,b));
		System.out.println("Mul: "+mul(a,b));
		System.out.println("div: "+div(b,a));
	}

	public static int add(int a,int b)
	{
		int res=a+b;
		return res;
	}
	
	public static int sub(int a,int b)
	{
		int res=a-b;
		return res;
	}
	
	public static int mul(int a,int b)
	{
		int res=a*b;
		return res;
	}
	
	public static int div(int a,int b)
	{
		int res=a/b;
		return res;
	}
}
