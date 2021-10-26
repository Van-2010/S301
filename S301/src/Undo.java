import java.util.ArrayList;
import java.util.Scanner;

public class Undo {

	private static Undo instancia;
	
	private Undo() {
		
	}
	
	ArrayList<String>comandos=new ArrayList<String>();
	
	public static Undo getInstancia() {
		if(instancia==null) {
			instancia=new Undo();
		}
		return instancia;
	}
	public int buscarComando(String comando) {
	int index=0;
	boolean trobat=false;
	int resultat=-1;
    	while(index<comandos.size()&&trobat!=true) {
    		if(comandos.get(index).equalsIgnoreCase(comando)) {
    		resultat=index;
    		trobat=true;
    	}
    	index++;
    }
    return resultat;
	}
	public void afegir(String comando) {
		int iPosicioComando=buscarComando(comando);
		if(iPosicioComando!=-1) {
		comandos.add(comando);
		System.out.println("La llista:"+comandos);
		}
		else {
			System.out.println("El comando "+comando+" no es troba a la nostra aplicacio");
			}
		}
    public void eliminar(String comando) {
	int iPosicioComando=buscarComando(comando);
		if(iPosicioComando!=-1) {
			comandos.remove(iPosicioComando);	
		}
		else {
		System.out.println("El comando "+comando+" no es troba a la nostra aplicacio");
		}
	}
	public void veure() {
		
		for(int i=0; i<comandos.size();i++) {
        System.out.println(comandos.get(i));
		}	
	}
}
