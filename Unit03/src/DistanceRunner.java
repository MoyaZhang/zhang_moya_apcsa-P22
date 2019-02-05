//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner (in);
		//add test cases	
		System.out.printf("Enter X1 :: ");
		int x1 = keyboard.nextInt();
		
		System.out.printf("Enter Y1 :: ");
		int y1 = keyboard.nextInt();
		
		System.out.printf("Enter X2 :: ");
		int x2 = keyboard.nextInt();

		System.out.printf("Enter Y2 :: ");
		int y2 = keyboard.nextInt();
		
		Distance distance = new Distance (x1, y1, x2, y2);
		distance.calcDistance();
		distance.print();
	}
}