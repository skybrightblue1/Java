package Chap01_Quiz;

import java.util.Scanner;

public class Quiz04 {
	public static int reverse(int num) {
		
		int result = num % 10;
		return result;
	}

	public static void main(String[] args) {
		// 입력받은 수를 거꾸로 출력하는 함수를 만드세요 
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		while (num != 0) {
			System.out.print(reverse(num));
			num /= 10;
		}

	}

}
