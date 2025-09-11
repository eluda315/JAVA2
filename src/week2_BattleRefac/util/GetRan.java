package week2_BattleRefac.util;

public class GetRan {
	public static int hundred() {
		return (int) (Math.random() * 1000) % 100;
	}
	public static int four() {
		return (int) (Math.random() * 1000) % 4;
	}
	public static int six() {
		return (int) (Math.random() * 1000) % 6;
	}
	public static int eleven() {
		return (int) (Math.random() * 1000) % 11;
	}
	public static int ten() {
		return (int) (Math.random() * 1000) % 10;
	}
}
