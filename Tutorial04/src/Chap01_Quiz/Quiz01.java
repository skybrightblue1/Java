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
		// �� ���� �Է� �޾� ū ���� ����ϴ� �Լ��� ����ÿ� 
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.print("�� �� �Է� : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		int result = Max(num1, num2);
		if (result == 0) {
			System.out.println("�� ���� �����ϴ�");
		}
		else {
			System.out.println("ū �� : " + result);
		}
		
	}

}
