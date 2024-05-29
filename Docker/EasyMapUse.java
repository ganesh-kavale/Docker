import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class EasyMapUse {

	public static void main(String[] args) {

		String[] arr = { "a", "b", "c", "d", "ds", "b", "e", "b", "kl", "kh", "d", "b", "a", "b", "b", "a", "b", "c" };

		// Stream is not necessary for this task
		// Stream<String> resss = Arrays.stream(arr);
		// long a = resss.count();

		Map<String, Integer> dup = new HashMap<>();

		// Count occurrences of each element
		for (String element : arr) {
			Integer count = dup.getOrDefault(element, 0);
			dup.put(element, count + 1);
		}

		// Filter and collect duplicates using a simple loop
		Map<String, Integer> duplicates = new HashMap<>();
		for (Map.Entry<String, Integer> entry : dup.entrySet()) {
			
			System.out.println(entry);
//			if (entry.getValue() > 1) {
				duplicates.put(entry.getKey(), entry.getValue());
//			}
		}

		// Print out the duplicates and their counts
		System.out.println("Duplicate elements and their counts: " + duplicates);

//		// Filter and collect duplicates
//		Map<String, Integer> duplicates = dup.entrySet().stream()
//			.filter(entry -> entry.getValue() > 1)
//			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//
//		// Print out the duplicates and their counts
//		System.out.println("Duplicate elements and their counts: " + duplicates);
	}
}
