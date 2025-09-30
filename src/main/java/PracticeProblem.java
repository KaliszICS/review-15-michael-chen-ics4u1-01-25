import java.util.ArrayList;
import java.util.Collections;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int goodString(String a) {
		ArrayList<String> stringChars = new ArrayList<String>();
		ArrayList<Integer> moves = new ArrayList<Integer>();
		for (String i : a.split("")) {
			if (!stringChars.contains(i)) {
				stringChars.add(i);
			}
		}

		if (stringChars.size() == a.length()) {
			return -1;
		}

		for (String j : stringChars) {
			moves.add(a.indexOf(j) + new StringBuilder(a).reverse().toString().indexOf(j));
		}
		return Collections.min(moves);
	}
}
