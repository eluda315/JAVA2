package week3_Generic_Collection.pecs.ex03;

// 테스트를 위해 클래스 정의
class Fruit {}
class Apple extends Fruit {}
class Box<T> {
    private T item;
    
    // T를 매개변수로 받고(쓰기), T를 반환(읽기)하는 메소드
    public T replace(T newItem) {
        T oldItem = this.item;
        this.item = newItem;
        return oldItem;
    }
}

public class Main {
	public static void main(String[] args) {
		Box<? extends Fruit> fruitBox = new Box<Apple>();
		
		//fruitBox.replace(new Apple());
	}
}
