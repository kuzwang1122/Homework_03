package hw1;

//第一題
public class hw0901 {
	public static void main(String[] args) {
		int sum = 0;
		for (int count = 1; count <= 1000; count++) {
			if (count % 2 == 1) {
				continue;
			}
			sum += count;
		}
		System.out.println(sum);
		System.out.println("============");
//第二題
		int mul = 1;
		for (int num = 1; num <= 10; num++) {
			mul = mul * num;
		}
		System.out.println(mul);
		System.out.println("============");
//第三題
		int mult =1;
		int number =1;
		while(number<=10) {
			mult= mult*number;
			number++;
		}
		System.out.println(mult);
		System.out.println("============");
//第四題
//		int a = 1 ;
		int y = 1 ;              //為啥要先定義
		for(int a=1;y<100;a++) { //為啥不是<=100
			y=(int)Math.pow(a,2);
			System.out.print(y+" ");
	}
//第五題
		for (int i=0 ; i <=49 ; i++);{
			int i=0;
			if (i==4;i==14);{
				continue;
				
			}
		}
		
	
}
}