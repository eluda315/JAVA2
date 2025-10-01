package week5_6SOLID.coffe;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 필요한 기기 생성
		coffeeMachine machine1 = new EspressoCoffeeMachine();
		coffeeMachine machine2 = new DripCoffeMachine();
		MilkFrother frother = new MilkFrother();
		
		// 에스프레소 만들기
		Coffee espresso = new Espresso(machine1);
		System.out.println(espresso.prepare());
		
		
		// 아메리카노 만들기
		Coffee americano = new Americano(machine2);
		System.out.println(americano.prepare());
		
		
		// 라떼 만들기 - DI 적용
		CoffeeMaker maker = new CoffeeMaker();
		maker.setCoffee(new Latte(machine1, frother));
		maker.makeCoffee();
		
		// 이제 내가 할 일
		// 메뉴 추가해보기. 커피 머신에 다른 기능 붙여보던가. 다른 구조 만들어보던가. 결제를 한다면?(할인정책?)-> 리팩토링의 효과를 느껴봐라
		// 추가, 확장이 괜찮군... 이런거

	}

}
