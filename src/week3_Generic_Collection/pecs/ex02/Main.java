package week3_Generic_Collection.pecs.ex02;

import java.util.ArrayList;
import java.util.List;

abstract class Animal {
	abstract void speak();
}
class Dog extends Animal {
	void speak() {
		System.out.print("멍");
	}
}
class Cat extends Animal {
	void speak() {
		System.out.print("야옹");
	}
}

public class Main {
	static List<Animal> animals = new ArrayList<>();
	static void makeAnimalsSpeak(List<? extends Animal> animals) {
		for(Animal a:animals) {
			a.speak();
			//a.add(new Dog());
		}
		System.out.println("\n---------------------");
	}
	static <T> void copyAnimals(List<? extends T> src, List<? super T> dest) {
		for(T animal : src) {
			dest.add(animal);
			//dest.speak();
		}
	}

	public static void main(String[] args) {
		animals.add(new Dog());
		animals.add(new Cat());
		makeAnimalsSpeak(animals);
		
		List<Dog> dogs = List.of(new Dog(), new Dog(), new Dog());
		List<Cat> cats = List.of(new Cat(), new Cat(), new Cat());
		copyAnimals(dogs, animals);
		copyAnimals(cats, animals);
		//copyAnimals(animals, cats);
		// 에러인 이유
		// 첫 번째 인자 T 타입 추론: Animal or Object
		// 두 번째 인자 T 타입 추론: Cat or Cat의 자식
		// 하나의 공통적인 T 타입이 없음 -> 에러!
		makeAnimalsSpeak(animals);
	}
}
