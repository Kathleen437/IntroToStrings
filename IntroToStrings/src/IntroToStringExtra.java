import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class IntroToStringExtra
	{
		static String sentence;

		public static void main(String[] args)
		{
			askName();
			stripSpaces();
			printPyramid();
			
		}
		public static void askName()
		{
			System.out.println("What is your name?");
			Scanner name= new Scanner(System.in);
			String greeting = name.nextLine();
			System.out.println("Hi "+greeting);
			System.out.println(" ");
		}
		
		public static void stripSpaces()
		{
			System.out.println("Please type a sentence that is at minimum 5 words long and no punctuation.");
			Scanner words = new Scanner(System.in);
			String sentence = words.nextLine();
			String after = sentence.replaceAll(" ", "");
			System.out.println(after);
			System.out.println("This sentence has " +sentence.length()+ " characters.");
			System.out.println("This sentence has " +after.length()+ " letters.");
			int counter = 0;
			int consonants = 0;
			for (int i=0; i<sentence.length(); i++)
			{
				switch (sentence.substring(i,i+1))
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
			consonants = after.length()-counter;
				System.out.println("There are " +consonants+ " consonants.");
		}
		
		public static void printPyramid()
		{
			
			String s = "Mullen High School";
			
			for (int i=0; i<s.length(); i++)
				{
					System.out.println(s.substring(0,i+1));
				}
			System.out.println("");
		}
	}
