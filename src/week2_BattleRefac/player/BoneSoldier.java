package week2_BattleRefac.player;

import week2_BattleRefac.util.PrintSen;

public class BoneSoldier extends Monster {
	
	public BoneSoldier() {}
    
    public BoneSoldier(String name, int hp, int power, int speed, int protection, int dodge, int accuracy) {

    	super(name, hp, power, speed, protection, dodge, accuracy);

    }

    public void 묘지가르기(Player target){
    	PrintSen.printSen("BoneSoldier가 칼을 휘두릅니다!\n");
    }

    public boolean attack(Player target){
    	this.묘지가르기(target);
		boolean result = super.attack(target);
		return result;
	 }
}
