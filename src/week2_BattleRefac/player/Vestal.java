package week2_BattleRefac.player;

import week2_BattleRefac.util.GetRan;
import week2_BattleRefac.util.PrintSen;

public class Vestal extends Heroes {
	
    public Vestal() {}
    public Vestal(String name, int hp, int power, int speed, int protection, int dodge, int accuracy) {
    	super(name, hp, power, speed, protection, dodge, accuracy);
    }
    
    public void 신성한위무(Player target){
    	PrintSen.printSen("Vestal이 영웅을 치료합니다!\n");
    }
    public boolean attack(Player target){
    	this.신성한위무(target);
    	if(GetRan.ranNum(100)<this.accuracy) {
    		PrintSen.printSen("치료가 성공했습니다!\n");
    		int r = GetRan.ranNum(6);
    		target.hp+=r;
    		PrintSen.printSen(r+"만큼 치료되었습니다!\n");
    		return true;
    	} else {
    		PrintSen.printSen("치료가 실패했습니다!\n");
    		return false;
    	}
    }
}
