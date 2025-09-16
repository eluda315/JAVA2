package week3_Generic_Collection.pecs.ex01;

import java.util.ArrayList;
import java.util.List;

// 실습을 위한 클래스 계층 구조
// Object > Fruit > Apple > GoldenApple
class Fruit {
	public String toString() { return "과일"; }
}

class Apple extends Fruit {
	public String toString() { return "사과"; }
}

class GoldenApple extends Apple {
	public String toString() { return "황금사과"; }
}

public class GenericLab {

	public static void main(String[] args) {
		List<GoldenApple> goldenApples = new ArrayList<>();
		goldenApples.add(new GoldenApple());
		
		List<Apple> apples = new ArrayList<>();
		apples.add(new Apple());
		
		List<Fruit> fruits = new ArrayList<>();
		List<Object> objects = new ArrayList<>();
		
		System.out.println("복사 전 fruits: "+fruits);
		System.out.println("복사 전 objects: "+objects);
		System.out.println("---------------------------------");
		
		System.out.println("황금사과 -> 과일 바구니로 복사");
		copy(goldenApples, fruits);
		System.out.println("복사 후 fruits: "+fruits);
		System.out.println();
		
		System.out.println("사과 -> 최상위 바구니로 복사");
		copy(apples, objects);
		System.out.println("복사 후 objects: "+objects);
	}
	
	public static <T> void copy(List<? extends T> src, List<? super T> dest) {
		for(T item:src) {
			dest.add(item);
		}
	}
}