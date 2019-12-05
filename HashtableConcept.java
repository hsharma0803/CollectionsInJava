package collections;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashtableConcept {

	public static void main(String[] args) {

		// Hashtable is a class implementing the Map interface and extending the AbstractMap class
		// It stores the data in key - value pair.
		// key is always the hashcode of the java objects - Hashcode is a 32 bit integer unique number
		// It do not allow null value and key --- null pointer exception will be thrown 
		// It is synchronized -- thread safe 

		Hashtable<Integer, String> ht = new Hashtable();

		// to add values
		ht.put(1, "value01");
		ht.put(2, "value02");
		ht.put(3, "value03");
		ht.put(4, "value04");
		ht.put(5, "value05");

		System.out.println(ht);

		// to remove the values
		ht.remove(2);
		System.out.println(ht);

		// to get a value
		System.out.println(ht.get(1));

		// containsvalue()
		System.out.println(ht.contains("Selenium"));

		// clone()
		Hashtable ht1 = (Hashtable) ht.clone();
		System.out.println("the contents of hashtable ht1 are : " + ht1);

		// to get the hashcode
		System.out.println(ht.hashCode());

		// to iterate all the values
		// 1. using entryset and entry

		for (Entry<Integer, String> m : ht.entrySet()) {

			int key = m.getKey();
			String value = m.getValue();

			System.out.println(key + " " + value);

		}

		// ht.clear();
		// System.out.println(ht);
		//

		System.out.println(ht.size());

		// it donot allows null key and null value
		ht.put(6, "value06");
		System.out.println(ht);

	}

}
