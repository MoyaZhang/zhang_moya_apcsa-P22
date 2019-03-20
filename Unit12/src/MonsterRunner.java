//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.print("Enter Skeleton's (1st monster) name : ");
		String name1 = keyboard.next();
		System.out.print("Enter Skeleton's (1st monster) size : ");
		int size1 = keyboard.nextInt();
		
		//instantiate monster one
		Skeleton one = new Skeleton(name1, size1);
		
		//ask for name and size
		System.out.print("Enter Zombie's (2nd monster) name : ");
		String name2 = keyboard.next();
		System.out.print("Enter Zombie's (2nd monster) size : ");
		int size2 = keyboard.nextInt();
		
		//instantiate monster two
		Zombie two = new Zombie(name2, size2);
		
		System.out.println();
		System.out.println("Skeleton (Monster 1) - " + one);
		System.out.println("Zombie (Monster 2) - " + two);
		System.out.println();
		
		if (one.isSmaller(two)) {
			System.out.println ("Skeleton (Monster one) is smaller than Zombie (Monster two).");
		}
		
		else if (one.isBigger(two)) {
			System.out.println ("Skeleton (Monster one) is bigger than Zombie (Monster two).");
		}
		
		else System.out.println("Skeleton (Monster one) is the same size as Zombie (Monster two).");
		
		if (one.namesTheSame(two)) {
			System.out.println ("Skeleton (Monster one) has the same name as Zombie (Monster two).");
		}
		else System.out.println("Skeleton (Monster one) does not have the same name as Zombie (Monster two).");
		
		
	}
}