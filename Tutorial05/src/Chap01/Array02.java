package Chap01;

public class Array02 {

	public static void main(String[] args) {
		int[] Array = new int[5];
		int[] Array2 = Array;
		
		// ���� �ڷ���
		// Array.length : �ش� �迭�� ������ �ִ� ������ ������ ��ȯ 
		for(int i = 0; i < Array.length; i++)
			Array[i] = i+1;
		System.out.println("Array");
		for(int i = 0; i < Array.length; i++)
			System.out.print(Array[i] + " ");
		
		System.out.println();
		System.out.println("Array2");
		for(int i = 0; i < Array2.length; i++)
		    Array2[i] = i+1;
		for(int i = 0; i < Array2.length; i++)
			System.out.print(Array2[i] + " ");
		
		// ���� �ڷ���
		int num = 10;
		int num2 = num;
		num = 20;
		System.out.println("\nnum : " + num);
		System.out.println("num2 : " + num2);
	
	}

}
