//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int sum = 0;
		int max = ray.get(0);
		int temp = max;
		
		for (int num: ray) {
			if (num > max) {
				sum += num;
				temp = num;
			}
		}
		
		if (ray.size()==0 || max == temp) {
			sum = -1;
		}
		return sum;
	}
}