package week1_ClassLab.Myver;

public class 버스 extends Vehicle {
	//생성자
	public 버스(String name, double 연료량, double 연비) {
		super(name, 연료량,연비);
	}
	
	public void 운행하기() {
		System.out.println("부릉부릉~~");
	}
	
	@Override
	public int move() {
		운행하기();
		return super.move();
	}
}
