package week4_Thread.lab1;

public class MyRunnable implements Runnable{
	public void run() {
		this.work();
	}
	public void work() {
		for(int i=10;i<20;i++) {
			System.out.println("Runnable로 만든 "+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
