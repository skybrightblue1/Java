package Chap01_Quiz;

import java.util.Scanner;

public class TimesTable {

	private int num;
	
	public int Input() {
		System.out.print("������ ���? ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		return num;
	}
	
	public void timesTable(int num) {
		for (int i = 1; i <=num ; i++) {
			System.out.println("===" + i+ "��===");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i+ " x "+ j+ " = "+ i*j);
			}
			System.out.println();
		}
	}
}
