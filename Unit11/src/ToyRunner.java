//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy sry = new Toy ("sorry");
		Toy gijoe = new Toy ("GI Joe");
		
		sry.setCount(1);
		gijoe.setCount(5);
		
		System.out.println(sry);
		System.out.println(gijoe);
	}
}