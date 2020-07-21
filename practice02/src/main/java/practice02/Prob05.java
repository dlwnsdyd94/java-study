package practice02;

import java.util.Scanner;
import java.util.Random;

public class Prob05 {
	public static void main(String[] args) {
		int min = 1;
		int max = 100;
		int userNumber;
		Scanner scanner = new Scanner(System.in);
		
		Random r = new Random(); // 랜덤 숫자 결정
		int k = r.nextInt(100) + 1;

		
		System.out.println("수를 결정하였습니다. 맞추어 보세요.");
		
		int i = 1;
		while(true) {
			System.out.print(min + "-" + max + "\n" + i + ">>");
			userNumber = scanner.nextInt();
			
			if(k > userNumber) {
				System.out.println("더 높게");
				min = userNumber;
				i++;
			}
			else if(k < userNumber) {
				System.out.println("더 낮게");
				max = userNumber;
				i++;
			}
			else {
				System.out.print("맞았습니다.\n다시하시겠습니까(y/n)>>");
				String answer = scanner.next();
				if(answer.equals("n")) { // 그만하기.
					break;
				}
				else { // 다시하기.
					min = 1;
					max = 100;
					i = 1;
					k = r.nextInt(100) + 1;
				}
			}
		}
	}
}