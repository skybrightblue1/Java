package Chap01;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] NameArray = new String[5];
		for (int i = 0; i< NameArray.length; i++) {
			System.out.print((i+1)+ "��° �̸� �Է� : ");
			NameArray[i] = sc.nextLine();
		}
		for (int i =0 ; i < NameArray.length; i++) {
			System.out.println((i+1) + "��° �̸� : " + NameArray[i]);
		}
	}

}
