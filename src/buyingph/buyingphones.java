package buyingph;
import java.util.Scanner;
public class buyingphones {
	public static void main(String[] args) {
		System.out.println("Enter the regular price of a phone: ");
		Scanner s = new Scanner(System.in);
		double price = s.nextDouble();
		double p1 =price;
		double p2 = price;
		double p3 = price/2.0;
		System.out.println("Regular price of phone \t Number of phones purchased \t Price per phone");
		System.out.println("\t$"+p1+"\t\t\t"+3+"\t\t\tPhone 1: $"+p1+"\tPhone 2: $"+p2+"\tPhone 3: $"+p3);
		
}}
