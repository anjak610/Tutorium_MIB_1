
public class Aufgabe_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String wort = "BeyzaReyhanAltintas";
		vorkommen (wort);
}
	public static void vorkommen(String wort) {
		for (int i = 0; i < wort.length(); i++){	
			char a = wort.charAt(i);
			// System.out.println(a);
			
			int zaehler = 0;
			for (int j = 0; j < wort.length(); j++) {
				if (wort.charAt(i) == wort.charAt(j)){
				zaehler = zaehler +1;
			}
			}
			System.out.print(a);
			System.out.println(" " + zaehler);
			}
	}
}



