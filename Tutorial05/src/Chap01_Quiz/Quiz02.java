package Chap01_Quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// ������ �� �ο����� 10���̴�. �� �ο��� ���̸� �Է� �� �� �з��Ͽ� �����ݰ� �Բ� ������ ���� ���
		// ���� : 65�� �̻�, ���� 20 ~ 64 ��, û�ҳ� 8 ~ 19 ��, �Ƶ� 1 ~ 7��
		// �� �Ƶ��� 3�� �̻��� ��� �Ƶ� 1��� ������ 50������ ���� 
		
		Scanner sc = new Scanner(System.in);
		int[] age = new int[10];
		int CountKid = 0;
		
		for (int i = 0; i< age.length; i++) {
			System.out.print((i+1)+ "��° ���� �Է� : ");
			age[i] = sc.nextInt();
			
		}
		for (int i = 0; i< age.length; i++) {
			System.out.print((i+1)+ "��° ���� : ");
			if (age[i] >= 65)  System.out.println("����");
			else if(age[i] >= 20 && age[i]<64) System.out.println("����");
			else if(age[i] >= 8 && age[i] <20) System.out.println("û�ҳ�");
			else {
				System.out.println("�Ƶ�");
				CountKid++;
			}
		}
		if (CountKid >=3) {
			System.out.println("�Ƶ� : " + CountKid+ "��");	
		    System.out.println("������ : " + CountKid * 50 + "����");
		}

	}

}
