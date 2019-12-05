package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

		// add the elements
		ll.add("atest");
		ll.add("btest");
		ll.add("ctest");
		ll.add("dtest");

		System.out.println(ll);

		// remove a particular element
		// ll.remove(2);
		// System.out.println(ll);

		// add element at first index
		ll.addFirst("hello");
		System.out.println(ll);

		// add element at last index
		ll.addLast("Selenium");
		System.out.println(ll);

		// remove first
		// ll.removeFirst();
		// System.out.println(ll);

		// remove last
		// ll.removeLast();
		// System.out.println(ll);

		// to get value at any index
		System.out.println(ll.get(2));

		// update an existing element
		ll.set(1, "Hello World");
		System.out.println(ll);

		// to iterate all values and print
		// 1. iterator
		System.out.println("************** using iterator ************* ");
		Iterator it = ll.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());
		}

		// 2. for loop
		System.out.println("********* using for loop ************");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

		// 3. advanced for loop
		System.out.println("************** using advanced for loop************** ");
		for (String str : ll) {
			System.out.println(str);
		}

		// 4. while loop
		System.out.println("*************** using while loop ******************");
		int num = 0;
		while (num < ll.size()) {
			System.out.println(ll.get(num));
			num++;
		}

	}

}
