//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class WordPrinter
{
	//instance variables and constructors could be present, but are not necessary
	private String w;
	private int num;
	
	public WordPrinter() {
		setPrintWord ("", 0);
	}
	
	public WordPrinter(String word, int times) {
		setPrintWord (word, times);
	}
	
	public void setPrintWord(String word, int times) {
		w = word;
		num = times;
	}
	
	public static void printWord(String word, int times)
	{
		for (int i = 0; i < times; i++) {
			System.out.println(word);
		}
	}
}