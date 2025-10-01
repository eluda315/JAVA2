package week4_Thread.lab8.exam02;

class Princess extends Thread {
	private final Object lock;
	public Princess(Object lock) {
		this.lock=lock;
	}
	public void run() {
		synchronized(lock) {
			try {
				System.out.println("공주: 잠자고 있는 중...zzz");
				lock.wait(); // wait()은 Object 클래스 소속 메소드
				System.out.println("공주: 왕자의 키스로 깨어났어요!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Prince extends Thread {
	private final Object lock;
	public Prince(Object lock) {
		this.lock=lock;
	}
	public void kissPrincess() {
		synchronized(lock) {
			System.out.println("왕자: 키스로 공주를 깨웁니다!");
			lock.notify(); // 공주를 깨움
		}
	}
	public void run() {
		try {
			Thread.sleep(3000); // 왕자 등장까지 3초 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		kissPrincess();
	}
}

public class SleepingBeauty2 {
	public static void main(String[] args) {
		Object lock = new Object();
		Thread princess = new Princess(lock);
		Thread prince = new Prince(lock);
		
		princess.start();
		prince.start();
	}

}
