//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int distance = 0;
		int even = -1;
		int odd = -1;
		
		  for (int i = 0; i<ray.length; i++)
		  {
		    if ((ray[i] % 2 == 1) && (odd == -1)) {
		    	odd = i;
		    	for (int j = odd; j<ray.length; j++) {
		    		if ((ray[j] % 2 == 0) && (even == -1)) {
		    			even = j;
		    		}
		    	}
		    }
		  }  
		
		distance = even - odd;
		
		if ((even == -1)||(odd == -1)) {
			distance = -1;
		}
		return distance;
	}
}