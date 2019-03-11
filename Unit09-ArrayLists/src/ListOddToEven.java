//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int distance = 0;
		int even = -1;
		int odd = -1;
		
		  for (int i = 0; i < ray.size(); i++)
		  {
		    if ((ray.get(i) % 2 == 1) && (odd == -1)) {
		    	odd = i;
		    }
		  }
		  
		  for (int j = ray.size()-1; j>odd; j--) {
		    if ((ray.get(j) % 2 == 0) && (even == -1)) {
		    	even = j;
		    }
		   }
		  
		
		distance = even - odd;
		
		if ((even == -1)||(odd == -1)) {
			distance = -1;
		}
		return distance;
	}
}