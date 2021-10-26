package S302Nivell2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractAgendaFactory fabricaFr=FabricaProductor.getFactory("FR");
		FabricaFrancia primeraFr=fabricaFr.getFrancia("FR");
		System.out.println(primeraFr.getTel("555666777"));
		System.out.println(primeraFr.getDireccio("Parades", "Paris", "0897"));
				
		
		AbstractAgendaFactory fabricaUs=FabricaProductor.getFactory("US");
		FabricaUsa primeraUS=fabricaUs.getUsa("US");
		System.out.println(primeraUS.getTel("56768790"));
		System.out.println(primeraUS.getdireccio("First Avenue","New York","09980"));
		
	}

}
