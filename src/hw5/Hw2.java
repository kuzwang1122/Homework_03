package hw5;

import java.util.*;

// 請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值

public class Hw2 {
	public static void main(String[] args) {
		randAvg();
	}
	
	 static void randAvg() {
		 int [] Array = new int[10];
		 double sum = 0;
		 for (int i= 0;i<10;i++) {
			 Array[i] = (int)(Math.random()*101);
			 sum = sum + Array[i];
		 }
		 System.out.println("本次亂數結果:");
		 System.out.println(Arrays.toString(Array));
		 System.out.println("平均值為:"+sum/10);
		 
	 }

		

}
