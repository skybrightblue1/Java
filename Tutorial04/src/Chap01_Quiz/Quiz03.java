package Chap01_Quiz;

import java.util.Scanner;

public class Quiz03 {
	public static boolean PrimeNum(int num) {
		int count = 0;
		boolean check = true;
		for (int i = 2; i<=num; i++)
		{
			if((num % i) == 0) count++;
		}
		if ((num==1)||!(count == 1)) {
			check = false;
			return check;
		}
		else return check;
	}

	public static void main(String[] args) {
		// 정수를 받아 소수가 맞는지 확인하는 함수를 만드시오 
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		if (PrimeNum(num) == false) System.out.println("소수가 아닙니다");
		else System.out.println("소수가 맞습니다");

	}

}
