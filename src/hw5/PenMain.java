package hw5;

public class PenMain {

	public static void main(String[] args) {
		
		Pen pencil = new Pencil("鉛筆大王", 1.0);

		String brand = pencil.getBrand();

		System.out.println("品牌名稱:"+brand);

		pencil.write();

		double price = pencil.getPrice();

		System.out.println(price+"(原售價1元打八折)");
		
		System.out.println("==================");
		
		Pen inkbrush = new InkBrush("毛筆大王",1.0);
		
		String brand2 = inkbrush.getBrand();
		
		System.out.println("品牌名稱:"+brand2);
		
		inkbrush.write();
		
		double price2 = inkbrush.getPrice();
		
		System.out.println(price2+"(原售價1元打九折)");
	}

}
