package hw5;

public class MaxElement {
	public static void main(String[] args) {
		
		 MaxElement Boss =new MaxElement();
		 int[][] intArray= {{1, 6, 3}, {9, 5, 2}};
		 double [] [] doubleArray= {{3.6, 7.09, 3.11}, {9.44, 90.22, 26.55}};
		 System.out.println(Boss.maxElement(intArray));
		 System.out.println(Boss.maxElement(doubleArray));
	}

	public int maxElement(int x[][]) {
		int max=0;
		for (int i=0; i<x.length; i++) {
			for (int j=0; j<x[i].length;j++) {
				if (x[i][j]>max) {
					max=x[i][j];
				}
			}
		}
		return max;
	}
	
	public double maxElement(double x[][]) {
		double max =0;
		for(int a=0;a<x.length;a++) {
			for(int b=0; b<x[a].length;b++) {
				if (x[a][b]>max) {
					max=x[a][b];
				}
			}
		}
		return max;
		
	}
}

