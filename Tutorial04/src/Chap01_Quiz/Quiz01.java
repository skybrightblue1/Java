package Chap01_Quiz;

import java.util.Scanner;

public class Quiz01 {

	public static int Max(int num1, int num2)
	{
		if (num1 > num2) return num1;
		else if (num1 < num2) return num2;
		else return 0;
	}
	public static void main(String[] args) {
		// 두 수를 입력 받아 큰 수를 출력하는 함수를 만드시오 
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.print("두 수 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		int result = Max(num1, num2);
		if (result == 0) {
			System.out.println("두 수는 같습니다");
		}
		else {
			System.out.println("큰 수 : " + result);
		}
		
	}

}
