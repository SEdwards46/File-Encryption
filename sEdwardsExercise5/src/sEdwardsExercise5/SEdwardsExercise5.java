/**
 * 
 */
package sEdwardsExercise5;
import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;

/**
 *         @author Shane Edwards
 *         
 *         Due Date: 10/30/2022
 *         
 *         This program reads text from a file, and writes on another file the output 
 *         which is the original word and its encrypted equivalent in all-caps.
 *         
 *         This is completely my own work with the following exceptions: NONE
 *
 */

public class SEdwardsExercise5 {

	public static void main(String [] args) {
		// TODO Auto-generated method stub

		try 
		{
			File myObj = new File("input.in");
			Scanner myReader = new Scanner(myObj);
			PrintWriter pw = new PrintWriter(new FileWriter("results.out"));
			String data;
			String[] words;
			String encrypt;
			int middle;
			
		
		while(myReader.hasNextLine())
		{
			
			data = myReader.nextLine();
			words = data.split(" ",0);
			for(int i = 0; i < words.length; i++)
			{
				middle = words[i].length() / 2;
				if(words[i].length() % 2 == 0)
				{
					encrypt = words[i].substring(middle) + words[i].substring(0,middle);
				}
				else
				{
					encrypt = words[i].substring(middle+1) + words[i].substring(0,middle+1);
				}
				pw.printf("%-30s %-30s %n",words[i],encrypt.toUpperCase());
			
			    
			
			}
		}
		
			myReader.close();
			pw.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Input.in file not found");
			e.printStackTrace();
		}
		catch (IOException e)
		{
			System.out.println("Error is writing in Results.out");
			e.printStackTrace();
		}
		
		try {
		      File myObj = new File("results.out");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
	}
}
	


		
		