package Chap01_Quiz_ver2;

import java.util.Scanner;

public class Quiz02_class {

	private int Width;
	private int Height;
	public void SetData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 : ");
		Width = sc.nextInt();
		System.out.print("세로 : ");
		Height = sc.nextInt();
	}
	public void ShowData() {
		for(int y = 1; y <= Height; y++) {
			for(int x = 1; x <= Width; x++) {
				if(y==1 || y==Height || x==1|| x==Width)System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
