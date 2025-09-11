package week1_ClassLab.Myver;

public class 탱크 extends Vehicle {
	//생성자
	public 탱크(String name, double 연료량, double 연비) {
		super(name, 연료량,연비);
	}
	
	public void 운행하기() {
		System.out.println("탱크탱크탱크~~");
	}
	
	@Override
	public int move() {
		운행하기();
		return super.move();
	}

}
