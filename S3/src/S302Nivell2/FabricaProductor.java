package S302Nivell2;

public class FabricaProductor {

	public static AbstractAgendaFactory getFactory(String tipusFabrica) {
		if(tipusFabrica.equalsIgnoreCase("FR")) {
			return new ConexionFRFabrica();
		}else if(tipusFabrica.equalsIgnoreCase("US")) {
			return new ConexionUSFabrica();
		}
		return null;
	}
}
