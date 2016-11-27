package Examples;

public class ParametersToMethods {
	
	public static void main(String [] args)
	{
		int x = 3; // Deklarieren einer Variablen
		WriteX(x); //�bergeben des Wertes x an die Methode 
		System.out.println(x);
	}
	
	private static void WriteX(int x) // Die Methode speichert den Wert dann f�r sich in einen eigenen int mit namen y, kann auch x genannt werden. WICHTIG! Hei�en gleich sind aber unterschiedliche Variablen
	{
		System.out.println(x);
		x++; // wird um eins erh�ht
		System.out.println(x);
	}

}
