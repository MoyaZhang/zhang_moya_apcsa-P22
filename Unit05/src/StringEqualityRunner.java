//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Moya Zhang
//Date - 2/12/2019
//Class - Period 2
//Lab  - String Equality

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		StringEquality str = new StringEquality();
		
		str.setWords("hello", "goodbye");
		out.println(str);
		
		str.setWords("one", "two");
		out.println(str);
		
		str.setWords("three", "four");
		out.println(str);
		
		str.setWords("TCEA", "UIL");
		out.println(str);
		
		str.setWords("State", "Champions");
		out.println(str);
		
		str.setWords("ABC", "ABC");
		out.println(str);
		
		str.setWords("ABC", "CBA");
		out.println(str);
		
		str.setWords("Same", "Same");
		out.println(str);
		
	}
}