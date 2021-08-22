package Chap02;

public class StaticMain {

	public static void main(String[] args) {
		Family[] FamilyGroup = new Family[5];
		for(int i = 0; i<FamilyGroup.length; i++) {
			FamilyGroup[i] = new Family();
			FamilyGroup[i].SetInfo();
		}
		for(int i = 0; i<FamilyGroup.length; i++)
			FamilyGroup[i].ShowInfo();
		

	}

}
