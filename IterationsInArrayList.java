package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterationsInArrayList {

	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<String>();

		ar.add("Tom and Jerry");
		ar.add("Ben10");
		ar.add("powerpuff girls");
		ar.add("Popeye the sailor man");
		ar.add("Pokemon");

		// 1. for loop

		System.out.println("*************** using for loop ******************* ");
		for (int num = 0; num < ar.size(); num++) {

			System.out.println(ar.get(num));

		}

		// 2. forEach loop

		System.out.println("*************** using for each loop ******************* ");

		for (String m : ar) {
			System.out.println(m);

		}

		// 3. using foreach and lambda expression

		System.out.println("**************  using for each and lambda expression");

		ar.forEach(shows -> {

			System.out.println(shows);
		});

		// 4. using foreachremaining and lambda expression

		System.out.println("************** using foreachremaining and lambda expression**************** ");
		Iterator<String> it = ar.iterator();
		it.forEachRemaining(show -> {

			System.out.println(show);

		});

		// 5. using iterator method

		System.out.println("************ using iterator method ************");

		Iterator<String> tt = ar.iterator();
		while (tt.hasNext()) {

			System.out.println(tt.next());
		}

		// 6. using listiterator
		
		System.out.println("*********** using listiterator method ************* ");

		ListIterator<String> lt = ar.listIterator(ar.size());
		while (lt.hasPrevious()) {

			String str = lt.previous();
			System.out.println(str);
		}

	}

}
