import java.util.Scanner;

class ReverseDigitInteger
{	public static void main(String args[])
	{ 
		Scanner s=new Scanner(System.in);
		System.out.println("enter number to print its reverse : " );
		int res,a=s.nextInt();
		for(int i=1;a>0;i++)
		{	res=a%10;
			System.out.print(res);
			a=a/10;			
		}
	}
}