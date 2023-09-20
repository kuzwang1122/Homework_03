package hw4;

public class Hw1 {
	public static void main(String[] args) {
		
		//int a[]= new int[10];
		
		int [] Array = {29,100,39,41,50,8,66,77,95,15};
		int sum = 0;
		for (int a = 0; a < Array.length;a++)
			sum+=Array[a];
		System.out.println("平均值為:"+ sum/Array.length+"\n");
		
		System.out.println("大於平均值的數字:");
		
		for(int a =0; a<Array.length;a++) {
			if (Array[a]>sum/Array.length) {
				System.out.print(Array[a]+" ");
			}
			
		}		
			
	}

}
