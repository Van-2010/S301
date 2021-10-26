package S302Nivell2;

public class DireccioAnglaterra implements FabricaFrancia{
		
		private static String codi_ciutat = "44";
		private static int longitud_numero=11;
		private static String pais="Anglaterra";
		private String carrer;
		private String ciutat;
		private String codiPostal;
		private String telefon;
		
		public DireccioAnglaterra() {
			this.pais="Francia";
			
		}
		@Override
		public String getTel(String telefon) {
			if(telefon.length()==longitud_numero) {
				telefon=codi_ciutat+telefon;
			    return "Telefon "+telefon;
			}else {
				return null;
			}	
		}
		@Override
		public String getDireccio(String carrer, String ciutat, String codiPostal) {
			return ("Carrer: "+carrer+"Ciutat: "+ciutat+"Pais: "+pais+"Codi_Postal: "+codiPostal);
		}
		@Override
		public String toString() {
			return "DireccioFrancia [carrer=" + carrer + ", ciutat=" + ciutat + ", codiPostal=" + codiPostal
					+ ", telefon=" + telefon + "]";
		} 
}
	
		