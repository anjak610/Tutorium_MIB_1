package Aufgabe_9;

public class Personenliste {

	public int anzahl = 1000;
	Person[] personen = new Person[anzahl];
	public boolean[] anwesend = new boolean[anzahl];

	Personenliste() {
		Personenliste Liste = new Personenliste();
	}

	public void hinzufügen(Person pers) {
		for (int i = 0; i <= anzahl; i++) {
			if (personen[i] == null) {
				personen[i] = pers;
				anwesend[i] = false;
			}
		}
	}

	public void entfernen(Person pers) {
		for (int i = 0; i <= anzahl; i++) {
			if (personen[i] == pers) {
				personen[i] = null;
				personen[i + 1] = personen[i];
			}
		}
	}
	
	public void kommt(Person pers)
	{
		for (int i = 0; i <= anzahl; i++) {
			if (personen[i] == pers) {
				anwesend[i] = true;
			}
		}
	}
	
	public void geht (Person pers)
	{
		for (int i = 0; i <= anzahl; i++) {
			if (personen[i] == pers) {
				anwesend[i] = false;
			}
		}
	}
	
	public Arzt findeArzt(String vorname, String nachname)
	{
		Arzt findeA = new Arzt();
		Arzt gefundenA = new Arzt();
		for (int i = 0; i <= anzahl; i++) {
			
			if(vorname.equals(findeA.vorname) && nachname.equals(findeA.nachname))
			{
				gefundenA = findeA;
			}			
		}	
		
		return gefundenA;
	}
}
