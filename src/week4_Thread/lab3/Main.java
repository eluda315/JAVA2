package week4_Thread.lab3;

public class Main {

	public static void main(String[] args) {
		// Thread 상속
		Thread p1 = new Player1("짱구","신난다신난다~",20);
		Thread p2 = new Player1("맹구","훌쩍~",20);
		Thread p3 = new Player1("흰둥이","멍멍머멍~",20);
		
		// Runnable 구현
		Thread th1 = new Thread(new Player2("**짱구","신난다신난다~",10));
		Thread th2 = new Thread(new Player2("**맹구","맹~",10));
		Thread th3 = new Thread(new Player2("**흰둥이","멍멍머멍~",10));
		
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		System.out.println(p3.getName());
		
		System.out.println(th1.getName());
		System.out.println(th2.getName());
		System.out.println(th3.getName());
		
		// 처음 초기화로 이름을 주는건 Player1,2의 필드. 지금 해주는 건 스레드 자체의 이름을 변경해주는 것
		th1.setName("**짱구!");
		System.out.println(th1.getName());
		
		p1.start();
		p2.start();
		p3.start();
		
		th1.start();
		th2.start();
		th3.start();

	}

}
