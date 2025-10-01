package week5_6SOLID.coffe;
public class Latte implements Coffee {
    private coffeeMachine machine;
    private MilkFrother milkFrother;

    public Latte(coffeeMachine machine, MilkFrother milkFrother) {
		this.machine = machine;
		this.milkFrother = milkFrother;
	}

	public String prepare(){
        return machine.brew() + milkFrother.frothMilk();
    }

}
