package Chap01;

import java.util.Scanner;

public class Method04 {
	// 매개변수의 유무 여부는 특정 데이터가 함수내에서 생성, 처리 할 수 있는 데이터인지에 따라 결정된다 
	// 만약 함수 내부에서 충분히 생성할 수 있는 데이터라면 매개변수를 받지 않고 
	// 그것이 아니라면, 매개변수를 통해 외부에서 데이터를 받아 처리한다 
	public static int TotalSum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("누적합계를 구할 최대값 입력 : ");
		int Num = sc.nextInt();
		int Sum = 0;
		for(int i = 1; i<=Num ; i++)
			Sum += i;
		return Sum;
	}
	public static void main(String[] args) {
		// 누적합계 함수 만들기 (매개변수가 없는 경우)
		int Sum = TotalSum();
		System.out.println("Sum : " + Sum);
		System.out.println("Sum x 2: "+ Sum*2);
	}

}
