package week2_BattleRefac.player;

public class Heroes extends Player {

	public Heroes() {}
    public Heroes(String name, int hp, int power, int speed, int protection, int dodge, int accuracy) {
    	super(name, hp, power, speed, protection, dodge, accuracy);
    	this.stress=0;
    }
    
    
    // 오버라이딩된 playerStress()는 사용되지 않아 삭제.
    //public void playerStress(Player p1) {}
}
