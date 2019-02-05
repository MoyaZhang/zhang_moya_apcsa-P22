//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Moya Zhang
//Date - 02/04/2019

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double m = (double)(y2 - y1)/(x2 - x1);
		return m;
	}

}