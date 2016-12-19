package Aufgabe_10;

abstract class Funktion {
	

	
	public abstract double f(double x);	
	
	public double nullstelle(double x, double x2, double z) {
		//System.out.println(x);
		//System.out.println(x2);
		double mitte = (x + x2) / 2;
		
		if (Math.abs(x - x2) < z) {
			return mitte;
		}
		else if (f(x)* f(mitte) < 0) {		//prüfen auf Vorzeichenwechsel	
			return nullstelle(x, mitte, z); // wenn das wahr ist, wird x2 zu mitte
		} else {
			return nullstelle(mitte, x2, z); // wenn das wahr ist, wird x zu mitte
		}

	}
	

}
