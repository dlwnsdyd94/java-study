package prob2;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		//for (int i = 0; i < COUNT_GOODS ; i++) {
			String input = scanner.nextLine();
			String[] namePriceNumber = input.split(" ");
			goods[0].setName(namePriceNumber[0]);
			goods[0].setPrice(Integer.parseInt(namePriceNumber[1]));
			goods[0].setNumber(Integer.parseInt(namePriceNumber[2]));
			
			System.out.println(goods[0].getName());
			System.out.println(goods[0].getPrice());
			System.out.println(goods[0].getNumber());
		//}
		
		for (int i = 0; i < COUNT_GOODS ; i++) {
			System.out.println("\n" + goods[i].getName()+"(가격:" + goods[i].getPrice() + ")이 " + goods[i].getNumber() + "개 입고 되었습니다.");
		}
	

		scanner.close();
	}
}