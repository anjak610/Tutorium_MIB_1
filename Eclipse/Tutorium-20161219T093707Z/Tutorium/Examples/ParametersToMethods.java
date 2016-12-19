package Examples;

public class ParametersToMethods {
	
	public static void main(String [] args)
	{
		int x = 3; // Deklarieren einer Variablen
		WriteX(x); //Übergeben des Wertes x an die Methode 
		System.out.println(x);
	}
	
	private static void WriteX(int x) // Die Methode speichert den Wert dann für sich in einen eigenen int mit namen y, kann auch x genannt werden. WICHTIG! Heißen gleich sind aber unterschiedliche Variablen
	{
		System.out.println(x);
		x++; // wird um eins erhöht
		System.out.println(x);
	}

}
