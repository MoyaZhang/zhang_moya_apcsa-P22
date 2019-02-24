//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   TriangleFive triangle = new TriangleFive();
	   
	   triangle.setAmount(4);
	   triangle.setLetter('C');
	   out.println(triangle);
	   
	   triangle.setAmount(5);
	   triangle.setLetter('A');
	   out.println(triangle);
	   
	   triangle.setAmount(7);
	   triangle.setLetter('B');
	   out.println(triangle);
	   
	   triangle.setAmount(6);
	   triangle.setLetter('X');
	   out.println(triangle);
	   
	   triangle.setAmount(8);
	   triangle.setLetter('Z');
	   out.println(triangle);
	}
}