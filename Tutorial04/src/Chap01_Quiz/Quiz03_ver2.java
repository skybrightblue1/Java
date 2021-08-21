package Chap01_Quiz;

import java.util.Scanner;

public class Quiz03_ver2 {
	public static boolean CheckPrime(int num) {
		for (int i = 2; i <num; i++) {
			if(num % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		if (CheckPrime(num)==true)
			System.out.println("소수입니다.");
		else 
			System.out.println("소수가 아닙니다.");

	}

}
