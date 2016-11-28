package Aufgaben_Eisenbiegler;

public class Nullstellen {

	public static void main(String[] args) {
		double x = -1;
		double x2 = 20;
		double z = 0.0001;

		System.out.println("Die Nullstelle zwischen " + x + " und " + x2 + " liegt bei " + nullstelle(x, x2, z));
		
	}

	public static double f(double x) {	//Dieser double wert hat NICHT mit dem double wert aus der Main gemeinsam!!!!
		
		return Math.exp(x) + (x * x) - 4;
	}

	public static double nullstelle(double x, double x2, double z) {
		//System.out.println(x);
		//System.out.println(x2);
		double mitte = (x + x2) / 2;
		
		if (Math.abs(x - x2) < z) {
			return mitte;
		}
		else if (f(x)* f(mitte) < 0) {		//pr�fen auf Vorzeichenwechsel	
			return nullstelle(x, mitte, z); // wenn das wahr ist, wird x2 zu mitte
		} else {
			return nullstelle(mitte, x2, z); // wenn das wahr ist, wird x zu mitte
		}

	}

}