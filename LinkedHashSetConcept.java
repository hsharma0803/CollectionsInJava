package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetConcept {

	public static void main(String[] args) {

		// LinkedHashSet is similar to HashSet but additionally it maintains the
		// insertion order

		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();

		// add the elements
		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(400);
		hs.add(500);

		System.out.println(hs);

		// remove element
		hs.remove(200);
		System.out.println(hs);

		// again add the removed element
		hs.add(200);
		System.out.println(hs);

		// clone
		LinkedHashSet<Integer> ht = (LinkedHashSet) hs.clone();
		System.out.println(ht);

		// clear
		ht.clear();
		System.out.println(ht);
		System.out.println(hs);

		// contains method
		if (hs.contains(5000)) {

			System.out.println("the value is present");

		}

		else {

			System.out.println("the value is not present");
		}

		// iterate and print all the values
		Iterator<Integer> it = hs.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}

	}

}
