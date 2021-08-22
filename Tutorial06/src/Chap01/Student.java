package Chap01;

import java.util.Random;

public class Student {
	// private : �ش� Class ���ο����� ����� �� �ִ� �ڵ� 
	// public : ������Ʈ�� ��� �������� ����� �� �ִ� �ڵ� 
	
	// �л� ���� : �̸�, ����(����, ����, ����, �հ�, ���), �г�, �ּ�, ���� 
	// ��� ���� ����
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
			return "��ξ�";
		case 1:
			return "�迹��";
		case 2: 
			return "��ٺ�";
		case 3:
			return "��õ��";
		case 4: 
			return "�����";
		case 5:
			return "���ڵ�";
		default :
			return "��ɰ�";
		}
	}
	
	public String CreateAddress() {
		Random random = new Random();
		switch(random.nextInt(5)) {
		case 0:
			return "����";
		case 1:
			return "���";
		case 2: 
			return "����";
		case 3:
			return "�λ�";
		case 4: 
			return "���";
		case 5:
			return "�泲";
		default :
			return "����";
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
			Gender = "����";
		else 
			Gender = "����";
		Kor = 0;
		Eng = 0;
		Math = 0;
		Sum = 0;
		Avg = 0.0f;
	}
	public void ShowStudent() {
		System.out.println("==========================");
		System.out.println("�̸� : " + Name + " �г� : " + Grade + "�г�");
		System.out.println("���� : " + Gender + " �ּ� : "+ Address);
		System.out.println("���� : " + Kor + "," + Math+ "," + Eng);
		System.out.println("�հ� : " + Sum + " ��� : "+ Avg);
		System.out.println("==========================");
		
	}

	
	
}
