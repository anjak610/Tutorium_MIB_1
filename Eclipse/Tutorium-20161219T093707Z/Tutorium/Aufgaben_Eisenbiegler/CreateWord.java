package Aufgaben_Eisenbiegler;
import java.util.Arrays;

//import java.util.ArrayList;
//import java.util.List;

public class CreateWord {
	
	//public static String NewWord;
	
	public static void main (String[] args)
	{
		String NewWord = null;
		Muster(NewWord);
		System.out.print(Muster(NewWord));
		
	}
	
	public static String Muster (String NewWord)
	{
		
		String SetWord = "Hello";
		char [] letter = SetWord.toCharArray();	
		//System.out.println(letter);
		
		
		
		NewWord = SetWord;
		return NewWord;
		
		
	}
	
	/*public static void muster()
	{
		//List<Character> list = new ArrayList<Character>();
		 String word = "ANNA";
		// char letters[] = words.charAt(i);
		 char[] letters = word.toCharArray();		 
		 	 //System.out.print(letters[2]);		 
		 
		 for(int i = 0; i <= letters.length-1; i++)
		 {	
			 
			 String FirstChar = "";
			 
			 FirstChar = word.substring(0,i+1);
			 char[] FirstCharLetters = FirstChar.toCharArray();			 
			 //System.out.println(FirstCharLetters);
			 
			 if(FirstCharLetters.length != letters.length)
			 {
				
				 System.out.println(FirstCharLetters);
				
				 
				 for(int j = 0; j <= letters.length-1; j++)
				 {
					 //System.out.println(FirstCharLetters);
					 
				 }
				// FirstCharLetters + FirstCharLetters[i];
				//FirstCharLetters. += letters[i]; 
				 //Arrays.fill(FirstCharLetters,FirstCharLetters[i]);
				 //System.out.println(FirstCharLetters);
				 
			 }
			 else 
			 {
				 System.out.println(FirstCharLetters);	 
			 }			
		 }	 
		 
	}*/
}
