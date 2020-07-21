package practice02;

public class Prob04 {
	public static void main(String[] args) {
		char[] c1 = reverse("Hello World");
		printCharArray(c1);

		char[] c2 = reverse("Java Programming!");
		printCharArray(c2);
	}
	
	// 문자 뒤집기.
	public static char[] reverse(String str) {
		char[] c = str.toCharArray(); // 문자열을 문자로 변환하기.
		int stringLength = str.length(); // 문자열 길이
		char temp;
		
		// 문자 뒤집기.
		for (int i = 0; i < stringLength / 2; i++) {
			temp = c[i];
			c[i] = c[stringLength - (i + 1)];
			c[stringLength - (i + 1)] = temp;
		}

		return c;
	}
	
	// 문자를 일렬로 출력하기.
	public static void printCharArray(char[] array) {
		String string = new String(array);
		System.out.println(string);
	}
}
