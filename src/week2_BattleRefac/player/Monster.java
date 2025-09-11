package week2_BattleRefac.player;

public class Monster extends Player {
	
	public Monster() {}
    
	// 얘는 왜 또 다시 정의를 하고 있는거지...?? super로 수정.
    public Monster(String name, int hp, int power, int speed, int protection, int dodge, int accuracy) {
    	super(name, hp, power, speed, protection, dodge, accuracy);
    }
}