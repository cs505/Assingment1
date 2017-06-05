import java.util.Scanner;

class Fibo
{	int a,b,c;
	Fibo()
	{
		a=0;b=1;c=1;
	};
	void fibo(int x)
	{	
		if (c <= x)
		{
		System.out.print(c + " ");  
		c=a+b;
		a=b;
		b=c;
		fibo(x);
		}
		
	};
}
class Fiborec
{	public static void main(String args[])
	{
		System.out.println("enter limit to print fibonacci series : ");
		Scanner s=new Scanner(System.in);
		Fibo f=new Fibo();
		int a=s.nextInt();
		f.fibo(a);
	}
}