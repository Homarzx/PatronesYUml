package strategy;

public class Ciclista implements TransporteStrategy{

	@Override
	public void transportar() {
		System.out.println("Vamos por bicleta");
		
	}

}
