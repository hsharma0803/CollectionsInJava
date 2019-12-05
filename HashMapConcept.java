package collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapConcept {

	public static void main(String[] args) {

		// HashMap is a class implementing the Map interface and extends AbstractMap class
		// It stores the data in Key - value pair.
		// It stores only unique elements
		// It is non-synchronized -- not thread safe
		// It allows one null key and multiple null values
		// It can store the class objects also

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// to add values in hashmap - put()
		hm.put(1, "Java");
		hm.put(2, "Python");
		hm.put(3, "dotnet");
		hm.put(4, "C++");
		hm.put(5, "Ruby");
		System.out.println(hm.size());

		System.out.println(hm);

		// to fetch a particular value
		System.out.println(hm.get(2));

		// to remove a value
		hm.remove(4);
		System.out.println(hm);
		
		// again add the removed element
		hm.put(4, "C++");
		System.out.println(hm);

		// size of the hashmap
		System.out.println(hm.size());

		hm.put(4, "Selenium");
		System.out.println(hm);

		// to iterate all the values -
		// 1. using entryset and Entry

		for (Entry en : hm.entrySet()) {

			System.out.println(en.getKey() + " " + en.getValue());

		}

		Employee emp1 = new Employee("John", 25, "QA");
		Employee emp2 = new Employee("Peter", 26, "DEV");
		Employee emp3 = new Employee("Brian", 27, "BA");

		HashMap<Integer, Employee> mp = new HashMap<Integer, Employee>();

		mp.put(1, emp1);
		mp.put(2, emp2);
		mp.put(3, emp3);

		// traverse all the values in hashmap

		for (Entry<Integer, Employee> e : mp.entrySet()) {

			int key = e.getKey();
			Employee h = e.getValue();

			System.out.println("Employee" + "  " + key + "  " + "info");
			System.out.println(h.name  + " " + h.age  + " " +  h.dept);

		}

	}

}
