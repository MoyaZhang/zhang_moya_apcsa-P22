//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	private boolean isPythagorean(int a, int b, int c) 
	{
		return (a*a)+(b*b)==(c*c);
	}
	
	private boolean oddEven(int a, int b, int c) 
	{
		return (a%2!=b%2)&&(c%2==1);
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		
		int smallest = Math.min(c, Math.min(a, b));
		
		for (int i = smallest; i>1;i--) {
			if ((a%i==0)&&(b%i==0)&&(c%i==0)){
				return i;
			}
		}
		return 1;
	}
	
	private String checkTriples () {
		
		String triples = "";
		
		for (int a=1; a<=number-2;a++) {
			for (int b=a+1; b <= number-1;b++) {
				for (int c=a+2;c<=number;c++) {
					if (isPythagorean(a,b,c) && oddEven(a,b,c) && (greatestCommonFactor(a,b,c) ==1)) {
						triples += a +" " + b + " " + c + "\n";
					}
				}
			}
		}
		return triples;
		
	}

	public String toString()
	{
		String output=checkTriples();

		return output + "\n";
	}
}