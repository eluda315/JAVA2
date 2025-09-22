package week4_Thread.lab1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new MyThread();
		t1.start();
		
		Thread t2 = new Thread(new MyRunnable());
		t2.start();
		
		// 동작 순서에는 규칙 따윈 없다!
		
		Thread t3 = new Thread(
				new Runnable() {
					@Override
					public void run() {
						// TODO Auto-generated method stub
						for(int i=0;i<10;i++) {
							System.out.println("짝!"+i);
						}
					}					
				}				
				);
		
		t3.start();
		
		Thread t4 = new Thread(() -> {
			for(int i=0;i<10;i++) {
				System.out.println("꿍!"+i);
			}
		});
		t4.start();
	}

}
