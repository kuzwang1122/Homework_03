package hw4;

import java.util.*;

public class Hw2 {

	public static void main(String[] args) {

		System.out.println("請輸入任意文字");

		Scanner words = new Scanner(System.in);

		// 使用StringBuilder的reverse()

		StringBuilder wow = new StringBuilder(words.next());
		System.out.println("反轉後：" + wow.reverse());
	}

}
