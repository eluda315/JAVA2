package week1_ClassLab.Myver;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		버스 b = new 버스("타요버스",100,12);
		비행기 a = new 비행기("쑝비행기",100,0.1);
		탱크 t = new 탱크("탱크탱크", 50,4);
		Vehicle[] vs = {b,a,t};
		Vehicle.show(vs);
		
		Driver d = new Driver("미미");
		//d.drive();
		d.drive(vs);
		
		Vehicle.show(vs);
	}

}
