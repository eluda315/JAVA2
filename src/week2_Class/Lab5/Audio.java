package week2_Class.Lab5;

public class Audio implements RemoteRole {
	private int vol;
	
	public int getVol() {
		System.out.println("현재 Audio의 볼륨: "+this.vol);
		return this.vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	@Override
	public void turnOn() {
		System.out.println("turn on Audio");
	}
	
	public void turnOff() {
		System.out.println("turn off Audio");
	}

}
