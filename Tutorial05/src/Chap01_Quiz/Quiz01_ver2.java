package Chap01_Quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz01_ver2 {
	// �Լ��� ����� ���� ��� ���� 
	public static void AllPrint(int[] ArrayNum) {
		for(int i = 0; i<ArrayNum.length; i++)
			System.out.print(ArrayNum[i] + " ");
		System.out.println();
	}
	public static void x3Print(int[] ArrayNum) {
		for(int i = 0; i<ArrayNum.length; i++) {
			if (ArrayNum[i] % 3 == 0)
				System.out.print(ArrayNum[i] + " ");
		}
		System.out.println();
	}
	public static void SetArray(int[] ArrayNum) {
		// Scanner sc = new Scanner(System.in);
		Random random = new Random();
		// 1 ~ 50 ������ �����Լ� �̾���
		// random.nextInt(50) : 0 ~ 49 ������ �������� ����
		// random.nextInt(50) + 1 : 1 ~ 50 ������ �������� ����
		// random.nextBoolean() : true or false
		// random.nextfloat90 : 0.0 ~ 1
		
		for (int i = 0;i<ArrayNum.length; i++) {
			// System.out.print("ArrayNum[" + i + "] : ");
			// ArrayNum[i] = sc.nextInt();
			ArrayNum[i] = random.nextInt(50) + 1;
		}
	}
	public static void ArrayQuix2(int[] ArrayNum) {
		int BigNum = ArrayNum[0];
		int Sum = 0;
		for (int i = 0;i<ArrayNum.length; i++) {
			if (BigNum < ArrayNum[i])
				BigNum = ArrayNum[i];
			Sum += ArrayNum[i];
		}
		System.out.println("���� ū �� : "+ BigNum);
		System.out.println("�հ� : " + Sum);
		System.out.println("��� : " + (Sum /ArrayNum.length));
	}

	public static void main(String[] args) {
		int [] ArrayNum = new int[10];
		SetArray(ArrayNum);
		AllPrint(ArrayNum);
		x3Print(ArrayNum);
		ArrayQuix2(ArrayNum);
	}
	// ����� : ������ �߻� �� ��� �ش� ������ ������ ã�� ����. �ڵ��� �帧�� �ľ��ϱ� ���� ���
	// ����� ���� : �ڵ带 ���پ� �����Ͽ� ������ �� ��ȭ�� �ڵ��� �帧�� �ľ��Ѵ� 
	// ����� ���� : ������� ������
	// ����� ���� : ������� ������ 
    // Step Into   (F5)  - �Լ� ���η� �̵�, into / �ڵ� ���� ����
    // Step Over   (F6)  - �Լ� ���η� �̵����� ����, over / �ڵ� ���� ���� 
    // Step Return (F7)  - �Լ� ������ �̵� 
	// BreakPoint : ���߰� ���� �ڵ� ��ġ 
	// Variable �� : �������� ���
	// BreakPoints �� : BreakPoint ���
	// Expressions �� : �����(Ư�� ���� Ȥ�� ��ɾ� Ȯ��)

}
