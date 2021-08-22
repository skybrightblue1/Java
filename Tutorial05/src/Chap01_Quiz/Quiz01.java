package Chap01_Quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 정수 10개를 입력 받은 뒤 그 중 3의 배수만 출력하시오 
		// 위 입력 받은 10개의 정수 중 가장 큰 수와 10 개의 총합,평균을 출력하시오
		Scanner sc = new Scanner(System.in);
		int[]Array = new int[10];
		int max = 0, total = 0;
		
		System.out.print("정수 10개 입력 : ");
		for(int i = 0; i < Array.length; i++) {
			Array[i] = sc.nextInt();
			if (Array[i] > max) max = Array[i];
			total += Array[i];
		}

		
		System.out.println("3의 배수 출력 : ");
		for(int i = 0; i < Array.length; i++)
			if (Array[i] % 3 == 0)
			System.out.print(Array[i] + " ");
		
		System.out.println("\n가장 큰 수 : " + max);
		System.out.println("평균 : "+ (float)(total/Array.length));
		

	}

}
