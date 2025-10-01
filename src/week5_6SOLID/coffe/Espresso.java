package week5_6SOLID.coffe;
public class Espresso implements Coffee {
    private coffeeMachine machine;

    public String prepare(){
        return machine.brew();
    }

	public Espresso(coffeeMachine machine) {
		this.machine = machine;
	}

}
