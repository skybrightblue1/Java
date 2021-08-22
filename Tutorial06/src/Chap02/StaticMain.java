package Chap02;

public class StaticMain {

	public static void main(String[] args) {
		Family.LastName = "悪";
		Family[] FamilyGroup = new Family[5];
		for(int i = 0; i<FamilyGroup.length; i++) {
			FamilyGroup[i] = new Family(); // 梓端 持失 
			FamilyGroup[i].SetInfo();
		}
		for(int i = 0; i<FamilyGroup.length; i++)
			FamilyGroup[i].ShowInfo();
		for(int i = 0; i<FamilyGroup.length; i++)
			FamilyGroup[i].MyRoom();
		Family.LivingRoom();
		FamilyGroup[0].LivingRoom();
		

	}

}
