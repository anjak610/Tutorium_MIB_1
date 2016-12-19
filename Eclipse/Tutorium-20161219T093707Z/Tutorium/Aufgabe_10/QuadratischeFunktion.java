package Aufgabe_10;

public class QuadratischeFunktion extends Funktion {
	
	public double a;
	public double b;
	public double c;
	
	public QuadratischeFunktion(double newA, double newB, double newC)
	{
		a = newA ;
		b = newB;
		c = newC;		
	}
	
	

	@Override
	public double f(double x) {
		x = a*(x*x)+b*x+c;
		return x;
	}
	
	

}
