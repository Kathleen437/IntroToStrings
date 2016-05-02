import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class IntroToStrings
	{
		

		public static void main(String[] args)
			{
				changeToLowerCase();
				changeToVertical();
				countingVowels();
			}
		
		public static void changeToLowerCase()
		{
			System.out.println("Type a sentence in allcaps please.");
			Scanner userInput = new Scanner (System.in);
			String sentence = userInput.nextLine();
			System.out.println(sentence.substring(0,1) + sentence.substring(1).toLowerCase());
			System.out.println(" ");
		}
		
		public static void changeToVertical()
		{
			System.out.println("Printing Vertically.");
			Scanner userInput2 = new Scanner (System.in);
			String sentence2 = userInput2.nextLine();
			
			for (int i=0; i<sentence2.length(); i++)
				{
					System.out.println(sentence2.substring(i, i+1));
				}
		
		}
		public static void countingVowels()
		{
			System.out.println("Type a sentence please");
			Scanner userInput3 = new Scanner (System.in);
			String sentence3 = userInput3.nextLine();
			int counter = 0;
			for (int i=0; i<sentence3.length(); i++)
			{
				switch (sentence3.substring(i,i+1))
				{
					case "A":
					case "a":
						{
							counter++;
							break;
						}
					case "E":
					case "e":
						{
							counter++;
							break;
						}
					case "I":
					case "i":
						{
							counter++;
							break;
						}
					case "O":
					case "o":
						{
							counter++;
							break;
						}
					case "U":
					case "u":
						{
							counter++;
							break;
						}
			}
		}
			if (counter==1)
				{
			System.out.println("There is " +counter+ " vowel.");
				}
			else if (counter>1)
				{
					System.out.println("There are " +counter+ " vowels.");
				}
	}
}