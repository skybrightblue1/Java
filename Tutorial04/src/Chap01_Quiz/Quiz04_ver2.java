package Chap01_Quiz;

import java.util.Scanner;

public class Quiz04_ver2 {

	public static int Reverse(int num) {
		int ReverseNum = 0;
		while (num != 0) {
			ReverseNum += num % 10;
			num /= 10;
			if (num != 0)
			    ReverseNum *= 10;
		}
		return ReverseNum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 :");
		int num = sc.nextInt();
		System.out.println(num + " -> " + Reverse(num));
	}

}
