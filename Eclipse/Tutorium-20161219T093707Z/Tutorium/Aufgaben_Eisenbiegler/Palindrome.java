package Aufgaben_Eisenbiegler;

public class Palindrome {
	
	public static  String word = "lagertregal";
	
	public static void main (String[] args)
	{	 

		istPalindrom(args);
		System.out.println("Palindrome is"+ "\t" + istPalindrom(args)); 		
	}
	
	
	 public static boolean istPalindrom(String[] words){
		 
		  //String word = "lagregal";
		  char[] letters = word.toCharArray();	
		
	        if(letters.length%2 == 0){
	            for(int i = 0; i < letters.length/2; i++){
	                if(letters[i] != letters[letters.length-i-1]){
	                	//System.out.println(letters[letters.length-i-1]);	                
	                    return false;
	                }
	            }
	        }else{
	            for(int i = 0; i < (letters.length-1)/2; i++){
	                if(letters[i] != letters[letters.length-i-1]){
	                	//System.out.println(letters[letters.length-i-1]);
	                    return false;
	                }
	            }
	        }
	        return true;
	    }
	}


