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
		}
		System.out.println("\n---------------------");
	}
	
	static <T> void copyAnimals(List<? extends T> src, List<? super T> dest) {
		for(T animal : src) {
			dest.add(animal);
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
		makeAnimalsSpeak(animals);

	}

}
