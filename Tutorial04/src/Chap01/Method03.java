package Chap01;

public class Method03 {


	public static void TotalSum(int Num) {
		int Sum = 0;
		for (int i = 1; i<=Num; i++)
			Sum += i;
		System.out.println("Sum : " + Sum);
	}
	public static void main(String[] args) {
		// �����հ� �Լ� ����� (��ȯ �ڷ��� ���� ���) �Լ��� ����Ǹ� �� �����͸� �ٽ� ���� ����. 
		TotalSum(100);
	
	}

}
