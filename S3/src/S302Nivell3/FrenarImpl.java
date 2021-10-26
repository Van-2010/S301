package S302Nivell3;

public class FrenarImpl implements IOperacio{
	private Vehicle vehicle;
	private String nom;
	
	public FrenarImpl(Vehicle vehicle,String nom) {
		this.vehicle=vehicle;
		this.nom=nom;
	}
	public void execute() {
		this.vehicle.frenar(this.nom);	
	}
}
