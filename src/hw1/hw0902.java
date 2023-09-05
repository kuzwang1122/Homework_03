package hw1;

//p.62 陣列練習

public class hw0902 {
	public static void main(String[] args) {

// 參考:產生1~10的隨機亂數
//		int r = (int)(Math.random()*10)+1;  // +1目的是為了避免產生0
//		System.out.println(r);
	
// 1.建立三個3x3的陣列
		int[][]x= new int[3][3];
		int[][]y= new int[3][3];
		int[][]z= new int[3][3];
// 2.將亂數資料填入到x陣列
		for(int i=0; i<x.length; i++) {
			for(int j=0; j< x[i].length;j++) {        // 下兩行簡化成第19行
				x[i][j] = (int)(Math.random()*31);  // int r =(int)(Math.random()*31)+1;
			}                                         // x[i][j] = r;
	    }	
// 3.將亂數資料填入到y陣列
		for(int i=0; i<y.length; i++) {
			for(int j=0; j< y[i].length;j++) {        
				y[i][j] = (int)(Math.random()*31);  
			}
		}
// 4.將x跟y對應位置的元素相加放進z陣列
		for(int i=0; i< z.length; i++) {
			for(int j=0; j< z[i].length; j++) {
				z[i][j]= x[i][j] + y[i][j];
			}
		}
		
// 5.將三個陣列的元素列印出來 
		for(int i =0; i<x.length; i++) {              
			for (int j =0 ; j<x[i].length; j++) {
				System.out.print(x[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("=======================");
		
		for(int i =0; i<y.length; i++) {              
			for (int j =0 ; j<y[i].length; j++) {
				System.out.print(y[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("=======================");
		
		for(int i =0; i<z.length; i++) {              
			for (int j =0 ; j<z[i].length; j++) {
				System.out.print(z[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
