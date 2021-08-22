package Chap01_Quiz;

import java.util.Scanner;

public class Draw {

	private int[] Array = new int[2];
	
	public int[] Input() {
		System.out.print("사각형의 가로, 세로 길이 순서대로 입력 : ");
		Scanner sc = new Scanner(System.in);
		Array[0] = sc.nextInt();
		Array[1] = sc.nextInt();
		return Array;
	}
	public void drawing(int[] Array) {
		
		for (int i = 1; i <= Array[0]; i++) {
			for (int j = 1; j <= Array[1]; j++) {
				if (i == 1 || i == Array[0]) System.out.print("*");
				else if((i >1 || i < Array[0])&&(j == 1 || j == Array[1])) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
