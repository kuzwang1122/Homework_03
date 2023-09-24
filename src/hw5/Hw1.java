package hw5;

import java.util.*;

// 請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形

public class Hw1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("請輸入高度");
		int height = input.nextInt();
		System.out.println("請輸入寬度");
		int width = input.nextInt();

		starSquare(height, width);

	}

	private static void starSquare(int height, int width) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
