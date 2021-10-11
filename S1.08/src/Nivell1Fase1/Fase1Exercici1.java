package Nivell1Fase1;

//FASE 1
/*Tenint una llista de cadenes de noms propis,  escriu un mètode que retorn e una llista 
 * de totes les cadenes que  comencen amb la lletra 'a' (mayuscula ) i  tenen exactament 3  
 * lletres. Imprimeix el resultat . 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Fase1Exercici1 {

	public static void main(String[]args) {
	
		ArrayList<String>cadenes=new ArrayList<String>();
		cadenes.add("Lola");
		cadenes.add("Ana");
		cadenes.add("Alex");
		cadenes.add("Francesc");
		cadenes.add("Pol");
		
		System.out.println(novaLlista(cadenes));
		
	}
		//mètode per crear nova llista i filtrar noms amb A i 3 caracters.
		public static List<String> novaLlista(List <String>cadenes){
			List<String>novaLlista2=cadenes.stream().filter(n->n.startsWith("A")&&n.length()==3)
					.collect(Collectors.toList());
			
			return novaLlista2;
			
		}
		}
	

		
		
		/*ArrayList<ArrayList<Character>> Llista=new ArrayList<ArrayList<Character>>();
		//char[] chars = cadenes.toString().toCharArray();
		ArrayList<Character>palabra=new ArrayList<Character>();
		char[]lletra;
		for (int i=0;i<cadenes.size();i++) {
			lletra=cadenes.get(i).toCharArray();
			 for(int j=0; j<lletra.length;j++) {
				palabra.add(lletra[j]); 
			 }Llista.add(palabra);
		}
		System.out.print(Llista);
	}**/

