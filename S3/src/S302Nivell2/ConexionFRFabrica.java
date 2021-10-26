package S302Nivell2;

public class ConexionFRFabrica implements AbstractAgendaFactory {

	@Override
	public FabricaFrancia getFrancia(String motor) {
		if (motor.equalsIgnoreCase("FR")){
        // TODO Auto-generated method stub
		return new DireccioFrancia();
	}else {
		return null;
	}
	}

	@Override
	public FabricaUsa getUsa(String area) {
		// TODO Auto-generated method stub
		return null;
	}

}
