package Nivell1Fase1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Crea una llista amb  els noms dels mesos de  l’any. Imprimeix tots els  elements de 
 * la llista amb  una lambda. 
 */
public class Fase1Exercici5 {

	public static void main(String[] args) {
			
		for (String mesos:Arrays.asList("Gener","Febrer","Març","Abril",
				"Maig","Juny","Juliol","Agost","Setembre","Octubre","Novembre","Desembre")) {
			System.out.print(mesos+" ");
		}
				
	}
}
