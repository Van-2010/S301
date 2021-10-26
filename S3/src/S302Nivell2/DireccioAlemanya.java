package S302Nivell2;

public class DireccioAlemanya implements FabricaUsa{
	
	private static String codi_ciutat = "49";
	private static int longitud_numero = 10;
	private static String pais="USA";
	private String carrer;
	private String ciutat;
	private String codiPostal;
	private String telefon;

	public DireccioAlemanya() {
		
		this.pais = "USA";
		
	}
	public String getTel(String telefon) {
		if(codi_ciutat.equalsIgnoreCase("01")&& longitud_numero==10) {
			telefon=codi_ciutat+" "+telefon;	
		 return "Telefon "+"+ "+telefon;
	    }else {
		return null;
	    }	
	}
	public String getdireccio(String carrer, String ciutat, String codiPostal) {
		return ("Carrer: "+carrer+" Ciutat: "+ciutat+" Pais: "+pais+" Codi_Postal: "+codiPostal);
					
	}
	@Override
	public String toString() {
		return "DireccioUsa [carrer=" + carrer + ", ciutat=" + ciutat + ", codiPostal=" + codiPostal + ", telefon="
				+ telefon + "]";
	}
	
	}
	

