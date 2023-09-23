package hw2;

//第一題
public class hw0901 {
	public static void main(String[] args) {
		int sum = 0;
		for (int count = 1; count <=1000; count++) {
			if (count % 2 == 1) {
				continue;
			}
			sum += count;
		}
		System.out.println("第一題:"+sum);
		System.out.println("============");
//第二題
		int mul = 1;
		for (int num = 1; num <= 10; num++) {
			mul = mul * num;
		}
		System.out.println("第二題:" + mul);
		System.out.println("============");
//第三題
		int mult =1;
		int number =1;
		while(number<=10) {
			mult= mult*number;
			number++;
		}
		System.out.println("第三題:"+ mult);
		System.out.println("============");
//第四題
		System.out.println("第四題:");
		int y = 0 ;              
		for(int a=1;y<100;a++) {              //為啥不是<=100
			y=(int)Math.pow(a,2);
			System.out.print( y +" ");
	}
		System.out.println("\n============");
//第五題
		System.out.println("第五題:");
		for (int z = 1; z <= 49; z++) {
			String yyy = String.valueOf(z);
			if (yyy.contains("4")) {
				continue;
			}
			System.out.print(yyy + " ");
		}
	
//		int total = 0;
//		for (int a=1 ; a <=49 ; a++) {
//			int x = a % 10;
//			if (x==4) {
//				continue;		
//			} else if (40 <= a && a<=49 ) {
//				continue;
//			}else {
//				  System.out.print(a + " ") ;
//			  }
//	    }
		System.out.println("\n============");
//第六題
		System.out.println("第六題:");
		for (int o =10; o >=1 ;o--) {
			for (int i = 1; i<=o ; i++ ) {
				System.out.print(i +" ");
			}
			System.out.println();
		}
		System.out.println("\n============");
//第七題
		System.out.println("第七題:");
		for (int a =1; a <=6 ;a++) {
			for (int b = 1; b<=a ; b++ ) {
				System.out.print((char)(64 + a));
			}
			System.out.println();
		}
	}
}

