import java.util.Scanner;

class Fact1
{	int res;
	Fact1()
	{
		res=1;
	};
	void fact(int x)
	{	
		if (x>=1)
		{ res=res*x;
			fact(x-1);
		}
		else
		System.out.println(res);
				
	}
}
class Factorial
{	public static void main(String args[])
	{
		System.out.println("enter the number to calculate factorial : ");
		Scanner s=new Scanner(System.in);
		Fact1 f=new Fact1();
		int a=s.nextInt();
		f.fact(a);
	}
}