package Chap01_Quiz;

import java.util.Scanner;

public class Quiz02_ver2 {
	public static int GetAbsolute(int num) {
		if (num < 0)
			num = -num;
		return num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		System.out.println(num + " �� ���밪 : " + GetAbsolute(num));
	}

}
