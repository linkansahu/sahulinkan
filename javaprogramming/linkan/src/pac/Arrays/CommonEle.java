package pac.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonEle {

	public static void main(String[] args) {
		String[] a = {"a","b","c","d"};
		String[] b = {"b", "c"};

		//this is to avoid calling Arrays.asList multiple times
		List<String> aL = Arrays.asList(a);
		List<String> bL = Arrays.asList(b);

		//finding the common element for both
		Set<String> common = new HashSet<>(aL);
		common.retainAll(bL);
		System.out.println(common);
		//now, the real uncommon elements
		Set<String> uncommon = new HashSet<>(aL);
		uncommon.addAll(bL);
		System.out.println(uncommon+" ---");
		uncommon.removeAll(common);

System.out.println(uncommon);

	}

}
