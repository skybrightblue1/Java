package Chap01;

import java.util.Scanner;

public class Method01 {
	public static int TimesTable(int StartDan, int EndDan) {
		int Sum = 0;
		for(int Dan = StartDan; Dan <= EndDan; Dan++) {
			System.out.println("======" + Dan + "��======");
			for (int i = 1; i<=9; i++) {
				System.out.println(Dan + " x " + i + " = " + (Dan*i));	
				Sum += Dan*i;
				
			}
			System.out.println("===============");
		}
		return Sum;
	}

	public static void main(String[] args) {
		// ������ ������ִ� �Լ� ����� (+ �հ� ����) 
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���۴ܰ� ������ �Է��Ͻÿ�");
		System.out.print("���۴� : ");
		int StartDan = sc.nextInt();
		System.out.print("���� : ");
		int EndDan = sc.nextInt();	
		System.out.println("Sum : " + TimesTable(StartDan, EndDan));

	}

}
