package Aufgabe_9;

public class Test {
	
	public static void main(String args[]) {
	      Person a = new Person();   
	      Arzt b = new Arzt(); 
	      Arzt c = new Arzt();
	      Krankenpfleger k = new Krankenpfleger();
	      Mitarbeiter m = new Mitarbeiter();
	      Kunde f = new Kunde();
	      gesetzlicherVersicheter g = new gesetzlicherVersicheter();
	      
	      a.geschlecht = false;
	      a.vorname= "J�rg ";
	      a.nachname="R�der ";
	      
	      c.geschlecht = true;
	      c.rang = 3;
	      c.vorname = "Helena ";
	      c.nachname = "Heller";
	      c.gehalt = 1000;	     
	      
	      b.geschlecht = false;
	      b.rang = 2;
	      b.vorname = "Martin ";
	      b.nachname = "M�ller";
	      b.gehalt = 500;
	      
	      k.geschlecht = true;
	      k.vorname = "Jana ";
	      k.nachname="Bauer";
	      k.gehalt = 100;
	      
	      f.geschlecht = true;
	      f.vorname = "Maria ";
	      f.nachname = "Schmidt ";
	      f.behandelnderArzt = c;
	      f.vergleich = b;
	      
	            
	      System.out.println(a.anrede());   
	      System.out.println(b.anrede()); 
	      System.out.println(c.anrede()); 
	      System.out.println(k.anrede()); 
	      System.out.println(k.formloseAnrede());	      
	      System.out.println(f.anrede());
	      System.out.println(b.verdientMehrals(c));   
	      System.out.println(f.arztVerdientMehrAls(f));
	    
	   }
	

}
