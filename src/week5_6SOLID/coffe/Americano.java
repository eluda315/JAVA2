package week5_6SOLID.coffe;
public class Americano implements Coffee {
    private coffeeMachine machine;

    public String prepare(){
        return machine.brew()+"How water";
    }

	public Americano(coffeeMachine machine) {
		this.machine = machine;
	}

}
