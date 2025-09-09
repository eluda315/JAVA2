package week2_Class.Lab5;

public interface RemoteRole {
	public static final int MAX_VOL=10;
	public static final int MIN_VOL=0;
	
	public void turnOn();
	public void turnOff();
	
	public void setVol(int vol);
	public int getVol();
	
	public default void mute() {
		System.out.println("무음 처리 합니다");
		this.setVol(MIN_VOL);
	}
}
