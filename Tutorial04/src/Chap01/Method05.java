package Chap01;

import java.util.Scanner;

public class Method05 {

	// �Ű������� ��ȯ���� �Ѵ� ���� ��� 
	public static void TotalSum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����հ踦 ���� �ִ밪 �Է� : ");
		int Num = sc.nextInt();
		int Sum = 0;
		for (int i = 1; i<=Num; i++)
			Sum += i;
		System.out.println("1 ~ " + Num + " ������ �����հ� : " + Sum);
	}
	public static void main(String[] args) {
		TotalSum();
	}

}
