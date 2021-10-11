package Nivell1Fase1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*Escriu un mètode que retorne una cadena separada per comes basada en una llista d’Integers. 
 * Cada element  hauria d'anar precedit per la  lletra  "e" si el nombre és parell , i precedit 
 * de la lletra  "o" si el nombre és im parell. Per exemple, si la llista  d'entrada és (3,44), 
 * la  sortida hauria de ser "o3, e44".  Imprimeix el  resultat. 
 */
public class Fase1Exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>numeros=new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		
		System.out.println(seleccio(numeros));
		
	}
	public static String seleccio(ArrayList<Integer>numeros){
		 String seleccio2=numeros.stream().filter(i->i%2==0).map(i->"e"+i)
				.collect(Collectors.joining(";"));
		 String seleccio3=numeros.stream().filter(i->i%2!=0).map(i->"o"+i).collect(Collectors.joining(";"));
				
		 return seleccio2+","+seleccio3;
	}

}
