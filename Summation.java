import java.util.Scanner;
public class Summation
{
		public static void main(String args[]){
			Scanner s=new Scanner(System.in);
			int sum=0,val; 
			System.out.println("enter integers to add ,9999 to stop : ");
			for(int i=1;true;i++){
				System.out.println("enter val "+ i+" : " );
				val=s.nextInt();
				if(val==9999)
					break;
				sum+=val;
				
			}
			System.out.println("total = "+sum);
		}
}
		