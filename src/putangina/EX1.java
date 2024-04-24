package putangina;

import java.util.TreeSet;

public class EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> randomNumbers = new TreeSet<>();
		for (int i = 0; i < 50; i++) {
			randomNumbers.add((int) (Math.random()*100));
		}
		randomNumbers.stream().filter(t -> t > 50 && t < 100).forEach(t -> System.out.print(t + " "));
	}

}
