package hw3;

import java.util.*;

public class Hw3 {
	// 阿文很喜歡簽大樂透(1~49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討厭哪個數字
	// 請您設計一隻程式，讓阿文可以輸入他不想要的數字，畫面會顯示他可以選擇的號碼與總數。

	public static void main(String[] args) {

		System.out.println("請輸入討厭的數字(1-9)：");

		Scanner hate = new Scanner(System.in);
		int a = hate.nextInt();
		int num = 0;

		System.out.println("可選擇的數字：");

		for (int b = 1; b <= 49; b++) {
			if (!((b >= 10 && b / 10 == a) || b % 10 == a)) {
				System.out.print(b + "\t");
				num++;
			}
			if ((b % 10 == 0)) {
				System.out.println();
			} 
		}
		System.out.println();
		System.out.println("總共有 " + num + " 個數字可選");

	}
}
