package week4_Thread.lab8.exam01;

class Princess extends Thread {
	public Princess() {}
	public void run() {
		synchronized(this) {
			try {
				System.out.println("공주: 잠자고 있는 중...zzz");
				wait(); // 왕자의 키스가 오기 전까지 깨어나지 않음
				System.out.println("공주: 왕자의 키스로 깨어났어요!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Prince extends Thread {
	Thread target;
	public Prince(Thread target) {
		this.target=target;
	}
	public void kissPrincess(Thread target) {
		synchronized(target) {
			System.out.println("왕자: 키스로 공주를 깨웁니다!");
			target.notify(); // 공주를 깨움
		}
	}
	public void run() {
		try {
			Thread.sleep(3000); // 왕자 등장까지 3초 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		kissPrincess(target);
	}
}

public class SleepingBeauty1 {
	public static void main(String[] args) {
		Thread princess = new Princess();
		Thread prince = new Prince(princess);
		princess.start();
		prince.start();
	}

}
