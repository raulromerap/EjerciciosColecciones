package ejercicios_salva;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		List<String> nombres = new LinkedList<>();
		String n = "";
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println("Inserta un nombre");
			n = sc.nextLine();
			
			if(!nombres.contains(n))
				nombres.add(n);
			
		} while (nombres.size() < 5);
		
		Collections.reverse(nombres);
		
		System.out.println(nombres);
		
		sc.close();
	}

}
