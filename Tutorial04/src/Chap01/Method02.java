package Chap01;

public class Method02 {

	// ��ȯ �ڷ����� ������ �ش� �����Ͱ� �Լ��� ����� �Ŀ��� ����� ������ ���� �����ȴ�.
	// ���� �ش� �Լ��� Ư�� �����Ͱ� �Լ� ���� �Ŀ��� ����ؾ��� ��� ��ȯ �ڷ����� ���� return �Ͽ� ����ؾ� �Ѵ�.
	public static int TotalSum(int Num) {
		int Sum = 0;
		for (int i = 1; i<=Num; i++)
			Sum += i;
		return Sum;
	}
	public static void main(String[] args) {
		// �����հ� �Լ� ����� (��ȯ �ڷ��� �����ϴ� ���)
		int Sum = TotalSum(100);
		System.out.println("Sum : " + Sum);
		System.out.println("Sum x 2: "+ Sum*2);

	}

}
