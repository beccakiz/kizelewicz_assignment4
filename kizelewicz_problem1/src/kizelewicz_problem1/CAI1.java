package kizelewicz_problem1;
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI1 {
	public static void quiz()
	{
		SecureRandom random = new SecureRandom();
		int x = random.nextInt(10);
		int y = random.nextInt(10);
		
		while(true)
		{
			int answer = askQuestion(x , y);
			int response = readResponse();
			boolean correct = isAnswerCorrect(answer, response);
			
			if(correct == true)
			{
				displayCorrectResponse();
				break;
			}
			else
			{
				displayIncorrectResponse();
			}
		}
		
		/*
		 if(correct != true)
		{
			displayIncorrectResponse();
		}
		else
		{
		displayCorrectResponse();
		}
		 */
	}
	
	public static int askQuestion(int x, int y)
	{
		System.out.print("How much is " + x);
		System.out.println(" times " + y + "?");
		return x * y;
	}
	
	public static int readResponse()
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		//removed because it breaks it when looping through again
		//scan.close();
		return num;
	}
	
	public static boolean isAnswerCorrect(int answer, int response)
	{
		if(answer != response)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public static void displayCorrectResponse()
	{
		System.out.println("Very good!");
	}
	
	public static void displayIncorrectResponse()
	{
		System.out.println("No. Please try again.");
	}
	
	public static void main(String[] args)
	{
		quiz();
	}
}
