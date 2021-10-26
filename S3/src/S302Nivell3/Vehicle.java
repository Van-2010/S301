package S302Nivell3;

public class Vehicle {

	private String nom;
	
	
	public Vehicle(String nom) {
	this.nom=nom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
    public void arrencar(String nom) {
		System.out.println("Tipus vehicle: "+nom+"-Arrenca");
	}
	
	public void accelerar(String nom) {
		System.out.println("Tipus vehicle: "+nom+"-Accelera");
	}
	public void frenar(String nom) {
		System.out.println("Tipus vehicle: "+nom+"-Frena");
	}
}
