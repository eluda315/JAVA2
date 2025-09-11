package week2_ClassLab;

public class 엄마 extends 할머니{
	private String 일기장;
	public 핸드폰 핸드폰압수bag;
	
	public void 요리하기() {
		System.out.println("스파게티를 만들어요");
	}
	public void 청소하기() {
		System.out.println("청소기를 돌려요");
	}
	public void 할머니처럼요리하기() {
		super.요리하기();
	}
	
	public void 해드폰뺏기(짱구 짱) {
		this.핸드폰압수bag = 짱.getPhone();
		짱.setPhone(null);
	}
}
