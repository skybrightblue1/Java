package Chap01_Quiz;

import java.util.Scanner;

public class Quiz03_ver3 {

	public static void main(String[] args) {
		String[] Quiz = new String[5];
		boolean[] Answer = new boolean[5];
		Quiz[0] = "고래는 생선이다.";//X
		Answer[0] = false;
		Quiz[1] = "달팽이도 이빨이 있다.";//O
		Answer[1] = true;
		Quiz[2] = "새는 뒤로도 날 수 있다.";//O
		Answer[2] = true;
		Quiz[3] = "세잎클로버의 꽃말은 행복 이다.";//O
		Answer[3] = true;
		Quiz[4] = "우리나라 월드컵 첫 골의 주인공은 차범근이다.";//X
		Answer[4] = false;
		Scanner sc = new Scanner(System.in);
		char My_Answer;
		int AnswerCount = 0;
		for(int i = 0; i < Quiz.length ; i++) {
			System.out.println(Quiz[i]);
			System.out.print("답 입력(O/X) : ");
			My_Answer = sc.next().charAt(0);
			if(My_Answer == 'o' || My_Answer == 'O') {
				if(Answer[i] == true) {
					AnswerCount++;
					System.out.println("정답입니다!");
				}else {
					System.out.println("오답입니다!");					
				}
			}
			else if(My_Answer == 'x' || My_Answer == 'X') {
				if(Answer[i] == false) {
					AnswerCount++;
					System.out.println("정답입니다!");
				}else {
					System.out.println("오답입니다!");					
				}
			}
			else {
				i--;
			}
		}
		System.out.println("정답 갯수 : " + AnswerCount);
	}
}
