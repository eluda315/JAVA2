package week2_BattleRefac.player;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import week2_BattleRefac.view.Mywin;
import week2_BattleRefac.util.GetRan;


public class Player implements Attackable {
    public int hp;
    public int power;
    public int speed; // Mywin에서 사용중
    public int protection;
    public int dodge;
    public int accuracy;
    public int dice; // Mywin에서 사용중
    public int stress=0;
    public String name;
    public int stressCount=0;
    public String sentence;
    
    public Player() {}
    
    public Player(String name, int hp, int power, int speed, int protection, int dodge, int accuracy) {

    	this.name = name;
    	this.hp = hp;
    	this.power = power;
    	this.speed = speed;
    	this.protection = protection; // 방어력
    	this.dodge = dodge; // 회피
    	this.accuracy =accuracy; // 적중
    	}

    public void attack(Player target){
    	if(GetRan.hundred()<(this.accuracy-target.dodge)) {
    		Mywin.ta.append("공격이 성공했습니다!\n");
    		System.out.println("공격이 성공했습니다!");
    		
    		target.hp-=(this.power-target.protection+GetRan.six());
    		String str = this.name +"의 공격이" + target.name+ "에게"+(this.power-target.protection+GetRan.six())+"만큼의 데미지를 입혔습니다!\n";
			System.out.printf(str);
			Mywin.ta.append(str);
    	}
    	else {
    		String str = "공격이 빗나갔습니다!\n";
    		System.out.print(str);
			Mywin.ta.append(str);
    	}
    }
    
    // Mywin에서 Monster 객체의 playerStress()가 호출되는 방식.
    // 일단 그대로 두기.
    public void playerStress(Player pl,JLabel Label,String image1, String image2) {
    	if(pl.stress>=25&&stressCount==0) {
    		System.out.println("영웅이 고통의 굴림에 빠졌습니다...");
    		String str = "영웅이 고통의 굴림에 빠졌습니다...\n";
			Mywin.ta.append(str);
    		int r=(int) (Math.random() * 1000) % 4;
    		
    		
    		if(r==0) {
    			Label.setIcon(new ImageIcon(Mywin.class.getResource(image2)));
    			System.out.println("영웅의 기상에 돌입합니다!");
    			str = "영웅의 기상에 돌입합니다!\n";
    			Mywin.ta.append(str);
    			pl.power+=2;
    			System.out.println("power가 2만큼 증가합니다!");
    			str = "power가 2만큼 증가합니다!\n";
    			Mywin.ta.append(str);
    			pl.stress=0;
    			
    		}
    		else {
    			Label.setIcon(new ImageIcon(Mywin.class.getResource(image1)));
    			stressCount++;
    			System.out.println("영웅이 붕괴합니다..");
    			str = "영웅이 붕괴합니다..\n";
    			Mywin.ta.append(str);
    			pl.dodge-=10;
    			System.out.println("dodge가 10만큼 감소합니다..");
    			str = "dodge가 10만큼 감소합니다..\n";
    			Mywin.ta.append(str);
    		}
    	}
    	if(pl.stress>=50&&stressCount==1) {
    		System.out.println("스트레스가 50이 되어 영웅이 심장마비로 죽습니다.");
    		String str = "스트레스가 50이 되어 영웅이 심장마비로 죽습니다.\n";
			Mywin.ta.append(str);
    		pl.hp=0;
    	}
    }
    
    
}