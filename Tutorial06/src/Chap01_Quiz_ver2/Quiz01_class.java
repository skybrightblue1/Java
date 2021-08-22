package Chap01_Quiz_ver2;

import java.util.Scanner;

public class Quiz01_class {
	private int StartDan;
	private int EndDan;
	
	public void SetGugudan() {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작단 입력 : ");
		StartDan = sc.nextInt();
		System.out.print("끝단 입력 : ");
		EndDan = sc.nextInt();
	}
	public void ShowGugudan() {
		for (int Dan = StartDan; Dan <= EndDan; Dan++) {
			System.out.println("=====" + Dan + "단======");
			for(int i = 0; i<=9; i++) {
				System.out.println(Dan + " x "+ i + " = " + (Dan * i));
			}
		}
		
	}

}
