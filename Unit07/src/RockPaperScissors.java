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
		setPlayers("");
		compChoice = "";
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
		compChoice = "";
	}

	public void setPlayers(String player)
	{
		playChoice = player;
	}

	public String determineWinner()
	{
		String winner="";
		return winner;
	}

	public String toString()
	{
		String output="";
		return output;
	}
}