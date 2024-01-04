package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindDuplicateEleOfString {

	// 1.Brute force
	// 2.HashSet
	// 3.HashMap<K,V>
	// 4.streams

	public static void main(String[] args) {

		String names[] = { "teja", "gopi", "mahesh", "balu", "bond", "teja", "bond", "gopi" };

		System.out.println("-----brute force-----" + "\n" + "duplicates are :");

		for (int i = 0; i < names.length; i++) {

			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println(names[i]);
				}
			}
		}
		////////////////////////////////////////////

		System.out.println("==== HashSet===" + "\n" + "duplicates are :");

		HashSet<String> hs = new HashSet<String>();
		for (String values : names) {
			if (hs.add(values) == false) {
				System.out.println(values);
			}
		}

		/////////////////////////
		System.out.println("==== HashMap===" + "\n" + "duplicates are :");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String values : names) {

			Integer count = map.get(values);

			if (count == null) {
				map.put(values, 1);
			} else {
				map.put(values, ++count);
			}
		}
		// printing the duplicate values
		Set<Entry<String, Integer>> entrySet = map.entrySet();

		for (Entry<String, Integer> entry : entrySet) {

			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}

		// streams
		System.out.println("==== Streams and filter===" + "\n" + "duplicates are :");
		// String names[]= {"teja","gopi","mahesh","balu","bond","teja","bond","gopi"};

		Set<String> dataSet = new HashSet<String>();

		Set<String> dupSet = (Set<String>) Arrays.asList(names)
				.stream().filter(e -> !dataSet.add(e))
				.collect(Collectors.toSet());
		System.out.println(dupSet);
	}
}
