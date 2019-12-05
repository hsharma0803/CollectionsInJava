package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {

		// Arraylist is a class which implements List interface
		// it is a Dynamic array -- size is not fixed
		// it maintains the insertion order
		// it can store the duplicate values
		// it can store class objects also

		// create arraylist
		ArrayList list = new ArrayList();

		// add elements to the arraylist
		list.add("cucumber");
		list.add(1234);
		list.add(true);
		list.add(10.30);
		list.add('t');

		// size of arraylist
		System.out.println(list.size());

		// to get a particular element
		System.out.println(list.get(2));

		// remove element from the arraylist
		list.remove("javadocs");
		System.out.println(list.size());

		// to print all the values -- for loop
		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));
		}

		// arraylist containing elements of different datatypes should have generic as
		// <E>
		// for particular datatype, we define that datatype in <Integer>

		// use of addall() method -- to merge two arraylists
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(500);
		ar1.add(600);
		ar1.add(800);

		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		ar2.add(100);
		ar2.add(200);
		ar2.add(300);

		ar2.addAll(ar1);

		for (int i = 0; i <= ar2.size(); i++) {
			// System.out.println(ar2.get(i));
		}

		Employee e1 = new Employee("Naveen", 25, "QA");
		Employee e2 = new Employee("Tom", 25, "Dev");
		Employee e3 = new Employee("Peter", 25, "CRM");

		ArrayList ar4 = new ArrayList();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);

		// iterate all the values from the arraylist

		Iterator<Employee> it = ar4.iterator();
		while (it.hasNext()) {

			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			System.out.println("***********************");

		}

	}

}
