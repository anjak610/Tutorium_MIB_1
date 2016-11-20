
public class Aufgabe5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		fibonacci(n);
		System.out.println(fibonacci(n));
	}

	public static int fibonacci(int n) {
		if (n == 0)
			return 1;
		if (n == 1)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
		// in der letzten Zeile rechnet es das Ergebnis aus.

	}
}
