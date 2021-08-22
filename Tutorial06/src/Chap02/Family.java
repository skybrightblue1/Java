package Chap02;

import java.util.Random;

public class Family {

	private String FirstName;
	private String Gender;
	private int Age;
	public static String LastName;
	// static 메소드에서는 static 변수만 사용 가능 
	public static void LivingRoom() {
		System.out.println(LastName + "씨네 거실입니다.");
	}
	public String CreateName() {
		Random random = new Random();
		switch(random.nextInt(5)) {
		case 0:
			return "연희";
		case 1:
			return "다혜";
		case 2:
			return "예원";
		case 3:
			return "은수";
		case 4: 
			return "민지";
		default :
			return "예지";
		}
	}
	public void MyRoom() {
		System.out.println(LastName + FirstName + "의 방입니다.");
	}
	public void SetInfo() {
		Random random = new Random();
		FirstName = CreateName();
		if(random.nextBoolean())
			Gender = "남자";
		else 
			Gender = "여자";
		Age = random.nextInt(40)+20; // 20 ~ 60 
		
	}
	public void ShowInfo() {
		System.out.println("이름 : " + LastName + FirstName +  " 나이 : " + Age + "살 성별 : "+ Gender);
	}
	
}
