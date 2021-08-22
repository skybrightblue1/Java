package Chap01_Quiz;

import java.util.Scanner;

public class Quiz03_ver2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] Quiz = new String[5]; 
		String[] InputAnswer = new String[5];
		String[] RealAnswer = new String[5];
		
		Quiz[0] = "1 + 3 은?";
		Quiz[1] = "예지가 좋아하는 동물은?";
		Quiz[2] = "학원 이름은?";
		Quiz[3] = "이 지역 이름은?";
		Quiz[4] = "5 x 0 은?";
		
		RealAnswer[0] = "4";
		RealAnswer[1] = "사막여우";
		RealAnswer[2] = "it";
		RealAnswer[3] = "부산";
		RealAnswer[4] = "0";
	
		for (int i = 0; i < Quiz.length; i++) {
			System.out.print((i+1)+ "번째 퀴즈 : "+ Quiz[i]+"\n");
			System.out.print((i+1)+"번째 퀴즈 답 : ");
			InputAnswer[i] = sc.nextLine();
			if (InputAnswer[i].equals(RealAnswer[i])) System.out.println("O/X 결과 : O\n");
			else System.out.println("O/X 결과 : X\n");
			
		}
	}

}
