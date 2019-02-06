//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		
		Discount discount = new Discount ();
		double discountamt = discount.getDiscountedBill(amt);
		System.out.println("Bill after discount :: " + String.format("%.2f", discountamt));
	
	}
}