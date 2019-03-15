//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
	private String w;
	
	public TriangleWord() {
		setWord ("");
	}
	
	public TriangleWord (String word) {
		setWord (word);
	}
	
	public void setWord(String word) {
		w = word;
	}
	
	public static void printTriangle(String word)
	{
		String output = "";
		int length = word.length();
		
		for (int k = 0; k < length; k++ ) {
			for (int j = 0; j <= k; j++) {
				for (int i = 0; i <= k; i++) {
					output += word.charAt(i);
				}
			}
			output += "\n";
		}
		System.out.println(output);
	}
}