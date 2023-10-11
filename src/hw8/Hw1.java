package hw8;

import java.util.HashSet;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.List;

public class Hw1 {
	
	public static void main(String[] args) {
		
		List<Object> list = new ArrayList<Object>();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		
		System.out.println(list);
		System.out.println("元素個數:"+list.size());
		
		// 印出這個物件裡的所有元素(使用Iterator)
		Iterator obj = list.iterator();
		while(obj.hasNext())
			System.out.print(obj.next()+" ");
		
		System.out.println();
		
		// 印出這個物件裡的所有元素(使用傳統for)
		for (int i=0; i<list.size() ;i++) {
			Object obj1 =list.get(i);
			System.out.print(obj1+" ");
		}
		
		System.out.println();
		
		// 印出這個物件裡的所有元素(使用foreach)
		for(Object obj2 : list) {
			System.out.print(obj2+" ");
		}
		
		System.out.println();
		
		// 移除不是java.lang.Number相關的物件，並印出來檢查
		Iterator obj3  = list.iterator();
		while(obj3.hasNext()) {
			if(!(obj3.next() instanceof Number)) {
				obj3.remove();
			}
		}
		for(Object XXX :list) {
			System.out.print(XXX+" ");
		}
		
	}

}
