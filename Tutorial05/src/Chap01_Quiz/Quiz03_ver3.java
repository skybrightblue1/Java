package Chap01_Quiz;

import java.util.Scanner;

public class Quiz03_ver3 {

	public static void main(String[] args) {
		String[] Quiz = new String[5];
		boolean[] Answer = new boolean[5];
		Quiz[0] = "���� �����̴�.";//X
		Answer[0] = false;
		Quiz[1] = "�����̵� �̻��� �ִ�.";//O
		Answer[1] = true;
		Quiz[2] = "���� �ڷε� �� �� �ִ�.";//O
		Answer[2] = true;
		Quiz[3] = "����Ŭ�ι��� �ɸ��� �ູ �̴�.";//O
		Answer[3] = true;
		Quiz[4] = "�츮���� ������ ù ���� ���ΰ��� �������̴�.";//X
		Answer[4] = false;
		Scanner sc = new Scanner(System.in);
		char My_Answer;
		int AnswerCount = 0;
		for(int i = 0; i < Quiz.length ; i++) {
			System.out.println(Quiz[i]);
			System.out.print("�� �Է�(O/X) : ");
			My_Answer = sc.next().charAt(0);
			if(My_Answer == 'o' || My_Answer == 'O') {
				if(Answer[i] == true) {
					AnswerCount++;
					System.out.println("�����Դϴ�!");
				}else {
					System.out.println("�����Դϴ�!");					
				}
			}
			else if(My_Answer == 'x' || My_Answer == 'X') {
				if(Answer[i] == false) {
					AnswerCount++;
					System.out.println("�����Դϴ�!");
				}else {
					System.out.println("�����Դϴ�!");					
				}
			}
			else {
				i--; 
				// ���࿡ i �� 0�϶� ������ ��Ȯ�� ���� ���� �ʾҴٸ� 0��° ������ �ٽ� �����ְ� �Է��϶�� �ؾ� �ϴϱ� 
				// i�� �ϳ� �����ϸ� -1�̰� �ű⼭ ������ i++�� �ؼ� 0�� �Ǿ 0��° ������ �ٽ� �����ְ� �Է��ϰ� ���� 
			}
		}
		System.out.println("���� ���� : " + AnswerCount);
	}
}
