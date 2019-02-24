//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter(' ');
		amount = 0;
		
	}

	public TriangleFive(char c, int amt)
	{
		setLetter (c);
		setAmount (amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}
	
	public String toString()
	{
		char l = letter;
		int a = amount;
		String output = "";
		
		for (int k = a; k > 0; k--) {
			for (int i = 0; i < k; i++) {
				for (int j = a; j > i; j--) {
					output += l;
				}
				output += " ";
				l += 1;
				if (l > 'Z') {
					l = 'A';
				}
			}
			l = letter;
			output += "\n";
		}
			
		return output;
	}
}