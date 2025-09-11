package week2_BattleRefac.main;

import week2_BattleRefac.player.*;
import week2_BattleRefac.view.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Highwayman("Highwayman",23,5,5,3,40,75); 

		Player p2 = new Jester("Jester",19,4,7,1,60,80);
		
		Player p3 = new Vestal("Vestal",24,4,4,2,20,70);
		
		Player p4 = new Crusader("Crusader",33,7,1,4,30,90);
		
		Player p5 = new BoneSoldier("BoneSoldier1",20,4,1,5,20,70);
		
		Player p6 = new BoneSoldier("BoneSoldier2",20,4,1,5,20,70);
		
		Player p7 = new BoneCourtier("BoneCourtier",15,5,3,1,40,80);
		
		Player p8 = new BoneArbalest("BoneArbalest",15,6,3,2,30,80);
	     
	    Mywin win = new Mywin(p1, p2, p3, p4, p5, p6, p7, p8);
	    win.setVisible(true);
	}

}
