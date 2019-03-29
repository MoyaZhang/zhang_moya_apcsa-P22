//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	List<Integer> lst = new ArrayList<Integer> ();
		for (int [] i: m) {
			int total = 0;
			for (int j: i) {
				total += j;
			}
			lst.add(total);
		}
		return lst;
    }
}
