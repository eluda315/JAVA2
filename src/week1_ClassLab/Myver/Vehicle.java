package week1_ClassLab.Myver;

public class Vehicle implements Moveable {
    private int distance = 0;
    public String name;
    private double 연비;
    private double 연료량;
    
    // 생성자
    public Vehicle() {}
    public Vehicle(String name, double 연료량, double 연비) {
    	this.name=name;
    	this.연료량=연료량;
    	this.연비=연비;
    	this.distance = 0;
    }
    
	@Override
	public int move() {
		// 공통기능: 주행거리 출력 및 연료 사용 계산
		do {
			double 필요연료 = 10/연비;
			if(연료량<필요연료) {
				Driver.distance += this.distance; // 총 주행거리 계산
				System.out.println("연료가 부족합니다. 더 이상 "+name+"을(를) 움직일 수 없습니다.");
				System.out.println("총 주행거리: "+ Driver.distance +"km\n"); 
				break;
			}
			distance += 10;
			연료량 -= 필요연료;
			System.out.printf("%16s |   %10d         %10.2f        %10.2f\n", name, distance , 연료량, 연비) ;
		} while(true);
		return distance;
	}
	
	// show 관련 메소드는 모두 static으로 선언
	public static void show_header() {
		System.out.println("---------------------------------------------------------------------------");
		System.out.printf(" %16s | %10s(km)  %10s(l)  %10s(km/l)\n", "이름" , "총주행거리", "연료량", "연비") ;
		System.out.println("---------------------------------------------------------------------------");
	}
	public static void show(Vehicle[] vs) {
		show_header();
		for(int i=0;i<vs.length;i++) {
			System.out.printf("%16s |   %10d         %10.2f        %10.2f\n", vs[i].name, vs[i].distance , vs[i].연료량, vs[i].연비) ;
		}
		System.out.println("---------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
	}

}
