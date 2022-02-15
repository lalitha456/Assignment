package assignment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;
public class Collections {
	public static void main(String[] args) {
		// creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> city = new ArrayList<String>();
		city.add("Pune");//
		city.add("Chennai");
		System.out.println(city);

		// creating vector
		System.out.println("\n");
		System.out.println("Vector");
		Vector<Integer> vec = new Vector<Integer>();
		vec.addElement(25);
		vec.addElement(40);
		System.out.println(vec);

		// creating linkedlist
		System.out.println("\n");
		System.out.println("LinkedList");
		LinkedList<String> names = new LinkedList<String>();
		names.add("Priya");
		names.add("Asha");
		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

			// creating hashset
			System.out.println("\n");
			System.out.println("HashSet");
			HashSet<Integer> set = new HashSet<Integer>();
			set.add(104);
			set.add(105);
			set.add(106);
			set.add(107);
			System.out.println(set);

			// creating linkedhashset
			System.out.println("\n");
			System.out.println("LinkedHashSet");
			LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
			set2.add(10);
			set2.add(13);
			set2.add(12);
			set2.add(15);
			System.out.println(set2);
		}
	}

}