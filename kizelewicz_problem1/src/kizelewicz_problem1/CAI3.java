package kizelewicz_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI3
{
	public static void quiz()
	{
		SecureRandom random = new SecureRandom();

		int i = 0;
		int right = 0;
		int wrong = 0;
		
		while(i < 10)
		{
				int x = random.nextInt(10);
				int y = random.nextInt(10);
				int answer = askQuestion(x , y);
				int response = readResponse();
				boolean correct = isAnswerCorrect(answer, response);
			
				if(correct == true)
				{
					displayCorrectResponse();
					right++;
				}
				else
				{
					displayIncorrectResponse();
					wrong++;
				}
			i++;
		}
		
		displayCompletionMessage(right, wrong);
		
		System.out.println("Would you like to solve a new problem set?");
		System.out.println("Press 1 for yes. Press 2 for no.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num == 1)
		{
			quiz();
		}
		else
		{
			System.exit(0);
			//System.out.println("");
		}
	}
	
	public static int askQuestion(int x, int y)
	{
		System.out.println("How much is " + x + " times " + y + "?");
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
	
	public static void displayCompletionMessage(int right, int wrong)
	{
		//print out student score and score response
		double percent;
		percent = ((double)right / 10) * 100;
		System.out.println(percent);
		
		if(percent < 75.0)
		{
			System.out.println("Please ask your teacher for extra help.");
		}
		else
		{
			System.out.println("Congratulations, you are ready to go to the next level!");
		}
		
	}
	
	public static void main(String[] args)
	{
		quiz();
	}
}