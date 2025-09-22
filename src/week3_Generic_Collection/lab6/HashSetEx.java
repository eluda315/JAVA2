package week3_Generic_Collection.lab6;

import java.util.*;

public class HashSetEx {
	// 출력용 메소드
	public static <E> void show(Set <E> s) {
		for (E e : s) {
			System.out.println(e + " ");
		}
		System.out.println("\n-------------------------");
		
		// iterator
		Iterator <E> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next() + ", ");
		}
		System.out.println("\n-------------------------");
	}

	public static void main(String[] args) {
		

	}

}
