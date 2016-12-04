package Aufgabe_9;

public class Test {
	
	public static void main(String args[]) {
	      Person a = new Person();   
	      Arzt b = new Arzt(); 
	      Mitarbeiter m = new Mitarbeiter();
	      
	      
	      
	      a.geschlecht = true;
	      b.geschlecht = true;
	      b.rang[0] = 0;

	      System.out.println( a.anrede());   
	      System.out.println( b.anrede());  
	      System.out.println(m.verdientMehrals(m));
	    
	   }
	

}
