package kizelewicz_p1;
import java.util.Set;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.HashSet;
import java.io.FileWriter;

public class DuplicateRemover {

	Set<String> uniqueWords = new HashSet<String>();
	
	public void remove(String dataFile)
	{
		//eliminate duplicates from the file
		try(Scanner input = new Scanner(Paths.get(dataFile)))
		{
			while(input.hasNext())
			{
				uniqueWords.add(input.next());
			}
			input.close();
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
			
			for(String value : uniqueWords)
				{
					newFile.write(value);
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
