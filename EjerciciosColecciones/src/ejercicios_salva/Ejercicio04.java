package ejercicios_salva;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio04 {

	public static void main(String[] args) {
		Set<String> nombres = new LinkedHashSet<>();
		String n = "";
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println("Inserta un nombre");
			n = sc.nextLine();
			
			nombres.add(n);
		} while (nombres.size() < 5);
		
		System.out.println(nombres);
	}

}
