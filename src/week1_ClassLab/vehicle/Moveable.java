package week1_ClassLab.vehicle;

public interface Moveable {
	public default int move() {
		System.out.println("move move move!");
		return 0;
	}
	
}

