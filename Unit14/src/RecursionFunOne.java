//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countEvenDigits(int num)
	{
		if (num > 0) {
			if (num % 10 % 2 == 1) {
				return countEvenDigits(num / 10);
			}
			else return 1 +countEvenDigits (num / 10);
		}
		else return 0;
	}
}