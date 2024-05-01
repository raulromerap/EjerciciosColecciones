package ejercicios_salva;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		Map<Character, Integer> mapa = new TreeMap();
		
		String texto = "En un agujero en el suelo, vivia un hobbit. "
				+ "No un agujero humedo, sucio, repugnante, con restos de gusanos y olor a fango, "
				+ "ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: "
				+ "era un agujero-hobbit, y eso significa comodidad";
		
		String textoLetras = texto.toLowerCase().replaceAll("[^a-z]", "");
		
		char[] letras = texto.toCharArray();
		
		for (char c = 'a'; c<='z'; c++) {
			int cont = 0;
			for (int i = 0; i < letras.length; i++) {
				if (letras[i] == c) {
					cont++;
				}
			}
			mapa.put(c, cont);
		}
		
		System.out.println(mapa);
			
	}

}
