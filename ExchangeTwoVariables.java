import java.util.Scanner;

class ExchangeTwoVariables{
		public static void main(String args[]){
			Scanner s = new Scanner(System.in);
			System.out.println("enter val1 :");
			int a=s.nextInt();
			System.out.println("enter val2 :");
			int b=s.nextInt();
			ExchangeTwoVariables e1=new ExchangeTwoVariables();
			e1.swap(a,b);
		}
		void swap(int a,int b){
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("swapped values : "+a+" , " +b);
		}
}