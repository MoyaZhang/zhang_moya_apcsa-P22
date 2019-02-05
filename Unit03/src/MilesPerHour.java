//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Moya Zhang
//Date - 2/5/19
//Class - Period 2
//Lab  - MPH

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums (dist, hrs, mins);
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance= dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		float hours2 = minutes/60f;
		mph = distance/(hours+hours2);
	}

	public void print()
	{
		System.out.println(distance + " miles in " + hours + " and " + minutes + " minutes = " + String.format("%.0f", mph) + " MPH.");
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}