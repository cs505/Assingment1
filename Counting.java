import java.util.Scanner;
public class Counting 
{
		public static void main(String args[]){
			Scanner s=new Scanner(System.in);
			int cnt=0;
			int arr[] = new int[50]; 
			System.out.println("enter 9999 to stop : ");
			for(int i=0;true;i++){
				arr[i]=s.nextInt();
				if(arr[i]==9999)
				break;
				if(arr[i]>=50)
				cnt++;
				
			}
			System.out.println("numbers entered >=  50 : "+cnt);
		}
}
		