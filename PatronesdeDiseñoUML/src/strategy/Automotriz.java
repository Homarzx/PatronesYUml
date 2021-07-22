package strategy;

public class Automotriz implements TransporteStrategy {

	@Override
	public void transportar() {
		System.out.println("Vamos por carro");
		
	}

}
