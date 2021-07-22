package strategy;

public class Aérea implements TransporteStrategy{

	@Override
	public void transportar() {
		System.out.println("Vamos por avion");
		
	}

}
