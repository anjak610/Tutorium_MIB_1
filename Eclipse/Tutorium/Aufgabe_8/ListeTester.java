package Aufgabe_8;

public class ListeTester {
	
	public static void main(String[]args)
	{
		Liste x = new Liste(3);
		//System.out.println(x);
		System.out.println(x.element);
		x.hinzufügen(5);
		System.out.println(x.nachfolger.element);
		x.hinzufügen(4);
		System.out.println(x.nachfolger.nachfolger.element);
		x.hinzufügen(7);
		System.out.println(x.nachfolger.nachfolger.nachfolger.element);
		x.hinzufügen(6);
		
		//x.entfernen();
		System.out.println(x.toString());
		System.out.println(x.laenge());
		System.out.println(x.summe());	
		
			
	
		
	}
}
