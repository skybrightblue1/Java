package Chap01;

public class Method02 {

	// 반환 자료형의 유무는 해당 데이터가 함수가 종료된 후에도 사용이 될지에 따라 결정된다.
	// 만약 해당 함수의 특정 데이터가 함수 종료 후에도 사용해야할 경우 반환 자료형을 통해 return 하여 사용해야 한다.
	public static int TotalSum(int Num) {
		int Sum = 0;
		for (int i = 1; i<=Num; i++)
			Sum += i;
		return Sum;
	}
	public static void main(String[] args) {
		// 누적합계 함수 만들기 (반환 자료형 존재하는 경우)
		int Sum = TotalSum(100);
		System.out.println("Sum : " + Sum);
		System.out.println("Sum x 2: "+ Sum*2);

	}

}
