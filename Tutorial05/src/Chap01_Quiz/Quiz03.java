package Chap01_Quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// ���� ���� 5���� �����Ͽ� ox ��� �ϼ��Ͻÿ� 
		Scanner sc = new Scanner(System.in);
		String[] QuizAnswer = new String[5];
		String[] Answer = new String[5];
		
		System.out.println("1. 1 + 3 ��?");
		System.out.println("2. ������ �����ϴ� ������?");
		System.out.println("3. �п� �̸���?");
		System.out.println("4. �� ���� �̸���?");
		System.out.println("5. 5 x 0 ��?");
		
		System.out.println("===��� �Է�=== ");
		for (int i = 0; i < QuizAnswer.length; i++) {
			System.out.print((i+1)+ "��° ���� �� : ");
			QuizAnswer[i] = sc.nextLine();
		}

		for (int i = 0; i < QuizAnswer.length; i++) {
			if (QuizAnswer[i].equals("4")) Answer[i] = "O";
			else if(QuizAnswer[i].equals("�縷����")) Answer[i] = "O";
			else if (QuizAnswer[i].equals("it")) Answer[i] = "O";
			else if (QuizAnswer[i].equals("�λ�")) Answer[i] = "O";
			else if (QuizAnswer[i].equals("0")) Answer[i] = "O";
			else Answer[i] = "X";
		}
		System.out.println("===��� ����=== ");
		for (int i = 0; i <Answer.length; i++) {
			System.out.println((i+1)+ "��° ���� �� : " + Answer[i]);
		}
	
	}
}
