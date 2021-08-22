package Chap03;

public class OverloadingMain {

	public static void Test(int Num) {
		System.out.println("Overload Method : int("+Num+")");
		
	}
	public static void Test(float Num) {
		System.out.println("Overload Method : float("+Num+")");
		
	}
	public static void Test(String Num) {
		System.out.println("Overload Method : String(" + Num+")");
		
	}
	public static void main(String[] args) {
		Test(10);
		Test(2.3f);
		Test("java");

	}

}
