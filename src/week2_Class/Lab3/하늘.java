package week2_Class.Lab3;

public class 하늘 {
	// 하늘 인스턴스 만들기
	private static 하늘 instance = null;
	
	// 생성자는 private으로
	private 하늘() {
		System.out.println("하늘 객체를 만듭니다.");
	}
	
	public static 하늘 getInstance() {
		if(instance==null) instance = new 하늘();
		return instance;
	}
}
