package Chap01_Quiz;

import java.util.Scanner;

public class Quiz01_ver2 {
	// ���ڰ� ������ ������ϰ� 
	public static int Max(int num1, int num2) {
		if (num1 > num2) return num1;
		else return num2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 2�� �Է� : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int max = Max(num1, num2);
		System.out.println(num1 + "�� "+ num2 + "�� ū ���� "+ max + "�Դϴ�" );

	}

}
