package prob2;

public class Goods {
	private String goodName;
	private int price;
	private int number;
	
	public String getName() {
		return goodName;
	}
	public void setName(String inputGoodName) {
		goodName = inputGoodName;
		System.out.println(goodName);
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int inputPrice) {
		price = inputPrice;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int inputNumber) {
		number = inputNumber;
	}
}
