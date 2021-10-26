package S302Nivell3;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

	private List<IOperacio>operacions=new ArrayList<>();
	
	public void rebreOperacio(IOperacio operacio) {
		this.operacions.add(operacio);
	}
	public void realitzarOperacio() {
		this.operacions.forEach(x->x.execute());
		//this.operacions.clear();
		
	}
}
