package Chap01;

import java.util.Scanner;

public class Method04 {
	// �Ű������� ���� ���δ� Ư�� �����Ͱ� �Լ������� ����, ó�� �� �� �ִ� ������������ ���� �����ȴ� 
	// ���� �Լ� ���ο��� ����� ������ �� �ִ� �����Ͷ�� �Ű������� ���� �ʰ� 
	// �װ��� �ƴ϶��, �Ű������� ���� �ܺο��� �����͸� �޾� ó���Ѵ� 
	public static int TotalSum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����հ踦 ���� �ִ밪 �Է� : ");
		int Num = sc.nextInt();
		int Sum = 0;
		for(int i = 1; i<=Num ; i++)
			Sum += i;
		return Sum;
	}
	public static void main(String[] args) {
		// �����հ� �Լ� ����� (�Ű������� ���� ���)
		int Sum = TotalSum();
		System.out.println("Sum : " + Sum);
		System.out.println("Sum x 2: "+ Sum*2);
	}

}
