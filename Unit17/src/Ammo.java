//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		super (x,y);
	}

	public Ammo(int x, int y, int s)
	{
		super(x,y);
		setSpeed(s);
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		//add code to draw the ammo
		window.setColor(Color.YELLOW);
		window.fillRect(getX(), getY(), 4, 4);
	}
	
	
	public void move( String direction )
	{
		//add code to draw the ammo
		if (direction.contentEquals("UP")){
			super.setY(getY() - speed);
		}
		if (direction.contentEquals("DOWN")) {
			super.setY(getY() + speed);
		}
		if (direction.contentEquals("RIGHT")) {
			super.setX(getX() + speed);
		}
		if (direction.contentEquals("LEFT")) {
			super.setX(getX() - speed);
		}
	}

	public String toString()
	{
		return "";
	}
}
