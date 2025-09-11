package week1_ClassLab.Myver;

public class Driver implements Driveable {
    static int distance=0;
    private String name;
    
    // 생성자
    public Driver() {}
    public Driver(String name) {
    	this.name=name;
    }
    
	public void drive(버스 b) {
    	System.out.println("버스를 운전합니다.");
		b.move();
	}
	public void drive(탱크 t) {
    	System.out.println("탱크를 운전합니다");
		t.move();
	}
	public void drive(Vehicle[] vs) {
    	System.out.println("Vehicle[]을 운전합니다");
		for(int i=0;i<vs.length;i++) {
			vs[i].move();
		}
	}
	public void drive(Moveable[] ms) {
    	System.out.println("Movealbe[]을 운전합니다");
		for(int i=0;i<ms.length;i++) {
			ms[i].move();
		}
	}
	// 비행기는 오버로딩x
}
