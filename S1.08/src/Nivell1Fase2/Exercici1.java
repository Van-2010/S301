package Nivell1Fase2;
/*Crea una Functional Interface que continga  un mètode abstracte getPiValue (), 
 * que retorn a un valor double; en una  altra classe, instancie la  interfície i 
 * assigneu-li  mitjançant una lambda el valor 3.1415. Invoca  el  mètode getPiValue 
 * de la  instància d'interfície i  imprimeix el resultat . 
 */
public class Exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instancio la interfície i li assigno valor
		FunctionalInterfacePi calcula=()->3.1415;
		//crido al mètode i imprimeixo
		System.out.println(calcula.getValue());
	}

}
