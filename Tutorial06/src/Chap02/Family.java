package Chap02;

import java.util.Random;

public class Family {

	private String FirstName;
	private String Gender;
	private int Age;
	public static String LastName;
	// static �޼ҵ忡���� static ������ ��� ���� 
	public static void LivingRoom() {
		System.out.println(LastName + "���� �Ž��Դϴ�.");
	}
	public String CreateName() {
		Random random = new Random();
		switch(random.nextInt(5)) {
		case 0:
			return "����";
		case 1:
			return "����";
		case 2:
			return "����";
		case 3:
			return "����";
		case 4: 
			return "����";
		default :
			return "����";
		}
	}
	public void MyRoom() {
		System.out.println(LastName + FirstName + "�� ���Դϴ�.");
	}
	public void SetInfo() {
		Random random = new Random();
		FirstName = CreateName();
		if(random.nextBoolean())
			Gender = "����";
		else 
			Gender = "����";
		Age = random.nextInt(40)+20; // 20 ~ 60 
		
	}
	public void ShowInfo() {
		System.out.println("�̸� : " + LastName + FirstName +  " ���� : " + Age + "�� ���� : "+ Gender);
	}
	
}
