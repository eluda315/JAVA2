package week4_Thread.lab3;

public class Player1 extends Thread{
	String name;
	String sound;
	int time;
	public Player1(String name, String sound, int time) {
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
