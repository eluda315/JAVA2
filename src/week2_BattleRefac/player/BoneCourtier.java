package week2_BattleRefac.player;

import week2_BattleRefac.util.GetRan;
import week2_BattleRefac.util.PrintSen;

public class BoneCourtier extends Monster {

	public BoneCourtier() {}
    
    public BoneCourtier(String name, int hp, int power, int speed, int protection, int dodge, int accuracy) {

    	super(name, hp, power, speed, protection, dodge, accuracy);

    }
    public void 미혹의술잔(Player target){
    	PrintSen.printSen("BoneCourtier가 술을 뿌립니다!\n");
    }

    public void attack(Player target){
    	this.미혹의술잔(target);
    	if (GetRan.hundred() <(this.accuracy-target.dodge)) {
    		PrintSen.printSen("공격이 성공했습니다!\n");
    		
    		int plus_stress = GetRan.six()+5;
			target.stress+= plus_stress;
			PrintSen.printSen(this.name+"가"+target.name+"의"+"스트레스를"+plus_stress+"만큼 증가시켰습니다!\n");
    	}
    	else {
    		PrintSen.printSen("공격이 빗나갔습니다!\n");
    	}
	 }
}