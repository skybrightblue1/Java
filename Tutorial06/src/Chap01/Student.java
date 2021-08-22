package Chap01;

import java.util.Random;

public class Student {
	// private : 해당 Class 내부에서만 사용할 수 있는 코드 
	// public : 프로젝트의 모든 영역에서 사용할 수 있는 코드 
	
	// 학생 정보 : 이름, 성적(국어, 수학, 영어, 합계, 평균), 학년, 주소, 성별 
	// 멤버 변수 선언
	private String Name;
	private int Grade;
	private String Address;
	private String Gender;
	private int Kor, Math, Eng, Sum;
	private float Avg;
	
	public String CreateName() {
		Random random = new Random();
		switch(random.nextInt(5)) {
		case 0:
			return "김민아";
		case 1:
			return "김예지";
		case 2: 
			return "김바보";
		case 3:
			return "김천재";
		case 4: 
			return "김곶감";
		case 5:
			return "김자두";
		default :
			return "김꽃게";
		}
	}
	
	public String CreateAddress() {
		Random random = new Random();
		switch(random.nextInt(5)) {
		case 0:
			return "서울";
		case 1:
			return "울산";
		case 2: 
			return "제주";
		case 3:
			return "부산";
		case 4: 
			return "경북";
		case 5:
			return "경남";
		default :
			return "영덕";
		}
	}
	public void Exam() {
		Random random = new Random();
		Kor = random.nextInt(101); // 0 ~ 100
		Math = random.nextInt(101); // 0 ~ 100
		Eng = random.nextInt(101); // 0 ~ 100
		Sum = Kor + Math + Eng;
		Avg = Sum/3;
		
	}
	public void SetStudent() {
		Random random = new Random();
		Name = CreateName();
		Address = CreateAddress();
		Grade = random.nextInt(4) + 1; // 1 ~ 4
		if(random.nextBoolean())
			Gender = "남자";
		else 
			Gender = "여자";
		Kor = 0;
		Eng = 0;
		Math = 0;
		Sum = 0;
		Avg = 0.0f;
	}
	public void ShowStudent() {
		System.out.println("==========================");
		System.out.println("이름 : " + Name + " 학년 : " + Grade + "학년");
		System.out.println("성별 : " + Gender + " 주소 : "+ Address);
		System.out.println("점수 : " + Kor + "," + Math+ "," + Eng);
		System.out.println("합계 : " + Sum + " 평균 : "+ Avg);
		System.out.println("==========================");
		
	}

	
	
}
