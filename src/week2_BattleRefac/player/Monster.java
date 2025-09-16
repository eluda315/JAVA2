package week2_BattleRefac.player;

import week2_BattleRefac.util.GetRan;
import week2_BattleRefac.util.PrintSen;

public class Monster extends Player {
	
	public Monster() {}
    
	// 얘는 왜 또 다시 정의를 하고 있는거지...?? super로 수정.
    public Monster(String name, int hp, int power, int speed, int protection, int dodge, int accuracy) {
    	super(name, hp, power, speed, protection, dodge, accuracy);
    }
    
    public boolean attack(Heroes target) {
    	boolean attack_result = super.attack(target);
    	if(attack_result) {
            int r = GetRan.ranNum(11);
            target.stress+=r;
            PrintSen.printSen(this.name + "의 공격으로 인해 " + target.name + "의 스트레스가 " + r + "만큼 증가합니다!\n");
    	}
    	return attack_result;
    }
}