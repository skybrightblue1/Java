package Chap01;

import java.util.Scanner;

public class Method05 {

	// 매개변수와 반환값이 둘다 없는 경우 
	public static void TotalSum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("누적합계를 구할 최대값 입력 : ");
		int Num = sc.nextInt();
		int Sum = 0;
		for (int i = 1; i<=Num; i++)
			Sum += i;
		System.out.println("1 ~ " + Num + " 까지의 누적합계 : " + Sum);
	}
	public static void main(String[] args) {
		TotalSum();
	}

}
