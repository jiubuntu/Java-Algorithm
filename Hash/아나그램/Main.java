import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();

		System.out.println(T.solution(a,b));
	}

	public String solution(String a, String b) {
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		for (char x : a.toCharArray()) {
			map1.put(x, map1.getOrDefault(x, 0) + 1);
		}

		for (char x : b.toCharArray()) {
			map2.put(x, map2.getOrDefault(x, 0) + 1);
		}

		for (char x : map1.keySet()) {
			if (map1.get(x) != map2.getOrDefault(x,0)) {
				return "NO";
			}
		}

		return "YES";
	}
}