package week2_ClassLab;

public class 짱구 extends 엄마{
	private 핸드폰 phone = new 핸드폰();

	public 핸드폰 getPhone() {
		return phone;
	}

	public void setPhone(핸드폰 phone) {
		this.phone = phone;
	}
	public void 요리하기() {
		System.out.println("컵라면을 만들어요");
	}
	public void 청소하기() {
		System.out.println("이불을 덮어요~");
	}
	public void 열심히공부하기() {
		System.out.println("열공!");
	}
	public void 엄마처럼요리하기() {
		super.요리하기();
	}
	public void 할머니처럼요리하기() {
		super.할머니처럼요리하기();
	}
	public void 요리하기(엄마 mom) {
		mom.요리하기();
	}
	public void 요리하기(할머니 grandma) {
		grandma.요리하기();
	}
	public void 공부하기() {
		if(phone==null) 열심히공부하기();
		else {
			for(int i=0;i<3;i++) {
				System.out.println("공부하는 척...");
			}
		}
	}
}
