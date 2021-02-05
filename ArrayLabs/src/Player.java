//(c) A+ Computer Science
//www.apluscompsci.com

//Player class 

public class Player
{
	private String name;
	private String choice;

	public Player(String nm)
	{
	} 	
	
	public Player(String name, String choice)
	{
		this.name = name;
		this.choice = choice;
	} 
		
	public void setName( String nm)
	{
		nm = name;
	}	
		
	public void setChoice( String ch )
	{	
		choice = ch;
	}	
		
	public String getChoice()
	{
		return choice;
	}	
		
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		return name+" "+choice;
	}
}