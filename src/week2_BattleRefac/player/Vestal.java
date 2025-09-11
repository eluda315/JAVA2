package week2_BattleRefac.player;

public class Vestal extends Heroes {
	
    public Vestal() {}
    
    public Vestal(String name, int hp, int power, int speed, int protection, int dodge, int accuracy) {
    	super(name, hp, power, speed, protection, dodge, accuracy);
    }
    
    public void 신성한위무(Player target){
    	System.out.println("Vestal이 영웅을 치료합니다!");
    	String str = "Vestal이 영웅을 치료합니다!\n";
		Mywin.ta.append(str);
    }
    public void attack(Player target){
    	this.신성한위무(target);
    	if ((int) (Math.random() * 1000) % 100 <(this.accuracy)) {
    		System.out.println("치료가 성공했습니다!");
    		String str = "치료가 성공했습니다!\n";
    		Mywin.ta.append(str);
    		int r=(int) (Math.random() * 1000) % 6;
    		if(r==0) {
    			target.hp+=r;
    			System.out.printf("%d만큼 치료되었습니다!",r);
    			System.out.println();
    			str = r+"만큼 치료되었습니다!\n";
        		Mywin.ta.append(str);
    		}
    		else if(r==1) {
    			target.hp+=r;
    			System.out.printf("%d만큼 치료되었습니다!",r);
    			System.out.println();
    			str = r+"만큼 치료되었습니다!\n";
        		Mywin.ta.append(str);
    		}
    		else if(r==2) {
    			target.hp+=r;
    			System.out.printf("%d만큼 치료되었습니다!",r);
    			System.out.println();
    			str = r+"만큼 치료되었습니다!\n";
        		Mywin.ta.append(str);
    		}
    		else if(r==3) {
    			target.hp+=r;
    			System.out.printf("%d만큼 치료되었습니다!",r);
    			System.out.println();
    			str = r+"만큼 치료되었습니다!\n";
        		Mywin.ta.append(str);
    		}
    		else if(r==4) {
    			target.hp+=r;
    			System.out.printf("%d만큼 치료되었습니다!",r);
    			System.out.println();
    			str = r+"만큼 치료되었습니다!\n";
        		Mywin.ta.append(str);
    		}
    		else if(r==5) {
    			target.hp+=r;
    			System.out.printf("%d만큼 치료되었습니다!",r);
    			System.out.println();
    			str = r+"만큼 치료되었습니다!\n";
        		Mywin.ta.append(str);
    		}
    		
    	}
    	else {
    		System.out.println("치료가 실패했습니다!");
    		String str ="치료가 실패했습니다!\n";
    		Mywin.ta.append(str);
    	}
    }

}
