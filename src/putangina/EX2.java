package putangina;

import java.util.Comparator;
import java.util.TreeMap;

public class EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> map = new TreeMap<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		});
		for (int i = 0; i < 50; i++) {
			addToMap(map);
		}
		map.values().stream().forEach(System.out::println);
	}

	private static void addToMap(TreeMap<Integer, String> map) {
		// TODO Auto-generated method stub
		Integer key = generateKey();
		map.put(key,"key: "+key+" value: "+ generateString());
	}

	private static String generateString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			sb.append(generateASCII());
		}
//		System.out.println(sb.toString());
		return sb.toString();
	}

	private static char generateASCII() {
		// TODO Auto-generated method stub
		char c = 0;
		while(!Character.isAlphabetic(c)) {
			c = (char) (Math.random()*122);
		}
		return c;
	}

	private static Integer generateKey() {
		// TODO Auto-generated method stub
		return (int) (Math.random()*1000);
	}

}
