package Chap01_Quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// ���� 10���� �Է� ���� �� �� �� 3�� ����� ����Ͻÿ� 
		// �� �Է� ���� 10���� ���� �� ���� ū ���� 10 ���� ����,����� ����Ͻÿ�
		Scanner sc = new Scanner(System.in);
		int[]Array = new int[10];
		int max = 0, total = 0;
		
		System.out.print("���� 10�� �Է� : ");
		for(int i = 0; i < Array.length; i++) {
			Array[i] = sc.nextInt();
			if (Array[i] > max) max = Array[i];
			total += Array[i];
		}

		
		System.out.println("3�� ��� ��� : ");
		for(int i = 0; i < Array.length; i++)
			if (Array[i] % 3 == 0)
			System.out.print(Array[i] + " ");
		
		System.out.println("\n���� ū �� : " + max);
		System.out.println("��� : "+ (float)(total/Array.length));
		

	}

}
