package S302Nivell1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner teclado=new Scanner(System.in); 
	
	Undo c=Undo.getInstancia();
	
	System.out.println("Escull una opció:\n1:Afegir\n2:Eliminar\n3:Veure");
    int opcio=teclado.nextInt();
   
    switch(opcio){
    case 1:
    	System.out.println("Inserta un comando:");
		String comando=teclado.next();
		c.afegir(comando);
    	break;
    
    case 2:
    	System.out.println("Inserta un comando:");
		comando=teclado.next();
    	c.eliminar(comando);
    	break;
    	
    case 3:
    	c.veure();
    	break;
    }
	}
}
