package Aufgabe_10;

//import java.util.ArrayList;


public class MyStack{
	
	public int maxSize;
	private Object[] StackArray;
	private int top;


	public MyStack() {//int s
	      maxSize = 10;
	      StackArray = new Object[maxSize];
	      top = 0;
	      
	   }
	   public void push(Object j) {
	      StackArray[++top] = j;
	   }
	   public Object pop() {
	      return StackArray[top--];
	   }
	   public Object peek() {
	      return StackArray[top];
	   }
	   public boolean isEmpty() {
	      return (top == 0);
	   }
	   public boolean isFull() {
	      return (top == maxSize - 1);
	   }

	   
	  public String toString()
	  {
		String s = "";
		s += StackArray[top+1] + ",";
		return s;		  
	  }
	  
	 
	 
	}