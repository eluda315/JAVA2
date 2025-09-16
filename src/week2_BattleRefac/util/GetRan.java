package week2_BattleRefac.util;

public class GetRan {
	public static int ranNum(int num) {
		return (int) (Math.random() * 1000) % num;
	}
}
