package Chap01_Quiz;

import java.util.Scanner;

public class Quiz02 {
	public static int abs(int num) {
		if (num < 0 ) return -num;
		else return num;
	}

	public static void main(String[] args) {
		// ���밪�� ���ϴ� �Լ��� ����ÿ� 
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		System.out.println("���밪 : " + abs(num));
		
		
		
	}

}
