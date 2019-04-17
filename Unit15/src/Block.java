//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		xPos = 100;
		yPos = 150;
		width = 10;
		height = 10;
		color = Color.black;
	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y)
	{
		xPos = x;
		yPos = y;
		width = 10;
		height = 10;
		color = Color.black;
	}
	
	public Block(int x, int y, int wid, int ht)
	{
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		color = Color.black;
	}
	
	public Block(int x, int y, int wid, int ht, Color col)
	{
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		color = col;
	}
	
	
   //add the other set methods
   

	   public void setColor(Color col)
	   {
		   color=col;
	   }
	   
	   public void setPos(int x, int y) {
		   setX(x);
		   setY(y);
	   }
	   
	   public void setX(int x) {
		   xPos = x;
	   }
	   
	   public void setY(int y) {
		   yPos = y;
	   }
	   
	   public void setWidth(int w) {
		   width = w;
	   }
	   
	   public void setHeight(int h) {
		   height = h;
	   }

	   public void draw(Graphics window)
	   {
	   	//uncomment after you write the set and get methods
	      window.setColor(color);
	      window.fillRect(getX(), getY(), getWidth(), getHeight());
	   }

	   public void draw(Graphics window, Color col)
	   {
		   window.setColor(col);
		   window.fillRect(getX(), getY(), getWidth(), getHeight());
	   }
	   
		public boolean equals(Object obj)
		{
			Block other = (Block) obj;
			return (xPos == other.getX() && yPos == other.getY() && width == other.getWidth()
					&& height == other.getHeight() && color.equals(other.getColor()));
		}   

	   //add the other get methods
	    public Color getColor() {
	    	return color;
	    }
	    
	    public int getX() {
	    	return xPos;
	    }
	    
	    public int getY() {
	    	return yPos;
	    }
	    
	    public int getWidth() {
	    	return width;
	    }
	    
	    public int getHeight() {
	    	return height;
	    }

	   //add a toString() method  - x , y , width, height, color
	    public String toString() {
	    	return xPos + " " + yPos + " " + width + " " + height + " " + color.toString();
	    }
	}