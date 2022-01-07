package inheritance.com;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {
	public static void main(String[] args) {
		List<Integer> array = new ArrayList<>();
		array.add(1);
		array.add(12);
		array.add(15);
		array.add(13);
		for (Integer integer : array) {
			System.out.println(integer);

		}
		array.remove(1);
		System.out.println("\nAfter removing index one element array will be  :" + array);
		System.out.println("Is empty arraye   : " + array.isEmpty());
		System.out.println("size of array will be : " + array.size());

	}

}
