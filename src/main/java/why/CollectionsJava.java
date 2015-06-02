package why;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author kostas.kougios
 * Date: 31/05/15
 */
public class CollectionsJava {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3);
		// summing via reduce: the intention of the code is not obvious
		Integer sum = numbers.stream().reduce(0, (a, b) -> a + b);

		// or this strange bit of code
		int sum1 = numbers.stream().mapToInt(x -> x).sum();

		// we rarelly can use the following code as most
		// of the time our data will be part of a collection.
		int sum2 = Stream.of(1, 2, 3).mapToInt(x -> x).sum();
	}
}
