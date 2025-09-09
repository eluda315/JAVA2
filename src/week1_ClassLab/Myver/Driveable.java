package week1_ClassLab.Myver;

public interface Driveable {

	// 기본메소드 정의
    public default void drive() {
    	System.out.println("모든 Vehicle을 운전할 수 있습니다. 움직일 객체를 인자로 넣어주세요.");
    }
    
    // 매개변수가 있는 메소드 오버라이딩
    public default void drive(Vehicle v) {
    	System.out.println("모든 Vehicle을 운전할 수 있습니다.");
    	v.move();
    }
    public default void drive(Moveable m) {
    	System.out.println("모든 Moveable한 것을 운전할 수 있습니다.");
    	m.move();
    }

}
