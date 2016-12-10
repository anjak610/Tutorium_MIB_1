
public class Aufgabe6_1 {

	public static void main(String[] args) {
		int p [] [] = Picture.load("C:/Users/Beyza/workspace/Aufgabe6/grafik.jpg");
		//p = rect(p,30,70,250,160); 					// Größe vom Rechteckt
		p = horizontal (p);
		Picture.show(p);
		
	}	
	
	public static int [][] rect(int[][] p,int x1,int y1,int x2,int y2){
		
		int width = x2-x1;
		int heigth = y2-y1;
		
		for (int a=30 ; a < heigth; a++){			// Anfang vom Rechteck
			for (int b=70 ; b < width; b++){		// 
				p [x1+b] [y1+a] = 0;
			}
		}
			return p;
	}
	
	public static int [][] horizontal(int [][] p){
		int c;
		for (int a = 0; a < p[0].length; a++){		// y-wert
			for (int b = 0; b < p.length/2; b++){	// x-wert
				c = p[b] [a];						// ich Speichere (0/0) als c ab
				p[b][a] = p[p.length-1-b][a];		// ich vertausche (0/0) mit (5/0)
				p[p.length-1-b][a] = c;				// ich vertausche (5/0) mit c 
			}
		}
			return p;
	}
	}
	

