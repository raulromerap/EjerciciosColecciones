package ejercicios_salva;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio05 {

	static Map<String, Double> seriesValoracion = new HashMap<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opc = 0;
		boolean comp = false;
		
		do {
			menu();
			opc = sc.nextInt();
			sc.nextLine();
			
			switch(opc) {
			case 1:
				String ns ="";
				double  v = 0.0;
				System.out.println("Inserta el nombre de la serie");
				ns = sc.nextLine();
				System.out.println("Inserta la valoracion de la serie");
				v = sc.nextDouble();
				sc.nextLine();
				comp = agregarSerie(ns, v);
				if(comp) {
					System.out.println("Se ha agregado correctamente");
				}else {
					System.out.println("No se ha podido agregar");
				}
				break;
			case 2:
				String ns2 ="";
				System.out.println("Inserta el nombre de la serie");
				ns2 = sc.nextLine();
				buscarSerie(ns2);
				break;
			case 3:
				String ns3 ="";
				System.out.println("Inserta el nombre de la serie");
				ns = sc.nextLine();
				comp = eliminarSerie(ns3);
				if(comp) {
					System.out.println("Se ha eliminado correctamente");
				}else {
					System.out.println("No se ha podido eliminar");
				}
				break;
			}
			
			
		}while(opc != 4);
		
		System.out.println(seriesValoracion);
	}

	private static void menu() {
		System.out.println("1. Agregar serie");
		System.out.println("2. Buscar serie");
		System.out.println("3. Eliminar serie");
		System.out.println("4. Salir");
	}
	
	private static boolean agregarSerie(String ns, double v) {
		boolean agregado = false;
		
		if(!seriesValoracion.containsKey(ns) || seriesValoracion.isEmpty()) {
			seriesValoracion.put(ns, v);
			agregado = true;
		}
		
		return agregado;
	}
	
	private static void buscarSerie(String ns) {
		if(seriesValoracion.containsKey(ns)) {
			System.out.println(ns +" -> " +seriesValoracion.get(ns));
		}
		
	}
	
	private static boolean eliminarSerie(String ns) {
		boolean eliminar = false;
		
		if(seriesValoracion.containsKey(ns)) {
			seriesValoracion.remove(ns);
			eliminar = true;
		}
		
		return eliminar;
	}
	
}
