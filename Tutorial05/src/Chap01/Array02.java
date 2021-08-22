package Chap01;

public class Array02 {

	public static void main(String[] args) {
		int[] Array = new int[5];
		int[] Array2 = Array;
		
		// 참조 자료형
		// Array.length : 해당 배열이 가지고 있는 원소의 개수를 반환 
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
		
		// 원시 자료형
		int num = 10;
		int num2 = num;
		num = 20;
		System.out.println("\nnum : " + num);
		System.out.println("num2 : " + num2);
	
	}

}
