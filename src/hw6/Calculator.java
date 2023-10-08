package hw6;

import java.util.Scanner;

// 請設計三個類別Calculator.java,CalException.java與CalTest.java,在Calculator.java裡有個自訂
// 方法為powerXY(int x, int y),功能是會計算x的y次方並回傳結果。 CalTest.java執行後,使用者可
// 以輸入x與y的值,請加入例外處理機制,讓程式能解決以下狀況:

public class Calculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("請輸入基數 X 的值:");
		int x = scan.nextInt();

		System.out.println("請輸入指數 Y 的值:");
		int y = scan.nextInt();

		try {
			System.out.println(x+"的"+y+"次方為:"+powerXY(x, y));
		} 
		catch (java.util.InputMismatchException e) {
			System.out.println("請輸入整數，而非帶有小數點或是字元");
		}
	}
	
	public static int powerXY(int x, int y) throws ArithmeticException {
		int result;
		if (x == 0 || y == 0) {
			throw new ArithmeticException("不能為0 ! 沒有意義!");
		} else if (x < 0 || y < 0) {
			throw new ArithmeticException("我不想基數或是指數有負值!");
		}
		result = (int) Math.pow(x, y);
		return result;
	}

}
