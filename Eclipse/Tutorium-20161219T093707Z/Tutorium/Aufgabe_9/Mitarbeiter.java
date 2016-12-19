package Aufgabe_9;

public class Mitarbeiter extends Person {
	public int personalnummer;
	public int gehalt;	
	
	//Mitarbeiter a = new Mitarbeiter();
	
	public boolean verdientMehrals(Mitarbeiter vergleichsMitarbeiter)
	{
		if(vergleichsMitarbeiter.gehalt >= gehalt)
		{		
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
