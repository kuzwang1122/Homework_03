package hw3;

import java.util.*;

public class Hw2Bonus {
	public static void main(String[] args) {

		int bingo = (int) (Math.random() * 101);
		
		Scanner num = new Scanner(System.in);

		System.out.println("請輸入0~100之間的數字");

		int fate = num.nextInt();

		int min = 0 , max = 100;

		while (fate != bingo) {
			if (fate > bingo) {
				max = fate;
				System.out.println("請繼續猜" + min + "~" + fate + "之間的數字");
				fate = num.nextInt();
			} else {
				min = fate;
				System.out.println("請繼續猜" + fate + "~" + max + "之間的數字");
				fate = num.nextInt();
			}
		}
		System.out.println("答對了!答案就是"+ bingo);

	}
}
