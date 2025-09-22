package week4_Thread.lab1;

public class MyThread extends Thread {
	public void run() {
		this.work();
	}
	public void work() {
		for(int i=0;i<10;i++) {
			System.out.println("thread로 만든 "+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
