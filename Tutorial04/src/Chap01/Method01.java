package Chap01;

import java.util.Scanner;

public class Method01 {
	public static int TimesTable(int StartDan, int EndDan) {
		int Sum = 0;
		for(int Dan = StartDan; Dan <= EndDan; Dan++) {
			System.out.println("======" + Dan + "단======");
			for (int i = 1; i<=9; i++) {
				System.out.println(Dan + " x " + i + " = " + (Dan*i));	
				Sum += Dan*i;
				
			}
			System.out.println("===============");
		}
		return Sum;
	}

	public static void main(String[] args) {
		// 구구단 출력해주는 함수 만들기 (+ 합계 까지) 
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 시작단과 끝단을 입력하시오");
		System.out.print("시작단 : ");
		int StartDan = sc.nextInt();
		System.out.print("끝단 : ");
		int EndDan = sc.nextInt();	
		System.out.println("Sum : " + TimesTable(StartDan, EndDan));

	}

}
