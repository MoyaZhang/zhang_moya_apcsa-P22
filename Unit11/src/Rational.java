//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int num, den;

	//write two constructors
	public Rational () {
		setRational (1,1);
	}
	
	public Rational (int n, int d) {
		setRational (n,d);
	}

	//write a setRational method
	public void setRational (int numerator, int denominator) {
		if (denominator == 0)
			denominator = 1;
		
		if (denominator < 0) {
			numerator = numerator * -1;
			denominator = denominator * -1;
		}
		
		num = numerator;
		den = denominator;
		
		reduce();
	}
	

	//write  a set method for numerator and denominator
	public void setNum (int numerator) {
		num = numerator;
	}
	
	public void setDem (int denominator) {
		den = denominator;
	}

	
	public void add(Rational other)
	{
		
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		  int commonDenominator = den * other.getDenominator();
	      int numerator1 = num * other.getDenominator();
	      int numerator2 = other.getNumerator() * den;
	      int sum = numerator1 + numerator2;

	      new Rational (sum, commonDenominator);
	      reduce();
	      
	}

	private void reduce()
	{
		 if (num != 0)
	      {
	         int common = gcd (Math.abs(num), den);

	         num = num / common;
	         den = den / common;
	      }

	}

	private int gcd(int numOne, int numTwo)
	{
		    if (numTwo == 0) return numOne;
		    return gcd(numTwo,numOne % numTwo);
	
	}

	public Object clone ()
	{
		return "";
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNumerator () {
		return num;
	}
	
	public int getDenominator () {
		return den;
	}
	
	public boolean equals( Object obj)
	{
		 return (num == obj.getNumerator () &&
	               den == obj.getDenominator() );

	}

	public int compareTo(Rational other)
	{


		Rational n= (Rational)other;

	      double thisValue = (double)num / den;
	      double otherValue = (double)n.num / n.den;

	      if (Math.abs(thisValue - otherValue) == 0)
	         return 0;
	      else
	         if (thisValue > otherValue)
	            return 1;
	         else
	            return -1;
	}



	
	//write  toString() method
	public String toString() {
	    return this.num + "/" + this.den + "\n";
	}
	
}