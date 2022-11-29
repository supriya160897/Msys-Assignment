package inheritance.com;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
class CollectionMap {

	public static void main(String args[]) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Supriya");
		map.put(101, "Sanjay");
		map.put(102, "Kinge");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
