package week4_Thread.lab3;

public class Player2 implements Runnable {
	String name;
	String sound;
	int time;
	public Player2(String name, String sound, int time) {
		this.name=name;
		this.sound=sound;
		this.time=time;
	}
	
	public void run() {
		int i=0;
		while(true) {
			if(i==time) break;
			System.out.printf("%d %s %s \n", (i+1),name,sound);
			i++;
		}
		System.out.println(name+"끝");
	}
}
