package p1.p2;

public class Demo {

	public int add(int a,int b)
	{
		return a+b;
	}
	
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	
	public int add(int a,int b,int c,int d,int e)
	{
		return a+b+c+d+e;
	}
	
	public static void main(String[] args) {
		
		Demo obj1=new Demo();
		int sum1=obj1.add(10, 10);
		int sum2=obj1.add(100,1000,200);
		int sum3=obj1.add(100,1000,200,1,2);
		
		System.out.println("Sum is :"+sum1);
		System.out.println("Sum is :"+sum2);
		System.out.println("Sum is :"+sum3);
	}
	
}
