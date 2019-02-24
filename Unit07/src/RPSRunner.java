//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
			do {
		
			out.print("Rock-Paper-Scissors - pick your weapon [R,P,S] :: ");
			String player = keyboard.next();
			
			//read in the player value
		
			RockPaperScissors game = new RockPaperScissors();
			game.setPlayers(player);
			
			out.println(game);
			
			out.print("\nDo you want to play again? ");
			response = keyboard.next().charAt(0);
			
			out.println();
			
			}while (response!=('n')&&response!=('N'));
			
			
	}
}



