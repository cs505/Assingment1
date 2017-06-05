import java.util.Scanner;

class CharToNumber
{	public static void main(String args[])
	{
		System.out.println("enter string : ");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int asc;
		for(int i=0;i<str.length();i++)
		{	asc=str.charAt(i);
			System.out.println((str.charAt(i)) +" = "+asc);
		}
	}
}
		