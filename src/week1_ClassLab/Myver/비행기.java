package week1_ClassLab.Myver;

public class 비행기 extends Vehicle {
	public 비행기(String name, double 연료량, double 연비) {
		super(name, 연료량,연비);
	}
	
	public void 운행하기() {
		System.out.println("쓔우우우웅~~");
	}
	
	@Override
	public int move() {
		운행하기();
		return super.move();
	}
}
