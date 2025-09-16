package week2_BattleRefac.player;

import week2_BattleRefac.util.PrintSen;

public class BoneArbalest extends Monster {
	
	public BoneArbalest() {}
    
    public BoneArbalest(String name, int hp, int power, int speed, int protection, int dodge, int accuracy) {

    	super(name, hp, power, speed, protection, dodge, accuracy);

    }

    public void 쇠뇌발사(Player target){
    	PrintSen.printSen("BoneArbalest가 화살을 쏩니다!\n");
    }
    public boolean attack(Player target){
    	this.쇠뇌발사(target);
    	boolean result = super.attack(target);
    	return result;
    }

}
