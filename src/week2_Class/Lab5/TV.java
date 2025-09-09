package week2_Class.Lab5;

public class TV implements RemoteRole{
	private int vol;
	
	public int getVol() {
		System.out.println("현재 TV의 볼륨: "+this.vol);
		return this.vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("turn on TV");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("turn off TV");
	}

}
