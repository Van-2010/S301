package S302Nivell3;

public class AccelerarImpl implements IOperacio {
	
	private Vehicle vehicle;
	private String nom;
	
	public AccelerarImpl(Vehicle vehicle, String nom) {
		this.vehicle=vehicle;
		this.nom=nom;
	}
	public void execute() {
		this.vehicle.accelerar(this.nom);
	}
}
