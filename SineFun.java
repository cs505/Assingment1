import java.util.Scanner;

class SineFun
{	public static void main(String args[])
	{	Scanner s=new Scanner(System.in);
		Fact f = new Fact();
		System.out.println("enter value to calculate sine function : ");
		double x=s.nextDouble(),sol=0;
		int cntr=1;
		for(int i=1;i<=7;i+=2)
		{	if(cntr%2==0)
				sol=sol-(Math.pow(x,i))/f.fact(i);
			else
				sol=sol+(Math.pow(x,i))/f.fact(i);
			cntr++;
		}
		System.out.println(sol);
	}			
}					
class Fact
{
	int fact(int a)
	{	int res=1;
		for(int i=1;i<=a;i++)
		{
			res=res*i;
		}
		return res;
	}
}