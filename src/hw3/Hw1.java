package hw3;

import java.util.*;

public class Hw1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// 輸入三角形三邊長
		System.out.println("請輸入三角形的第一個邊長");
		double a = input.nextDouble();
		System.out.println("請輸入三角形的第二個邊長");
		double b = input.nextDouble();
		System.out.println("請輸入三角形的第三個邊長");
		double c = input.nextDouble();

		// 判斷三角形種類
		if (a + b <= c || a + c <= b || c + b <= a) {
			System.out.println("不是三角形");
		} else if (a == b && b == c && c == a) {
			System.out.println("正三角形");
		} else if (a == b || b == c || c == a) {
			System.out.println("等腰三角形");
		} else if ((a*a+b*b == c*c) || (a*a+c*c == b*b) || (b*b+c*c == a*a)) {
			System.out.println("直角三角形");
		} else {
			System.out.println("其他三角形");
		}
	}

}
