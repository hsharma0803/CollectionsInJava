package collections;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapConcept {

	public static void main(String[] args) {

		// LinkedHashMap is similar to HashMap with an additional feature of maintaining insertion order.
		// it implements the Map interface and extends AbstractMap class
		// it stores the data in key and value
		// it is non synchronized
		// it can also store the class objects also

		LinkedHashMap<Integer, String> hp = new LinkedHashMap<Integer, String>();

		// add elements
		hp.put(1, "Selenium");
		hp.put(2, "QTP");
		hp.put(3, "RFT");
		hp.put(4, "TestNG");
		hp.put(5, "GIT");
		System.out.println(hp);

		// remove elements
		hp.remove(2);
		System.out.println(hp);

		// again add the removed element
		hp.put(2, "QTP");
		System.out.println(hp);

		// clone()
		LinkedHashMap<Integer, String> hp1 = (LinkedHashMap<Integer, String>) hp.clone();
		System.out.println(hp1);

		// containsvalue()

		if (hp.containsKey(9)) {

			System.out.println("the key is present in the hashmap");
		}

		else {

			System.out.println("the key is not present in the hashmap");
		}

		// get the value
		System.out.println(hp.get(3));

		// iterate all the values : using entry and entry set
		for (Entry<Integer, String> s : hp.entrySet()) {

			int key = s.getKey();
			String value = s.getValue();

			System.out.println("the key and value are : " + key + " " + value);

		}

		Employee emp1 = new Employee("Robin", 28, "QA");
		Employee emp2 = new Employee("Peter", 27, "Dev");
		Employee emp3 = new Employee("Steve", 26, "BA");
		Employee emp4 = new Employee("Bob", 29, "Manager");

		LinkedHashMap<Integer, Employee> hh = new LinkedHashMap<Integer, Employee>();

		hh.put(1, emp1);
		hh.put(2, emp2);
		hh.put(3, emp3);
		hh.put(4, emp4);

		for (Entry<Integer, Employee> en : hh.entrySet()) {

			int k = en.getKey();
			Employee v = en.getValue();

			System.out.println("the employee details are :" + k + " " + v.name + " " + v.age + " " + v.dept);
			

		}

	}

}
