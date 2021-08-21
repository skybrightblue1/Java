package Chap01;

public class Method03 {


	public static void TotalSum(int Num) {
		int Sum = 0;
		for (int i = 1; i<=Num; i++)
			Sum += i;
		System.out.println("Sum : " + Sum);
	}
	public static void main(String[] args) {
		// 누적합계 함수 만들기 (반환 자료형 없는 경우) 함수가 종료되면 그 데이터를 다시 쓰진 못함. 
		TotalSum(100);
	
	}

}
