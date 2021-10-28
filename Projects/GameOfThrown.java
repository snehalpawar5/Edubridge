/* Rock-Paper-Scissors:
It is a two player game and contains three main components Rock, Paper and Scissors.
Each player has these components and simultaneously chooses either Rock, Paper, or Scissors. 
It has some rules like:
1.Rock beats Scissors but loses to Paper.
2.Paper beats Rock but loses to Scissors.
3.Scissors beats Paper but loses to Rock.*/
	
	
import java.util.Scanner;
import java.util.Random;
public class GameOfThrown 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int num;
		String userChoice = "";
		String computerChoice = "";
		
		System.out.println("***** Welcome to Rock, Paper and Scissors! *****");
        int ch;
        System.out.println("Enter yout choice: ");
        ch = sc.nextInt();
      
        switch(ch)
        {
        case 0:
            System.out.println("** Start Your Game **");

        for(int i=0;i<=3; i++)       
        {
		System.out.print("Please choose: R)ock, P(aper, or S)cissors. > ");
        
		
		userChoice = sc.nextLine();
		
		//Computer choice
		num = rand.nextInt(3);
		
		if(num==0)
		{
			computerChoice = "R";
		}
		else if(num==1)
		{
			computerChoice = "P";
		}
		else if(num==2)
		{
			computerChoice = "S";
		}
		
		
		//Print the computer choice
		if(computerChoice.equals("S"))
		{
			System.out.println("The computer chose scissors.");
		}
		else if(computerChoice.equals("R"))
		{
			System.out.println("The computer chose rock.");
		}
		else if(computerChoice.equals("P"))
		{
			System.out.println("The computer chose paper.");
		}
		
		//Determine a winner
		if(userChoice.equals("R") && computerChoice.equals("S"))
		{
			System.out.println("The user won!");
		}
		else if(userChoice.equals("P") && computerChoice.equals("R"))
		{
			System.out.println("The user won!");
		}
		else if(userChoice.equals("S") && computerChoice.equals("P"))
		{
			System.out.println("The user won!");
		}
		
		else if(userChoice.equals("S") && computerChoice.equals("R"))
		{
			System.out.println("The computer won!");
		}
		else if(userChoice.equals("R") && computerChoice.equals("P"))
		{
			System.out.println("The computer won!");
		}
		else if(userChoice.equals("P") && computerChoice.equals("S"))
		{
			System.out.println("The computer won!");
		}
		
		else if(userChoice.equals(computerChoice))
		{
			System.out.println("Tie!");
		}
        }
        
		break;

        case 1:
        	System.out.println("Exit");
        break;
        
        default:
            System.out.println("Invalid Input");
        break;
               }
	 
	}
}

