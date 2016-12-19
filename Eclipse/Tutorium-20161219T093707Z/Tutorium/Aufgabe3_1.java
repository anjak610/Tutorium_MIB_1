
public class Aufgabe3_1 {

	public static void main(String[] args) {
	int[] a = {0,1,2};
	int[] b = {9,3,4,5,10};
	int[] c = {-1, 0, 1};
	
	System.out.println(summe(a));
	System.out.println(summe(b));
	System.out.println(summe(c));
	}
	public static int summe(int a[]) {
		int sum = 0;
		for (int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		
		return sum;
	}

}
