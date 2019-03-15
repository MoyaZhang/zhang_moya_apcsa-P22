//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		loadToys ("");
	}

	public void loadToys( String toys )
	{
		toyList = new ArrayList<Toy>();
		ArrayList<String> ts = new ArrayList<>(Arrays.asList(toys.split(", ")));
		for(int i = 0; i < ts.size(); i++)
		{
			String name = ts.get(i); 
			Toy t = getThatToy(name);
			
			if (t == null) {
				toyList.add (new Toy (name));
			}
			
			else t.setCount(t.getCount()+1);

		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (Toy t: toyList) {
  			if (t.getName().equals(nm)) {
  				return t;
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		String name = toyList.get(0).getName();
		int max = toyList.get(0).getCount();
		for(Toy t: toyList)
		{
			if(max < t.getCount())
			{
				max = t.getCount();
				name = t.getName();
			}
		}
		return name;
  	}  
  
  	public void sortToysByCount()
  	{
  		
  	}  
  	  
	public String toString()
	{
		return toyList.toString();
	}
}