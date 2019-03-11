//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(List<Integer> numList)
	{
		int track = 0;
		
		if (numList.size() !=1) {
			for (int i = 0; i < numList.size()-1; i++) {
				if (numList.get(i) <= numList.get (i+1)) {
					track++;
				}
			}
		}
		
		if (track != 0) {
			return false;
		}
		return true;
	}	
}