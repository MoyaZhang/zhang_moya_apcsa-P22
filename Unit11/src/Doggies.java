//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog [size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds	
		if (spot < pups.length) {
			pups [spot] = new Dog (age, name);
		}
	}

	public String getNameOfOldest()
	{
		Dog oldest = pups [0];
		
		if (pups.length > 0) {
			for (Dog pup: pups) {
				if (pup.getAge() > oldest.getAge()) {
					oldest = pup;
				}
			}
			return oldest.getName();
		}
		
		return null;
		
	}

	public String getNameOfYoungest()
	{
		Dog youngest = pups [0];
		
		if (pups.length > 0) {
			for (Dog pup: pups) {
				if (pup.getAge() < youngest.getAge()) {
					youngest = pup;
				}
			}
			return youngest.getName();
		}
		
		return null;
		
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}