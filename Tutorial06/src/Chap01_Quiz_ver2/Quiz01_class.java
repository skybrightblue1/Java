package Chap01_Quiz_ver2;

import java.util.Scanner;

public class Quiz01_class {
	private int StartDan;
	private int EndDan;
	
	public void SetGugudan() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���۴� �Է� : ");
		StartDan = sc.nextInt();
		System.out.print("���� �Է� : ");
		EndDan = sc.nextInt();
	}
	public void ShowGugudan() {
		for (int Dan = StartDan; Dan <= EndDan; Dan++) {
			System.out.println("=====" + Dan + "��======");
			for(int i = 0; i<=9; i++) {
				System.out.println(Dan + " x "+ i + " = " + (Dan * i));
			}
		}
		
	}

}
