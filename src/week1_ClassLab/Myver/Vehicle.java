package week1_ClassLab.Myver;

public class Vehicle implements Moveable {
    private int distance = 0;
    public String name;
    private double 연비;
    private double 연료량;
    
	@Override
	public int move() {
		// 공통기능: 주행거리 출력 및 연료 사용 계산
		while(true) {
			if(연료량<=0) {
				System.out.println("연료가 부족합니다. 이 차는 더 이상 움직일 수 없습니다.");
				System.out.println("총 주행거리: "+ distance +"km");
				break;
			}
			distance += 10;
			연료량 -= (10/연비);
			// 예시 출력에 나와있는 상태출력은 어디서 돌려야 할까. 여기서 돌려야 할까?
		}
		return distance;
	}
	
	// show 관련 메소드는 모두 static으로 선언
	public static void show_header() {
		System.out.println("---------------------------------------------------------------------------");
		System.out.printf("  %16s | %10s(km)  %10s(l)  %10s(km/l)\n", "이름" , "총주행거리", "연료량", "연비") ;
		System.out.println("---------------------------------------------------------------------------");
	}
	public static void show(Vehicle[] vs) {
		show_header();
		for(int i=0;i<vs.length;i++) {
			// show관련 메소드는 다 static인데 this를 사용 못하지 않나?
			// 힌트코드에서는 어떻게 this를 사용하는 걸까? 일단 나는 출력문으로 작성하겠다
			System.out.printf("%16s | %10d %10.2f %10.2f\n", vs[i].name, vs[i].distance , vs[i].연료량, vs[i].연비) ;
		}
	}

}
