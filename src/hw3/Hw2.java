package hw3;

//請設計一隻程式，會亂數產生一個0～9的數字，
//然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜對則顯示正確訊息

import java.util.*;

public class Hw2 {
	
	public static void main(String[] args) {
		
		System.out.println("請猜數字(0~9)");
		int bingo;
		bingo = (int) (Math.random() * 11);
		Scanner fate = new Scanner(System.in);
		for (int x = 0; x != bingo;) {
			if (fate.hasNextInt()) {
				x = fate.nextInt();
			} else {
				System.out.println("請輸入整數！");
				break;
			}
			if (x == bingo) {
				System.out.println("答對了！答案就是" + bingo);
				break;
			} else {
				System.out.println("猜錯囉！");
			}
		}

		System.out.println("=================================");
	}
}
