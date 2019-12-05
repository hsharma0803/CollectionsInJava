package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {

		// HashSet is a class which implements Set interface and extends AbstractSet class
		// duplicate data is not allowed - stores only unique elements
		// it do not maintains insertion order

		HashSet<String> hs = new HashSet<String>();
		// Set<Integer> hh = new HashSet<Integer>();

		// to add elements
		hs.add("TestNg");
		hs.add("Automation");
		hs.add("Collections");

		System.out.println(hs);

		// to get the size
		System.out.println(hs.size());

		// hs.add("Selenium");
		// System.out.println(hs);

		// to remove the elements
		hs.remove("Automation");
		System.out.println(hs);
		
		// again add the removed element
		hs.add("Automation");
		System.out.println(hs);

		// clone method
		HashSet<String> ht = (HashSet) hs.clone();
		System.out.println(ht);

		// clear method
		hs.clear();
		System.out.println(hs);

		// to iterate all the elements

		Iterator<String> it = ht.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}

}
