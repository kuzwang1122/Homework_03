package hw1;

public class hw0831 {
	public static void main(String[] args) {
		//第一題
		int add = 12 + 6 ;
		int mult = 12 * 6 ;
		System.out.println("12與6相加後為:"+ add);
		System.out.println("12與6相乘後為:"+ mult);
	    //第二題
		int egg =200;
		int dozen = egg / 12;
		int count = egg % 12;
		System.out.println("200顆雞蛋為"+dozen+"打又"+count+'顆');
		//第三題
		int totalsec = 256559;
		int day = totalsec / 24 /60 / 60;
		int day_r = totalsec % (24 * 60 * 60); //剩餘秒數計算	
		int hour = day_r / 60 / 60;
		int hour_r = day_r % (60 * 60); //剩餘秒數計算
		int min = hour_r / 60;
		int sec = hour_r % 60; //最終剩餘秒數
		System.out.println("256,559秒為"+day+"天又"+hour+"小時又"+min+"分又"+sec+'秒');
		//第四題
		final double PI = 3.1415;
		int radius = 5;
		double area = radius * radius * PI;
		double cir = radius * 2 * PI;
		System.out.println("半徑為5的圓，面積為:" + area + "，周長為:" + cir );
		//第五題
		int cash = 1_500_000;
		double percent = 0.02;
		double percent_10 = Math.pow(1+percent, 10);
		double deposit = cash*percent_10;
		System.out.printf("deposit = %.2f%n",deposit);
		//第六題
		int a = 5 ;
		int b = 5 ;
		char c = '5';
		String d ="5";
		System.out.println(a+b); //純數值相加
		System.out.println(a+c); //5加上字元代表的數字
		System.out.println(a+d); //數字5與字元串相連
		
		
				

		
		
	}

}
