package hw5;

public class InkBrush extends Pen {

	@Override
	public void write() {
		System.out.println("使用方法為:沾墨汁再寫");
	}

	public InkBrush(String brand, double price) {
		super(brand, price);
	}

	public double getPrice() {
		return price * 0.9;
	}

}
