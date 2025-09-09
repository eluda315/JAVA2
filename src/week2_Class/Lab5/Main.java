package week2_Class.Lab5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl MyRimocon = new RemoteControl(new TV());
		

		MyRimocon.rr.turnOn();
		
		MyRimocon.turnOn();
		MyRimocon.turnOff();
		MyRimocon.setVol(5);
		MyRimocon.getVol();
		MyRimocon.mute();
		MyRimocon.getVol();
		
		MyRimocon.changeMode(new Audio());
		MyRimocon.turnOn();
		MyRimocon.turnOff();
	
		MyRimocon.changeMode(new Car());
		MyRimocon.turnOn();
		MyRimocon.turnOff();
	}
}