package week4_Thread.lab7;

class Pig implements Runnable {
	private final String name;
	int time;
	public Pig(String name) {
		this.name=name;
		this.time=(int)(Math.random()*7000)+3000;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name+" "+(time/1000)+"초 동안 밖에서 놀다 올게영~");
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name+" 다 놀고 집 앞 도착!");
	}
	
}

public class LittlePig3Test {

	public static void main(String[] args) {
		// Runnable로 구현했으므로 Thread를 생성해주기.		
		Thread pig1 = new Thread(new Pig("첫째 돼지"));
		Thread pig2 = new Thread(new Pig("둘째 돼지"));
		Thread pig3 = new Thread(new Pig("셋째 돼지"));
		
		pig1.start();
		pig2.start();
		pig3.start();
		
		try {
			pig1.join();
			pig2.join();
			pig3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("아기돼지삼형제: 엄마~ 문 열어주세영");
		System.out.println("엄마 돼지: 문 열어줄게~");
	}

}
