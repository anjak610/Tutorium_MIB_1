package klasuraufgabgen_1;

public class Klausur_F {
	

		public static boolean f(int[] x) {
		int b = x.length / 2;
		for (int i=0; i<b; i++)
		if (x[i] != x[i+b])
		return false;
		return true;
		}
		
		public static void main(String[] args) {
		int x1[] = {1,2,3,1,2,3};
		System.out.println(f(x1));
		int x2[] = {1,2,1,2,1,2};
		System.out.println(f(x2));
		int x3[] = {3,3,3,3};
		System.out.println(f(x3));
		int x4[] = {3,3,3};
		System.out.println(f(x4));
		
		int a = 6;
		int b = 2;
		System.out.println(x1.length);
		}
		

}
