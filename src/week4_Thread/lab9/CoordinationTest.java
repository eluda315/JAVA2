package week4_Thread.lab9;

class Buffer {
	private int data;
	private boolean empty=true;
	
	public synchronized int get() {
		while(empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		empty=true;
		notifyAll();
		return data;
	}
	public synchronized void put(int d) {
		while(!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		empty=false;
		this.data=d;
		notifyAll();
	}
}

class Producer extends Thread {
	private Buffer buffer;
	private int data;
	public Producer(Buffer b) {
		buffer = b;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			data=i;
			System.out.println("생산자: "+data+"번 케익을 생산하였습니다.");
			buffer.put(data);
			try {
				sleep((int)(Math.random()*100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Consumer extends Thread {
	private Buffer buffer;
	private int data;
	public Consumer(Buffer b) {
		buffer=b;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			data=buffer.get();
			System.out.println("소비자: "+data+"번 케익을 소비하였습니다");
			try {
				sleep((int)(Math.random()*100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class CoordinationTest {
	public static void main(String[] args) {
		Buffer b= new Buffer();
		Producer t1 = new Producer(b);
		Consumer t2 = new Consumer(b);
		t1.start();
		t2.start();
	}

}
