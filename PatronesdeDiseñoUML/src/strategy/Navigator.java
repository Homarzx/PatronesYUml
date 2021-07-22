package strategy;

public class Navigator {
	private TransporteStrategy t;
	public void transportar() {
		System.out.println("Estoy transportando");
	}
	
	 public void setTransporteStrategy(TransporteStrategy strategy){
		 this.t = strategy;
	 }

	public TransporteStrategy getT() {
		return t;
	}
	

}
