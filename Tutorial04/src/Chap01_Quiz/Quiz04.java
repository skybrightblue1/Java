package Chap01_Quiz;

import java.util.Scanner;

public class Quiz04 {
	public static int reverse(int num) {
		
		int result = num % 10;
		return result;
	}

	public static void main(String[] args) {
		// �Է¹��� ���� �Ųٷ� ����ϴ� �Լ��� ���弼�� 
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		while (num != 0) {
			System.out.print(reverse(num));
			num /= 10;
		}

	}

}
