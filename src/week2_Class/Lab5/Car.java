package week2_Class.Lab5;

public class Car implements RemoteRole {
	private int vol;
	
	public int getVol() {
		System.out.println("현재 Car의 볼륨: "+this.vol);
		return this.vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Car의 시동을 킵니다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Car의 시동을 끕니다");
	}

}
