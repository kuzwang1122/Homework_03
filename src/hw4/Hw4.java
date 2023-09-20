package hw4;

import java.util.*;

public class Hw4 {

	public static void main(String[] args) {

		Scanner money = new Scanner(System.in);
		int[][] emp = { { 25, 2000 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		System.out.println("想借多少啦");
		int hope = money.nextInt();
		int count = 0;
		System.out.print("以下員工編號有足夠的錢可以借你:");
		for (int i = 0; i < emp.length; i++) {
			if (emp[i][1] >= hope) {
				count++;
				System.out.print(emp[i][0] + " ");
			} else {
				System.out.print("我沒錢" + " ");
			}
		}

		System.out.println("共" + count + "人!");

	}
}
