package S302Nivell3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Vehicle vehicle=new Vehicle("cotxe");
    ArrencarImpl opArrencar=new ArrencarImpl(vehicle,"cotxe");
    ArrencarImpl opArrencar2=new ArrencarImpl(vehicle,"bicicleta");
    ArrencarImpl opArrencar3=new ArrencarImpl(vehicle,"vaixell");
  
    AccelerarImpl opAccelerar=new AccelerarImpl(vehicle,"cotxe");
    AccelerarImpl opAccelerar2=new AccelerarImpl(vehicle,"bicicleta");
    AccelerarImpl opAccelerar3=new AccelerarImpl(vehicle,"vaixell");
    
    FrenarImpl opFrenar=new FrenarImpl(vehicle,"cotxe");
    FrenarImpl opFrenar2=new FrenarImpl(vehicle,"bicicleta");
    FrenarImpl opFrenar3=new FrenarImpl(vehicle,"vaixell");
    
    Invoker ivk=new Invoker();
    ivk.rebreOperacio(opArrencar);
    ivk.rebreOperacio(opArrencar2);
    ivk.rebreOperacio(opArrencar3);
    ivk.rebreOperacio(opAccelerar);
    ivk.rebreOperacio(opAccelerar2);
    ivk.rebreOperacio(opAccelerar3);
    ivk.rebreOperacio(opFrenar);
    ivk.rebreOperacio(opFrenar2);
    ivk.rebreOperacio(opFrenar3);
    ivk.realitzarOperacio();
	}

}
