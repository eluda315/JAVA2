package week4_Thread.lab4;

public class Car extends Thread{
	String name;
	int speed;
	volatile boolean stop=false; // 이게 뭔지 검색해보자.
	
	public Car(String name, int speed) {
		this.name=name;
		this.speed=speed;
		System.out.println(name+" 생성");
	}
	
	public void run() {
		for(int i=0;i<=CarRacing.goal;i++) {
			System.out.println(name+": "+"km..");
			
		}
	}
}
