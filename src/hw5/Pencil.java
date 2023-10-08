package hw5;

public class Pencil extends Pen {

	@Override
	public void write() {
		System.out.println("使用方法:削鉛筆再寫");
	}

	public Pencil(String brand, double price) {
		super(brand, price);
	}

	public double getPrice() {
		return price * 0.8;
	}
}
