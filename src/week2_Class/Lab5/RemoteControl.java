package week2_Class.Lab5;

public class RemoteControl implements RemoteRole{
	RemoteRole rr = null;
	
	// 생성자
	public RemoteControl(Audio au) {
		this.rr = au;
	}
	public RemoteControl(TV tv) {
		this.rr = tv;
	}
	public RemoteControl(Car car) {
		this.rr = car;
	}
	
	// 모드 바꾸기
	public void changeMode(Audio au) {
		System.out.println("change mode to Audio");
		this.rr = au;
	}
	public void changeMode(Car car) {
		System.out.println("change mode to Car");
		this.rr = car;
	}
	public void changeMode(TV tv) {
		System.out.println("change mode to TV");
		this.rr = tv;
	}
	
	// 전원 메소드
	public void turnOn() {
		rr.turnOn();
	}
	public void turnOff() {
		rr.turnOff();
	}
	public void setVol(int vol) {
		this.rr.setVol(vol); //this를 꼭 다 붙여야 할까? 내가 알기론 알아서 this.rr로 해설해준다고 들었는데.
	}
	public int getVol() {
		return rr.getVol();
	}
}
