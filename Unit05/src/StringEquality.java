//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Moya Zhang
//Date - 2/12/2019
//Class - Period 2
//Lab  - String Equality

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality()
	{
		wordOne = "";
		wordTwo = "";
	}

	public StringEquality(String one, String two)
	{
		setWords(one, two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkEquality( )
	{
		if (wordOne.equals(wordTwo)){
			return true;
		}
		return false;
	}

	public String toString()
	{
		if (checkEquality()) {
			return wordOne + " has the same letters as " + wordTwo + "\n";
		}
		return wordOne + " does not have the same letters as " + wordTwo + "\n";
	}
}