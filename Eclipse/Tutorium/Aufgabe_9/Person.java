package Aufgabe_9;


public class Person {
	
	 public String nachname;
	 public String vorname;
	 public boolean geschlecht;
	 
	 public String anrede()
	 {
		 
		 if(geschlecht == true)
		 {
			 return ("Frau " + vorname + nachname);
		 }
		 else
		 {
			 return  ("Herr " + vorname + nachname);
		 }
	 }
	

}


