package week4_Thread.lab5;

class BankAccount {
	int balance;
	
	public synchronized void deposit(int amount) {
		this.balance+=amount;
	}
	public synchronized void withdraw(int amount) {
		this.balance-=amount;
	}
	public synchronized int getBalance() {
		System.out.println("잔고: "+this.balance);
		return this.balance;
	}
}

class User implements Runnable {
	BankAccount account;
	public User(BankAccount account) {
		this.account=account;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++) {
			account.deposit(1000);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			account.withdraw(1000);
			if(account.getBalance()<0) {
				System.out.println("error!!");
			}
		}
	}
}

public class MyBank {
	static BankAccount account = new BankAccount();

	public static void main(String[] args) {
		// 유저들이 같은 계좌를 공유하도록 생성 -> 이 정도론 error 출력이 안 되넹..
		Thread one = new Thread(new User(account));
		Thread two = new Thread(new User(account));
		Thread three = new Thread(new User(account));
		Thread four = new Thread(new User(account));
		Thread five = new Thread(new User(account));
		
		one.start();
		two.start();
		three.start();
		four.start();
		five.start();
	}

}
