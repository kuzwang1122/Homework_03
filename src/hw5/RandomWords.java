package hw5;

import java.util.*;

//設計一個方法genCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，
//此驗證碼內容包含了英文大小寫與數字的亂數組合

public class RandomWords {
    public static void main(String[] args) {
        System.out.println("本次隨機產生驗證碼為：" + getCode());
        
    }
    
    public static String getCode() {
        String pool = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String code = new String("") ;   // String code = ""; 
        for (int i = 0; i < 8; i++) {
            int index = (int)(Math.random() * pool.length());
            code += pool.charAt(index);
        }
        return code;
    }
}
