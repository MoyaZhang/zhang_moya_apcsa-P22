package u12;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}
	
	public String getWord() {
		return word;
	}

	public int compareTo( Word rhs )
	{		
		if (word.length () != rhs.getWord().length()) {
			if (word.length () > rhs.getWord().length()) {
				return 1;
			}
			else return -1;
		}

		else {
			char [] wordlets = word.toCharArray();
			char [] rhslets = rhs.getWord().toCharArray();
			for (int i = 0; i < wordlets.length; i++) {
				if (wordlets[i] > rhslets[i]) {
					return 1;
				}
				else if (wordlets[i] < rhslets[i]) {
					return -1;
				}
			}
			return 0;
		}
	}

	public String toString()
	{
		return word;
	}
}