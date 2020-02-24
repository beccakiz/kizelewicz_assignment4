package kizelewicz_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI5 {
	
	public static void quiz()
	{
		SecureRandom random = new SecureRandom();

		int i = 0;
		int right = 0;
		int wrong = 0;
		int x = 0;
		int y = 0;
		
		System.out.println("Choose a level of diffiiculty: 1, 2, 3, or 4");
		int argument = generateQuestionArgument();
		
		System.out.print("Choose a problem type: ");
		System.out.println("[1] addition [2] multiplication [3] subtraction [4] division [5] all of the above");
		int type = readProblemType();
		
		while(i < 10)
		{	
			if(argument == 1)
			{
			x = random.nextInt(10);
			y = random.nextInt(10);
			}
			else if(argument == 2)
			{
				x = random.nextInt(100);
				y = random.nextInt(100);
			}
			else if(argument == 3)
			{
				x = random.nextInt(1000);
				y = random.nextInt(1000);
			}
			else if(argument == 4)
			{
				x = random.nextInt(10000);
				y = random.nextInt(10000);
			}
				int answer = askQuestion(type , x , y);
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
		}
	}
	
	public static int readDifficulty()
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		return num;
	}
	
	public static int readProblemType()
	{
		//reads the type of problem from student
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		return num;
		
	}
	
	public static int generateQuestionArgument()
	{
		int difficulty = readDifficulty();
		int num = 0;
		
		if(difficulty == 1)
		{
			num = 1;
		}
		else if(difficulty == 2)
		{
			num = 2;
		}
		else if(difficulty == 3)
		{
			num = 3;
		}
		else if(difficulty == 4)
		{
			num = 4;
		}
		return num;
	}
	
	public static int askQuestion(int type, int x, int y)
	{
		int num = 0;
		
		if(type == 1)
		{
			num = addition(x, y);
		}
		else if(type == 2)
		{
			num = multiplication(x, y);
		}
		else if(type == 3)
		{
			num = subtraction(x, y);
		}
		else if(type == 4)
		{
			num = division(x, y);
		}
		else if(type == 5)
		{
			SecureRandom random = new SecureRandom();
			int rand = random.nextInt(4);
			
			switch(rand)
			{
			case 0: 
				addition(x, y);
				break;
			case 1:
				multiplication(x, y);
				break;
			case 2:
				subtraction(x, y);
				break;
			case 3:
				division(x, y);
				break;
			}
		}
			return num;
	}
	
	public static int addition(int x, int y)
	{
		System.out.println("How much is " + x + " plus " + y + "?");
		return x + y;
	}
	
	public static int multiplication(int x, int y)
	{
		System.out.println("How much is " + x + " times " + y + "?");
		return x * y;
	}
	
	public static int subtraction(int x, int y)
	{
		System.out.println("How much is " + x + " minus " + y + "?");
		return x - y;
	}
	
	public static int division(int x, int y)
	{
		System.out.println("How much is " + x + " divided by " + y + "?");
		return x / y;
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