package week2_BattleRefac.player;

import week2_BattleRefac.util.PrintSen;

public class Highwayman extends Heroes {
	
	public Highwayman() {}
    
    public Highwayman(String name, int hp, int power, int speed, int protection, int dodge, int accuracy) {

    	super(name, hp, power, speed, protection, dodge, accuracy);

    }

	public void 권총사격(Player target){
    	PrintSen.printSen("Highwayman 이 총을 쐈습니다!\n");
    }
	 public boolean attack(Player target){
		 this.권총사격(target);
		 boolean result = super.attack(target);
		 return result;
	 }

}
