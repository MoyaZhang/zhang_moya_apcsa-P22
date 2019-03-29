//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class MatrixCount1Runner
{
	public static void main( String args[] ) throws Exception
	{
		//add code
		System.out.println("Matrix values");
		System.out.println(MatrixCount1.print());
		
		for (int i : new int [] {7,8,6,21}) {
			System.out.print ("The " + i + " count is :: ");
			System.out.print(MatrixCount1.count(i));
			System.out.println();
		}
		
	}
}


