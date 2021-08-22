package Chap01_Quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// 임의 문제 5개를 제작하여 ox 퀴즈를 완성하시오 
		Scanner sc = new Scanner(System.in);
		String[] QuizAnswer = new String[5];
		String[] Answer = new String[5];
		
		System.out.println("1. 1 + 3 은?");
		System.out.println("2. 예지가 좋아하는 동물은?");
		System.out.println("3. 학원 이름은?");
		System.out.println("4. 이 지역 이름은?");
		System.out.println("5. 5 x 0 은?");
		
		System.out.println("===답안 입력=== ");
		for (int i = 0; i < QuizAnswer.length; i++) {
			System.out.print((i+1)+ "번째 문제 답 : ");
			QuizAnswer[i] = sc.nextLine();
		}

		for (int i = 0; i < QuizAnswer.length; i++) {
			if (QuizAnswer[i].equals("4")) Answer[i] = "O";
			else if(QuizAnswer[i].equals("사막여우")) Answer[i] = "O";
			else if (QuizAnswer[i].equals("it")) Answer[i] = "O";
			else if (QuizAnswer[i].equals("부산")) Answer[i] = "O";
			else if (QuizAnswer[i].equals("0")) Answer[i] = "O";
			else Answer[i] = "X";
		}
		System.out.println("===답안 공개=== ");
		for (int i = 0; i <Answer.length; i++) {
			System.out.println((i+1)+ "번째 문제 답 : " + Answer[i]);
		}
	
	}
}
