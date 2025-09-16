package week3_Generic_Collection.lab4;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		// add, set, remove 메소드 사용해보기
		list.add("pig");
		list.add("dog");
		list.add("cat");
		list.add("rabbit");
		list.set(0, "bear");
		list.remove(1);
		
		// iterator로 순회해보기(Iterator, listIterator의 차이는 뭘까?)
		// + 반복자를 연결하고 list를 수정하면 에러가 발생
		// -> 이게 에러가 나는 에러가 무엇일까?
		
		// 단방향 순회
		Iterator <String> e = list.listIterator();
		while(e.hasNext()) {
			System.out.println(e.next()); // hasNext()와 next()의 작동방식 다시 복습
		}
		
		
		// 1. listIterator의 고유 기능 - 양방향 순회(Previous 가능!)
		System.out.println("\n--- 역방향 순회 (ListIterator) ---");
		ListIterator<String> iter = list.listIterator(list.size()); // 커서를 리스트의 끝에서 시작
		while(iter.hasPrevious()) {
		    System.out.println(iter.previous());
		}
		// 2. 순회하면서 수정해보기
	}

}
