package substr;
import java.util.Scanner;
public class substringforkids {

	public static void main(String[] args) {
		System.out.println("SUBSTRING FOR KIDS");
		System.out.println("Enter the string ");
		Scanner s = new Scanner(System.in);
		String st= s.nextLine();
		System.out.println("Enter the value of i ");
		int i= s.nextInt();
		System.out.println("Enter the value of j ");
		int j= s.nextInt();
		substringForKids(i,j,st);
	}
	
	public static void substringForKids(int i,int j, String s) {
		
	   if((i<0)||(j<0)||(j>s.length()))
	   {
		   System.out.println("You gave me invalid numbers");
	   }		
		else if(i==j)
		{
			System.out.println(s.charAt(i));
		}
		else if(i<j)
		{
			for(int k=i;k<=j;k++)
			{
				System.out.print(s.charAt(k));
			}
		}
		else if(i>j)
		{
			System.out.println("You gave me invalid numbers");
		}
		
	}
}

