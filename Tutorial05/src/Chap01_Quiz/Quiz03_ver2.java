package Chap01_Quiz;

import java.util.Scanner;

public class Quiz03_ver2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] Quiz = new String[5]; 
		String[] InputAnswer = new String[5];
		String[] RealAnswer = new String[5];
		
		Quiz[0] = "1 + 3 ��?";
		Quiz[1] = "������ �����ϴ� ������?";
		Quiz[2] = "�п� �̸���?";
		Quiz[3] = "�� ���� �̸���?";
		Quiz[4] = "5 x 0 ��?";
		
		RealAnswer[0] = "4";
		RealAnswer[1] = "�縷����";
		RealAnswer[2] = "it";
		RealAnswer[3] = "�λ�";
		RealAnswer[4] = "0";
	
		for (int i = 0; i < Quiz.length; i++) {
			System.out.print((i+1)+ "��° ���� : "+ Quiz[i]+"\n");
			System.out.print((i+1)+"��° ���� �� : ");
			InputAnswer[i] = sc.nextLine();
			if (InputAnswer[i].equals(RealAnswer[i])) System.out.println("O/X ��� : O\n");
			else System.out.println("O/X ��� : X\n");
			
		}
	}

}
