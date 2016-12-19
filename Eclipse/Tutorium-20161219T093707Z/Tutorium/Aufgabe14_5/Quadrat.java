package Aufgabe14_5;

public class Quadrat {

	public static void main(String[] args) {

		int k = 4;
		quadrate(k);
	}

	private static void quadrate(int k) {

		for (int i = 0; i <= k * k - 1; i++) {

			int a = (i % k) + 1;
			int b = (i / k) + 1;

			if (b == 1 || b == k) {
				if (a == 1) {
					System.out.print("\n");
				}
				System.out.print("*");
			}

			/*
			 * if(b == k) { if(a ==1) { System.out.print("\n"); }
			 * System.out.print("*"); }
			 */

			if (b != 1 && b != k) {
				if (a == 1) {
					System.out.print("\n" + "*");
				}
				if (a == k) {
					System.out.print("*");
				}

				if (a != k && a != 1) {
					System.out.print("-");
				}
			}

		}

	}

}
