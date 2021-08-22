package Chap01_Quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// 가족의 총 인원수는 10명이다. 각 인원의 나이를 입력 한 뒤 분류하여 지원금과 함께 다음과 같이 출력
		// 노인 : 65세 이상, 성인 20 ~ 64 세, 청소년 8 ~ 19 세, 아동 1 ~ 7세
		// 단 아동이 3명 이상일 경우 아동 1명당 지원금 50만원씩 지급 
		
		Scanner sc = new Scanner(System.in);
		int[] age = new int[10];
		int CountKid = 0;
		
		for (int i = 0; i< age.length; i++) {
			System.out.print((i+1)+ "번째 나이 입력 : ");
			age[i] = sc.nextInt();
			
		}
		for (int i = 0; i< age.length; i++) {
			System.out.print((i+1)+ "번째 나이 : ");
			if (age[i] >= 65)  System.out.println("노인");
			else if(age[i] >= 20 && age[i]<64) System.out.println("성인");
			else if(age[i] >= 8 && age[i] <20) System.out.println("청소년");
			else {
				System.out.println("아동");
				CountKid++;
			}
		}
		if (CountKid >=3) {
			System.out.println("아동 : " + CountKid+ "명");	
		    System.out.println("지원금 : " + CountKid * 50 + "만원");
		}

	}

}
