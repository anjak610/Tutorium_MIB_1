package Aufgabe_10;

public class StackTest {
	
	  public static void main(String[] args) {
	      MyStack theStack = new MyStack(); 
	      
	     // theStack.maxSize = 10;
	      
	      theStack.toString();
	      theStack.push("Hund");
	      theStack.push(20);
	      theStack.push(30);
	      theStack.push(40);
	      theStack.push(50);
	      //theStack.pop();
	      //theStack.pop();
	      while (!theStack.isEmpty()) {
	         Object value = theStack.pop();//warum muss das da sein damit, theStack.toString funktioniert???????
	         System.out.print(theStack.toString());
	         //System.out.print(" ");
	      }
	      
	     // System.out.println("");
	   }

}