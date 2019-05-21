import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void keepOnlyBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
        pixelObj.setGreen(0);
      }
    }
  }
  
  public void keepOnlyRed()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
        pixelObj.setGreen(0);
      }
    }
  }
  
  public void keepOnlyGreen()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void negate()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(255 - pixelObj.getRed());
        pixelObj.setBlue(255 - pixelObj.getBlue());
        pixelObj.setGreen(255 - pixelObj.getGreen());
      }
    }
  }
  
  public void grayscale()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed((pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen())/3);
        pixelObj.setBlue((pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen())/3);
        pixelObj.setGreen((pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen())/3);
      }
    }
  }
  
  public void fixUnderwater()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(pixelObj.getRed() + 150);
        pixelObj.setBlue(pixelObj.getBlue());
        pixelObj.setGreen(pixelObj.getGreen());
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorVerticalRightLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int height = pixels.length;
    for (int col = 0; col < pixels[0].length; col++)
    {
      for (int row = 0; row < height / 2; row++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[height-1-row][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontalBotToTop()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int height = pixels.length;
    for (int col = 0; col < pixels[0].length; col++)
    {
      for (int row = 0; row < height / 2; row++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[height-1-row][col];
        topPixel.setColor(bottomPixel.getColor());
      }
    } 
  }
  
  public void mirrorDiagonal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel firstPixel = null;
    Pixel secondPixel = null;
    int width = pixels[0].length;
    int height = pixels.length;
    if (width > height) {
    	width = (height - 1);
    }
    else if (width < pixels.length) {
    	height = (width - 1);
    }
    
    for (int row = 0; row < height; row++)
    {
      for (int col = 0; col < width; col++)
      {
        firstPixel = pixels[col][row];
        secondPixel = pixels[row][col];
        secondPixel.setColor(firstPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
    	count++;
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
    System.out.println(count);
  }
  
  public void mirrorArms()
  {
    int mirrorPoint = 194;
    Pixel upPixel = null;
    Pixel downPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 163; row < mirrorPoint; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 100; col < 300; col++)
      {
    	count++;
        upPixel = pixels[row][col];      
        downPixel = pixels[mirrorPoint - row + mirrorPoint] [col];                
        downPixel.setColor(upPixel.getColor());
      }
    }
    System.out.println(count);
  }
  
  public void mirrorGull()
  {
    int mirrorPoint = 355;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 232; row < 330; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 235; col < mirrorPoint; col++)
      {
    	count++;
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row] [mirrorPoint- col + mirrorPoint];                
        rightPixel.setColor(leftPixel.getColor());
      }
    }
    System.out.println(count);
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  public void copy2(Picture fromPic, int startRow, int endRow, int startCol, int endCol)
  {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; 
		  fromRow < fromPixels.length &&
		  toRow < toPixels.length; 
		  fromRow++, toRow++)
		{
			for (int fromCol = 0, toCol = startCol; 
			    fromCol < fromPixels[0].length &&
			    toCol < toPixels[0].length;  
			    fromCol++, toCol++)
				{
				 fromPixel = fromPixels[fromRow][fromCol];
				 toPixel = toPixels[toRow][toCol];
				 toPixel.setColor(fromPixel.getColor());
				}
	 }   
   }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  public void myCollage() {
		Picture flower1 = new Picture("src/images/flower1.jpg");
	    Picture flower2 = new Picture("src/images/flower2.jpg");
	    Picture flower3 = new Picture("src/images/whiteFlower.jpg");
	    this.copy2(flower1, 50, 0, 100, 0);
	    this.copy(flower2,100,0);
	    Picture flowerNegative = new Picture(flower1);
	    flowerNegative.negate();
	    this.copy(flowerNegative,200,0);
	    Picture flowerBlue = new Picture(flower2);
	    flowerBlue.keepOnlyBlue();
	    this.copy(flowerBlue,300,0);
	    Picture flowerMirrored = new Picture(flower3);
	    flowerMirrored.mirrorHorizontal();
	    this.copy(flowerMirrored,400,0);
	    this.copy(flower3,500,0);
	    this.mirrorVertical();
	    this.write("src/images/collage.jpg");
}
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
	  	Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    Pixel[][] pixels = this.getPixels2D();
	    Color rightColor = null;
	    Pixel topPixel = null;
	    Pixel bottomPixel = null;
	    Color bottomColor = null;
	    for (int row = 0; row < pixels.length; row++)
	    {
	      for (int col = 0; 
	           col < pixels[0].length-1; col++)
	      {
	        leftPixel = pixels[row][col];
	        rightPixel = pixels[row][col+1];
	        rightColor = rightPixel.getColor();
	        if (leftPixel.colorDistance(rightColor) > 
	            edgeDist)
	          leftPixel.setColor(Color.BLACK);
	        else
	          leftPixel.setColor(Color.WHITE);
	      }
	    }
	    for (int row = 0; row < pixels.length - 1; row++)
	    {
	    	for (int col = 0; col < pixels[0].length - 1; col++)
	    	{
	    		topPixel = pixels[row][col];
	    		bottomPixel = pixels[row + 1][col];
	    		bottomColor = bottomPixel.getColor();
	    		if (topPixel.colorDistance(bottomColor) > edgeDist)
	    		{
	    			topPixel.setColor(Color.BLACK);
	    		}
	    		else
	    		{
	    			topPixel.setColor(Color.WHITE);
	    		}
	    	}
	    }
	  }
  
  public void edgeDetection2(int edgeDist) {
	  Pixel centerPixel = null;
	  Pixel[][] pixels = this.getPixels2D();
	  int[][] values = new int[pixels.length][pixels[0].length];
	  Pixel compare1 = null;
	  Pixel compare2 = null;
	  Pixel compare3 = null;
	  Color compareColor = null;
	  for (int row = 0; row < pixels.length-1;row++) {
		  for (int col = 1; col < pixels[0].length-2;col++) {
			  centerPixel = pixels[row][col];
			  //compares three lower pixels
			  compare1 = pixels[row+1][col-1];
			  compare2 = pixels[row+1][col];
			  compare3 = pixels[row+1][col+1];
			  compareColor = avgColor(compare1.getColor(), compare2.getColor(), compare3.getColor());
			  if (Pixel.colorDistance(centerPixel.getColor(), compareColor) > edgeDist) {
				  values[row][col] = 1;
			  }
			  else {
			      values[row][col] = 0;
			  }
		  }
	  }
	  for (int row = 1; row < pixels.length-2;row++) {
		  for (int col = 0; col < pixels[0].length-1;col++) {
			  centerPixel = pixels[row][col];
			  //compares three lower pixels
			  compare1 = pixels[row-1][col+1];
			  compare2 = pixels[row][col+1];
			  compare3 = pixels[row+1][col+1];
			  compareColor = avgColor(compare1.getColor(), compare2.getColor(), compare3.getColor());
			  if (Pixel.colorDistance(centerPixel.getColor(), compareColor) > edgeDist) {
				  values[row][col] = 1;
			  }
		  }
	  }
	  for (int i = 0; i < values.length; i++) {
		  for (int j = 0; j < values[0].length; j++) {
			  if (values[i][j] == 1) {
				  pixels[i][j].setColor(Color.BLACK);
			  }
			  else {
				  pixels[i][j].setColor(Color.WHITE);
			  }
		  }
	  }
  }
  
  public void encode(Picture messagePic) {
	  Pixel[][] messagePixels = messagePic.getPixels2D();
	  Pixel[][] currPixels = this.getPixels2D();
	  Pixel currPixel = null;
	  Pixel messagePixel = null;
	  int count = 0;
	  for (int row = 0; row < this.getHeight(); row++)
	  {
		  for (int col = 0; col < this.getWidth(); col++)
		  {
			  currPixel = currPixels[row][col];
			  messagePixel = messagePixels[row][col];
			  if (row % 3 == 0) {
				  int sumr = 0;
				  int red = currPixel.getRed();
				  while (red > 0) {
					  sumr += red % 10;
					  red /= 10;
				  }
				  
				  if (sumr % 2 == 1) {
					  if (currPixel.getRed() % 10 == 9 && (currPixel.getRed() / 10 ) % 10 != 9) {
						  currPixel.setRed(currPixel.getRed() - 1);
					  }
					  else currPixel.setRed(currPixel.getRed() + 1);
				  }
				  
				  if (messagePixel.colorDistance(Color.BLACK)< 50) {
					  if (currPixel.getRed() % 10 == 0 && (currPixel.getRed() / 10 ) % 10 != 0) {
						  currPixel.setRed(currPixel.getRed() + 1);
					  }
					  else currPixel.setRed(currPixel.getRed() - 1);
					  count++;
				  }
			  }
			  else if (row % 3 == 1) {
				  int sumb = 0;
				  int blue = currPixel.getBlue();
				  while (blue > 0) {
					  sumb += blue % 10;
					  blue /= 10;
				  }
				  
				  if (sumb % 2 == 1) {
					  if (currPixel.getBlue() % 10 == 9 && (currPixel.getBlue() / 10 ) % 10 != 9) {
						  currPixel.setBlue(currPixel.getBlue() - 1);
					  }
					  else currPixel.setBlue(currPixel.getBlue() + 1);
				  }
				  
				  if (messagePixel.colorDistance(Color.BLACK)< 50) {
					  if (currPixel.getBlue() % 10 == 0 && (currPixel.getBlue() / 10 ) % 10 != 0) {
						  currPixel.setBlue(currPixel.getBlue() + 1);
					  }
					  else currPixel.setBlue(currPixel.getBlue() - 1);
					  count++;
				  }
				  
				  
			  }
			  else {
				  int sumg = 0;
				  int green = currPixel.getGreen();
				  while (green > 0) {
					  sumg += green % 10;
					  green /= 10;
				  }
				  
				  if (sumg % 2 == 1) {
					  if (currPixel.getGreen() % 10 == 9 && (currPixel.getGreen() / 10 ) % 10 != 9) {
						  currPixel.setGreen(currPixel.getGreen() - 1);
					  }
					  else currPixel.setGreen(currPixel.getGreen() + 1);
				  }
				  
				  if (messagePixel.colorDistance(Color.BLACK)< 50) {
					  if (currPixel.getGreen() % 10 == 0 && (currPixel.getGreen() / 10 ) % 10 != 0) {
						  currPixel.setGreen(currPixel.getGreen() + 1);
					  }
					  else currPixel.setGreen(currPixel.getGreen() - 1);
					  count++;
				  }
			  }
			  
		  }
	  }
		  
	 System.out.println(count);
  }
  
  public Picture decode() {
	  Pixel[][] pixels = this.getPixels2D();
	  int height = this.getHeight();
	  int width = this.getWidth();
	  Pixel currPixel = null;
	  Pixel messagePixel = null;
	  Picture messagePicture = new Picture(height,width);
	  Pixel[][] messagePixels = messagePicture.getPixels2D();
	  int count = 0;
	  for (int row = 0; row < this.getHeight(); row++)
	  {
		  for (int col = 0; col < this.getWidth(); col++)
		  {
			  currPixel = pixels[row][col];
			  messagePixel = messagePixels[row][col];
			  if (row % 3 == 0) {
				  int sumred = 0;
				  int r = currPixel.getRed();
				  while (r > 0) {
					  sumred += (r % 10);
					  r /= 10;
				  }
				  
				  if (sumred % 2 == 1) {
					  messagePixel.setColor(Color.BLACK);
				  }
				  
				  else messagePixel.setColor(Color.WHITE);
			  }
			  else if (row % 3 == 1) {
				  int sumblue = 0;
				  int b = currPixel.getBlue();
				  while (b > 0) {
					  sumblue += (b % 10);
					  b /= 10;
				  }
				  
				  if (sumblue % 2 == 1) {
					  messagePixel.setColor(Color.BLACK);
				  }
				  
				  else messagePixel.setColor(Color.WHITE);
			  }
			  else {
				  int sumgreen = 0;
				  int green = currPixel.getGreen();
				  while (green > 0) {
					  sumgreen += (green % 10);
					  green /= 10;
				  }
				  
				  if (sumgreen % 2 == 1) {
					  messagePixel.setColor(Color.BLACK);
				  }
				  
				  else messagePixel.setColor(Color.WHITE);
			  }
		  }
	  }
	  System.out.println(count);
	  return messagePicture;
  }
  
  public static Color avgColor(Color one, Color two, Color three) {
	  int avgRed = (one.getRed() + two.getRed() + three.getRed())/3;
	  int avgBlue = (one.getBlue() + two.getBlue() + three.getBlue())/3;
	  int avgGreen = (one.getGreen() + two.getGreen() + three.getGreen())/3;
	  return new Color(avgRed, avgGreen, avgBlue);
  }
  
  public static int truncate(int a) {
      if      (a <   0) return 0;
      else if (a > 255) return 255;
      else              return a;
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
