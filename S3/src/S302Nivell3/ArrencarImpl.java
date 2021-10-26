package S302Nivell3;

public class ArrencarImpl implements IOperacio {

	private Vehicle vehicle;
	private String nom;
	
	public ArrencarImpl(Vehicle vehicle,String nom) {
		this.vehicle=vehicle;
		this.nom=nom;
	}
	@Override
	public void execute() {
		this.vehicle.arrencar(this.nom);
		
	}

}
