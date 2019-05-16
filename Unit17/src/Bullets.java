//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class Bullets
{
	private List<Ammo> ammo;

	public Bullets()
	{
		ammo = new ArrayList<Ammo>();
	}

	public void add(Ammo am)
	{
		ammo.add(am);
	}

	//post - draw each Ammo
	public void drawEmAll( Graphics window )
	{
		for (Ammo am: ammo) 
		{
			am.draw(window);
		}
	}

	public void moveEmAll()
	{
		for (Ammo al: ammo)
		{
			al.move("UP");
		}
	}

	public void cleanEmUp(Graphics window)
	{
		for (int i = 0; i < ammo.size(); i++)
		{
			if(ammo.get(i).getY()<-5)
				ammo.get(i).setSpeed(0);
			window.setColor(Color.black);
			window.fillRect(ammo.get(i).getX(),ammo.get(i).getY(),5,7);
			if(ammo.get(i).getSpeed()==0)
			{
				window.setColor(Color.black);
				window.fillRect(ammo.get(i).getX(),ammo.get(i).getY(),5,7);
				ammo.remove(i);
			}
			
		}
	}
	
	public List<Ammo> getList()
	{
		return ammo;
	}

	public String toString()
	{
		return "";
	}
}
