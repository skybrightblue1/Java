package Chap02;

import java.util.Random;

public class Family {

	private String FirstName;
	private String Gender;
	private int Age;
	
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
		System.out.println("이름 : " + FirstName + " 나이 : " + Age + "살 성별 : "+ Gender);
	}
	
}
