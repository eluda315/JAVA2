package week2_BattleRefac.player;

import week2_BattleRefac.util.GetRan;
import week2_BattleRefac.util.PrintSen;

public class Jester extends Heroes {
    
	public Jester() {}
    public Jester(String name, int hp, int power, int speed, int protection, int dodge, int accuracy) {
    	super(name, hp, power, speed, protection, dodge, accuracy);
    }

    public void 격려의선율(Player target){
		PrintSen.printSen("Jester가 연주를 합니다: 띠로로로롱띠로로로롱~~\n");
    }
    
    public boolean attack(Player target){
    	this.격려의선율(target);
    	if(GetRan.ranNum(100)<this.accuracy) {
    		PrintSen.printSen("연주가 성공했습니다!\n");
    		int r= GetRan.ranNum(10);
    		target.stress-=r;
			PrintSen.printSen(r+"만큼 스트레스가 감소되었습니다!\n");
			return true;
    	}
    	else {
    		PrintSen.printSen("연주가 실패했습니다!\n");
    		return false;
    	}
    }
}
