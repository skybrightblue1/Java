package Chap01_Quiz;

import java.util.Random;

public class Quiz02_ver2 {

	public static void SetFamilyAge(int[] FamilyAge) {
		Random random = new Random();
		for (int i = 0; i <FamilyAge.length; i++) {
			FamilyAge[i] = random.nextInt(80) + 1; // 1 ~ 80 랜덤 
		    System.out.print(FamilyAge[i] + " ");
		}
		System.out.println();
	}
	public static void CheckFamilyAge(int[] FamilyAge) {
		int OldAge = 0;
		int AdultAge = 0;
		int TeenagerAge = 0;
		int ChildAge = 0;
		for (int i = 0; i <FamilyAge.length; i++) {
			if (FamilyAge[i]>= 65) OldAge++;
			else if(FamilyAge[i] >= 20) TeenagerAge++;
			else if (FamilyAge[i] >=8) ChildAge++;
		}
		System.out.println("노인 : " + OldAge + "명");
		System.out.println("성인 : " + AdultAge + "명");
		System.out.println("청소년 : " + TeenagerAge + "명");
		System.out.println("아동 : " + ChildAge + "명");
		if (ChildAge >= 3)
			System.out.println("지원금 : " + (ChildAge * 50) + "만원");

	}
	public static void main(String[] args) {
		int [] FamilyAge = new int[10];
		SetFamilyAge(FamilyAge);
		CheckFamilyAge(FamilyAge);
		
	}

}
