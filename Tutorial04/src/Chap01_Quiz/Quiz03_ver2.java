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
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		if (CheckPrime(num)==true)
			System.out.println("�Ҽ��Դϴ�.");
		else 
			System.out.println("�Ҽ��� �ƴմϴ�.");

	}

}
