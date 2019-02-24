//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers ("");
		compChoice = "";
	}

	public RockPaperScissors(String player)
	{
		setPlayers (player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		
		String [] RPS = new String [] {"R", "P", "S"};
		int i = (int)(Math.random() * 3);
		compChoice = RPS[i];
	}

	public String determineWinner()
	{
		String winner="";
		if (playChoice.equals(compChoice)) {
			winner = "!Draw Game!";
		}
		else if ((playChoice.equals("R")&&compChoice.equals("S"))||
				(playChoice.equals("S")&&compChoice.equals("P"))||
				(compChoice.equals("R")&&playChoice.equals("P"))){
			winner = "!Player wins ";
		}
		else if ((playChoice.equals("S")&&compChoice.equals("R"))||
				(playChoice.equals("P")&&compChoice.equals("S"))||
				(compChoice.equals("P")&&playChoice.equals("R"))){
			winner = "!Computer wins ";
		}
		
		return winner;
	}

	public String toString()
	{
		String output="player had " +playChoice +"\ncomputer had " +compChoice + "\n" + determineWinner();
		if ((playChoice.equals("R")&&compChoice.equals("S"))||
			(playChoice.equals("S")&&compChoice.equals("R"))){
			output += "<<Rock Breaks Scissors>>!";
		}
		
		else if ((playChoice.equals("S")&&compChoice.equals("P"))||
				(playChoice.equals("P")&&compChoice.equals("S"))){
				output += "<<Scissors Cuts Paper>>!";
			}
			
		else if ((playChoice.equals("R")&&compChoice.equals("P"))||
				(playChoice.equals("P")&&compChoice.equals("R"))){
				output += "<<Paper Covers Rock>>!";
			}
		return output;
	}
}