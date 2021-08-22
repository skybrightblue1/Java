package Chap01_Quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz01_ver2 {
	// 함수로 만들고 난수 출력 만들어봄 
	public static void AllPrint(int[] ArrayNum) {
		for(int i = 0; i<ArrayNum.length; i++)
			System.out.print(ArrayNum[i] + " ");
		System.out.println();
	}
	public static void x3Print(int[] ArrayNum) {
		for(int i = 0; i<ArrayNum.length; i++) {
			if (ArrayNum[i] % 3 == 0)
				System.out.print(ArrayNum[i] + " ");
		}
		System.out.println();
	}
	public static void SetArray(int[] ArrayNum) {
		// Scanner sc = new Scanner(System.in);
		Random random = new Random();
		// 1 ~ 50 사이의 랜덤함수 뽑아줌
		// random.nextInt(50) : 0 ~ 49 사이의 랜덤값이 나옴
		// random.nextInt(50) + 1 : 1 ~ 50 사이의 랜덤값이 나옴
		// random.nextBoolean() : true or false
		// random.nextfloat90 : 0.0 ~ 1
		
		for (int i = 0;i<ArrayNum.length; i++) {
			// System.out.print("ArrayNum[" + i + "] : ");
			// ArrayNum[i] = sc.nextInt();
			ArrayNum[i] = random.nextInt(50) + 1;
		}
	}
	public static void ArrayQuix2(int[] ArrayNum) {
		int BigNum = ArrayNum[0];
		int Sum = 0;
		for (int i = 0;i<ArrayNum.length; i++) {
			if (BigNum < ArrayNum[i])
				BigNum = ArrayNum[i];
			Sum += ArrayNum[i];
		}
		System.out.println("가장 큰 수 : "+ BigNum);
		System.out.println("합계 : " + Sum);
		System.out.println("평균 : " + (Sum /ArrayNum.length));
	}

	public static void main(String[] args) {
		int [] ArrayNum = new int[10];
		SetArray(ArrayNum);
		AllPrint(ArrayNum);
		x3Print(ArrayNum);
		ArrayQuix2(ArrayNum);
	}
	// 디버깅 : 오류가 발생 할 경우 해당 오류의 원인을 찾는 과정. 코드의 흐름을 파악하기 위한 방법
	// 디버깅 원리 : 코드를 한줄씩 실행하여 변수의 값 변화나 코드의 흐름을 파악한다 
	// 디버깅 시작 : 벌레모양 아이콘
	// 디버깅 종료 : 정지모양 아이콘 
    // Step Into   (F5)  - 함수 내부로 이동, into / 코드 한줄 실행
    // Step Over   (F6)  - 함수 내부로 이동하지 않음, over / 코드 한줄 실행 
    // Step Return (F7)  - 함수 밖으로 이동 
	// BreakPoint : 멈추고 싶은 코드 위치 
	// Variable 탭 : 지역변수 목록
	// BreakPoints 탭 : BreakPoint 목록
	// Expressions 탭 : 조사식(특정 변수 혹은 명령어 확인)

}
