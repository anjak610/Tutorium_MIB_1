
public class Aufgabe5_2 {

	public static void main(String[] args) {
		System.out.println(Potenz(5));
	} 
	
	public static int Potenz(int n) {
		int a = 1;
		
		for (int i=1; i<=n; i++) {
			a=a*i;
			System.out.println(i);
		}
		return a;
	}

}
