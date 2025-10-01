package week5_6SOLID.coffe;
public class CoffeeMaker {
	Coffee coffee;

	// 생성자 주입
    public void setCoffee(Coffee coffee){
    	this.coffee=coffee;
    }

    public void makeCoffee(){
    	System.out.println(coffee.prepare());
    }

}
