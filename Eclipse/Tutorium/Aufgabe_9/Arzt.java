package Aufgabe_9;

public class Arzt extends Mitarbeiter {

	public int buerozimmernummer;
	public int rang;
	
	public String anrede() {

		if (super.geschlecht == true && rang == 0) {
			return ("AIP " + super.vorname + super.nachname);
		}

		if (super.geschlecht == true && rang == 1) {
			return ("Fach�rzting" + super.vorname + super.nachname);
		}
		if (super.geschlecht == true && rang == 2) {
			return ("Ober�rztin" + super.vorname + super.nachname);
		}
		if (super.geschlecht == true && rang == 3) {
			return ("Chef�rztin" + super.vorname + super.nachname);
		}

		if (super.geschlecht == false && rang == 0) {
			return ("AIP " + super.vorname + super.nachname);
		}
		if (super.geschlecht == false && rang == 1) {
			return ("Facharzt " + super.vorname + super.nachname);
		}
		if (super.geschlecht == false && rang == 2) {
			return ("Oberarzt " + super.vorname + super.nachname);
		}
		if (super.geschlecht == false && rang == 3) {
			return ("Chefarzt" + super.vorname + super.nachname);
		}
		else 
		{
			return null;
		}

	}

}
