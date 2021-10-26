package S302Nivell2;

public class ConexionUSFabrica implements AbstractAgendaFactory{

	@Override
	public FabricaFrancia getFrancia(String motor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FabricaUsa getUsa(String area) {
		if (area.equalsIgnoreCase("US")){
	        // TODO Auto-generated method stub
			return new DireccioUsa();
		}else {
			return null;
		}
		}

}
