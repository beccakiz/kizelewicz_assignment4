package kizelewicz_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI2 
{
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
		SecureRandom random = new SecureRandom();
		int x = random.nextInt(4) + 1;
		
		switch(x)
		{
		case 1: 
			System.out.println("Very good!");
			break;
		case 2:
			System.out.println("Excellent!");
			break;
		case 3:
			System.out.println("Nice work!");
			break;
		case 4:
			System.out.println("Keep up the good work!");
			break;
		}
	}
	
	public static void displayIncorrectResponse()
	{
		SecureRandom random = new SecureRandom();
		int x = random.nextInt(4) + 1;
		
		switch(x)
		{
		case 1: 
			System.out.println("No. Please try again.");
			break;
		case 2:
			System.out.println("Wrong. Try once more.");
			break;
		case 3:
			System.out.println("Don't give up!");
			break;
		case 4:
			System.out.println("No. Keep trying.");
			break;
		}
	}
	
	public static void main(String[] args)
	{
		quiz();
	}
}