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
		// ������ �޾� �Ҽ��� �´��� Ȯ���ϴ� �Լ��� ����ÿ� 
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		if (PrimeNum(num) == false) System.out.println("�Ҽ��� �ƴմϴ�");
		else System.out.println("�Ҽ��� �½��ϴ�");

	}

}
