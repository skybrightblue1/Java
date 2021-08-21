package Chap01_Quiz;

import java.util.Scanner;

public class Quiz02 {
	public static int abs(int num) {
		if (num < 0 ) return -num;
		else return num;
	}

	public static void main(String[] args) {
		// 절대값을 구하는 함수를 만드시오 
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		System.out.println("절대값 : " + abs(num));
		
		
		
	}

}
