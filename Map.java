package assignment;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.TreeMap;
public class Map {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "asha");
		hm.put(2, "ravi");
		hm.put(3, "ram");
		System.out.println("\nThe elements of Hashmap are ");
		for (Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(4, "sravs");
		ht.put(5, "priya");
		ht.put(6, "Jeeva");
		ht.put(7, "John");
		System.out.println("\nThe elements of HashTable are ");
		for (Entry<Integer, String> n : ht.entrySet()) {
			System.out.println(n.getKey() + " " + n.getValue());
		}
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(8, "caroline");
		map.put(9, "parineeti");
		map.put(10, "miesha");
		System.out.println("\nThe elements of TreeMap are ");
		for (Entry<Integer, String> l : map.entrySet()) {
			System.out.println(l.getKey() + " " + l.getValue());
		}

	}

}
