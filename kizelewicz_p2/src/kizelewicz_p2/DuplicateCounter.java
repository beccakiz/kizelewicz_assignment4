package kizelewicz_p2;
import java.util.Map;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.HashMap;
import java.io.IOException;
import java.io.FileWriter;

public class DuplicateCounter {

	Map<String, Integer> wordCounter = new HashMap<>();
	
	public void count(String dataFile)
	{	
		try(Scanner scanner = new Scanner(Paths.get(dataFile)))
		{	
			while(scanner.hasNext())
			{
				String word = scanner.next().toLowerCase();
				//wordCounter.get(input.next());
				int count = 0;
				if(wordCounter.get(word) == null)
				{
					wordCounter.put(word, 1);
				}
				else
				{
					wordCounter.put(word, count + 1);
				}
			}
			scanner.close();
		}
		catch (IOException e)
		{
			System.err.println("Error Processinig File.");
		}
	}
	
	public void write(String outputFile)
	{
		try
		{
			FileWriter newFile = new FileWriter(outputFile);
			
			for(String value : wordCounter.keySet())
				{
					newFile.write(value );
					newFile.write("\n");
				}
			newFile.close();
		}
		catch (IOException e)
		{
			System.err.println("Error Processinig File.");
		}
	}
}
