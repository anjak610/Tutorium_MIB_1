package Aufgabe_9;

public class Kunde extends Person{
	
	Arzt behandelnderArzt = new Arzt();	
	Arzt vergleich = new Arzt();
	
	public boolean arztVerdientMehrAls(Kunde K)
	{
		if(behandelnderArzt.gehalt > vergleich.gehalt)
		{		
			return true;
		}
		else
		{
			return false;
		}
	}

}
