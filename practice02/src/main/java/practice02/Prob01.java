package practice02;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {

		int price = 0; // 금액
		int count = 0; // 지폐 및 동전의 개수
		int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 }; // 지폐 및 동전 종류
		
		Scanner scanner = new Scanner(System.in);
		price = scanner.nextInt(); 
		System.out.println("금액: " + price + "\n"); // 키보드에서 금액 받기.

		// 지폐 및 동전으로 반환
		for (int i = 0; i < 10; i++) {
			count = price / money[i];
			price -= money[i] * count;
			System.out.println(money[i] + "원: " + count + "개");
		}

	}
}

 