//다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다.
//이 클래스의 멤버중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
//(단, 모든 병사의 공격력과 방어력은 같아야한다.)

class Marine;
	int x = 0, y = 0; // 컴퓨터게임의 병사들은 모두 위치가 다르기때문에 다른 x, y값을 가짐
	int hp = 60;
	static int weapon = 6; // 공격력과 방어력은  모든 병사가 같아야 하므로 static 붙여야 함
	static int armor = 0;// 공격력과 방어력은  모든 병사가 같아야 하므로 static 붙여야 함
	
	static void weaponUp() { // static 필드를 이용하는 메서드이므로   static 입력
		weapon++;
	}
	
	static void armorUp() { // static 필드를 이용하는 메서드이므로   static 입력
		armor++;
	}
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
