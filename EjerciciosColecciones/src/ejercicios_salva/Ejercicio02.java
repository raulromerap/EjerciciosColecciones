package ejercicios_salva;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Ejercicio02 {

	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet();
		Random rn = new Random();
		
		while(set.size() < 10) {
			int a = rn.nextInt(1, 21);
			if (!set.contains(a)) {
				set.add(a);
			}
		}
		
		System.out.println(set);

	}

}
