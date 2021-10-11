package Nivell3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creo llista alumnes
		List<Alumne>llista=new ArrayList<Alumne>();
		llista.add(new Alumne("Maria",14,"2ESO",6.8));
		llista.add(new Alumne("Pablo",17,"1Batxi",8));
		llista.add(new Alumne("Francesc",15,"3ESO",9));
		llista.add(new Alumne("Lola",16,"4ESO",9));
		llista.add(new Alumne("Ian",14,"2ESO",5));
		llista.add(new Alumne("Marta",18,"2Batxi",7.5));
		llista.add(new Alumne("Tareq",16,"4ESO",8.9));
		llista.add(new Alumne("Adela",17,"1Batxi",6.6));
		llista.add(new Alumne("Antonio",15,"3ESO",4.6));
		llista.add(new Alumne("Hassan",18,"2Batxi",9));
		llista.add(new Alumne("Gabriela",13,"1ESO",8.2));
		//llista.forEach(System.out::println);/només imprimeix referència
		//llista.forEach(s->System.out.println(s)); /se li passa com argument un Consumer
		
		//recorro llista i imprimeixo
		System.out.println("\nLlista d'estudiants:");
		for(Alumne n:llista) {
		System.out.println(n);	
		}
		System.out.println("\n");
		
		//Imprimeixo llista només amb els valors de nom i edat. El flat.map ens retorna llista de tots els elements concatenats
		System.out.println("\nLlista d'estudiants amb el nom i l'edat:");
		llista.stream().flatMap(alumne->Stream.of("NOM:"+alumne.getNom()+", "+"EDAT:"+alumne.getEdat()))
				.collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("\n");
		
		//Creo nova llista amb els noms que comencen per A
		List<Alumne>llistaA=llista.stream().filter(alumne->alumne.getNom().startsWith("A"))
				.collect(Collectors.toList());
					//recorro llista i imprimeixo
					System.out.println("\nLlista d'estudiants, el nom dels quals comença per a:");
					for(Alumne n:llistaA) {
					System.out.println(n);	
					}
					System.out.println("\n");
					
		//Imprimeixo llista alumnes amb més d'un 5
		System.out.println("Els alumnes amb una nota més alta de 5 són:");
		llista.stream().filter(alumne->alumne.getNota()>=5)
				.collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("\n");
		
		//Imprimeixo llista alumnes amb més d'un 5 i que no son de 4art ESO
		System.out.println("Els alumnes que no són de 4art d'ESO i tenen una nota més alta de 5 són:");
		llista.stream().filter(alumne->alumne.getNota()>=5 &&!alumne.getCurs().equals("4ESO"))
				.forEach(System.out::println);
		
		System.out.println("\n");
		
		//Imprimeixo llista alumnes majors d'edat i encara estan fent batxillerat
		System.out.println("Els alumnes que són majors d'edat i encara estan a Baxillerat:");
		llista.stream().filter(alumne->alumne.getEdat()>=18 && alumne.getCurs().equals("2Batxi")).forEach(System.out::println);
	}
}
