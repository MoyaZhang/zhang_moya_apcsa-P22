//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		Scanner keyboard = new Scanner(System.in);
		out.print ("Enter a whole number :: ");
		int number = keyboard.nextInt();
		
		System.out.println(number + " is odd :: " + NumberVerify.isOdd(number));
		System.out.println(number +" is even :: " + NumberVerify.isEven(number));
		System.out.println();
		
		//add in more test cases
		System.out.println("111 is odd :: " + NumberVerify.isOdd(111));
		System.out.println("111 is even :: " + NumberVerify.isEven(111));
		System.out.println();
		
		System.out.println("2000 is odd :: " + NumberVerify.isOdd(2000));
		System.out.println("2000 is even :: " + NumberVerify.isEven(2000));
		System.out.println();
		
		System.out.println("-99 is odd :: " + NumberVerify.isOdd(-99));
		System.out.println("-99 is even :: " + NumberVerify.isEven(-99));
		System.out.println();
		
		System.out.println("1111 is odd :: " + NumberVerify.isOdd(1111));
		System.out.println("1111 is even :: " + NumberVerify.isEven(1111));
		System.out.println();
		
		System.out.println("-850 is odd :: " + NumberVerify.isOdd(-850));
		System.out.println("-850 is even :: " + NumberVerify.isEven(-850));
		System.out.println();
	}
}