package week2_BattleRefac.player;

import week2_BattleRefac.util.PrintSen;

public class Crusader extends Heroes {

    public Crusader() {}
    
    public Crusader(String name, int hp, int power, int speed, int protection, int dodge, int accuracy) {

    	super(name, hp, power, speed, protection, dodge, accuracy);

    }
    
    public void 강타(Player target){
    	PrintSen.printSen("Crusader가 검으로 내리칩니다!\n");
    }
    public void attack(Player target){
    	this.강타(target);
    	super.attack(target);
    }
}
