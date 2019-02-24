//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Moya Zhang

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles (a,b,c,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		double [] nums = new double [] {one, two, three, four};
		double biggest = one;
		
		for (int i = 0; i<nums.length; i++) {
			if (nums[i] > biggest) {
				biggest= nums[i];
			}
		}
		
		return biggest;
	}

	public String toString()
	{
	   return one +" " + two + " " + three + " " + four + "\nbiggest = " + getBiggest() +"\n";

	}
}