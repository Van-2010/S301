package Nivell1Fase1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*Has de fer el mateix que en el punt anterior,  però retornant una llista que  incloga 
 * els elements amb  més de 5 lletres. Imprimeix  el  resultat. 
 */
public class Fase1Exercici4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>llista=new ArrayList<String>();
		llista.add("Mercuri");
		llista.add("Venus");
		llista.add("Mart");
		llista.add("Saturn");
		llista.add("Júpiter");
		llista.add("Urà");
		for(String i:llista) {
			
		}
		System.out.println(Planetes(llista));	
	}
	public static List<String>Planetes(ArrayList<String>llista){
		List<String>PlanetesLlargs=llista.stream()
				.filter(n->n.length()>5)
				.collect(Collectors.toList());
		return PlanetesLlargs;
	}
}
