//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Moya Zhang
//Date - 2/24/19

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int sum = 0;
		int max = ray[ray.length-1];
		int temp = max;
		
		for (int i = 0; i < ray.length; i++) {
			if (ray[i] > max) {
				sum += ray[i];
				temp = ray[i];
			}
		}
		
		if ((max == temp)||(ray.length==0)) {
			sum = -1;
		}
		return sum;
	}
}