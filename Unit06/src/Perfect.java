//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect()
	{
		number=0;
	}

	public Perfect(int num)
	{
		setNumber(num);
	}
	
	//add a set method

	public void setNumber(int num)
	{
		number = num;
	}
	

	public boolean isPerfect()
	{
		int run = 0;
		int sum = 0;
		
		do
		{
			run += 1;
			if (number % run==0) {
				sum+=run;
			}
		}while (run <(number/2));
		
		if (sum==number) {
			return true;
		}
		return false;
	}

	//add a toString	
	
	public String toString() {
		if (isPerfect()) {
			return number + " is perfect.\n";
		}
		return number + " is not perfect.\n";
	}
	
}