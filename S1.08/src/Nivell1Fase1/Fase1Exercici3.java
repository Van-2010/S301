package Nivell1Fase1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*Tenint una llista de Strings, escriu un mètode  que retorne una llista de totes les  
 * cadenes  que continguen la lletra ‘o’ i  imprimeix el resultat .
 */
public class Fase1Exercici3 {

	public static void main(String[] args) {
		ArrayList<String>llista=new ArrayList<String>();
		llista.add("Mowgly");
		llista.add("Bageera");
		llista.add("Baloo");
		llista.add("Rey Loui");
		llista.add("Khaa");
		for (String x:llista) {
			
		}
        System.out.println(PersonatgesO(llista));

	}
	public static List<String>PersonatgesO(List<String>llista){
		List<String>Personatges=llista.stream()
				.filter(n->n.contains("o"))
				.collect(Collectors.toList());
		
		return Personatges;
	}
}


