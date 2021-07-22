package strategy;

public class Navigator {
	private TransporteStrategy t;
	public void transportar() {
		t.transportar();
	}
	
	 public void setTransporteStrategy(TransporteStrategy strategy){
		 this.t = strategy;
	 }

	public TransporteStrategy getT() {
		return t;
	}
	

}
