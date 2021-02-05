//(c) A+ Computer Science 
//www.apluscompsci.com

//Computer class 

public class Computer
{
	//instance / member variables
   private String choice;
   
	public Computer()
	{
		//call random set Choice	
		randomSetChoice();
	}
	
	public String getChoice()
	{
		return choice;
	}
	
	public void randomSetChoice()
	{
		//use Math.random()
		//use switch case
		int rnd = (int)(Math.random()*3);
		switch(rnd) {
		case 0 : choice = "rock"; break;
		case 1 : choice = "paper"; break;
		case 2 : choice = "scissors"; break;
		}
	}	
		
	/*
	 didIWin(Player p) will return the following values
	 	0 - both players have the same choice
	 	1 - the computer had the higher ranking choice
	 	-1 - the player had the higher ranking choice
	 */	
	
	public int didIWin(Player p)
	{
		if(choice == p.getChoice()) {
			return 0;
		} else if(choice == "rock" && p.getChoice() == "scissors") {
			return 1;
		} else if(choice == "scissors" && p.getChoice() == "paper") {
			return 1;
		} else if(choice == "paper" && p.getChoice() == "rock") {
			return 1;
		} else if(choice == "rock" && p.getChoice() == "paper") {
			return -1;
		} else if(choice == "scissors" && p.getChoice() == "rock") {
			return -1;
		} else {
			return -1;
		}		
	}
	
	public String toString()
	{
		return choice;
	}		   
}