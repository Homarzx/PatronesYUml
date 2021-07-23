package chain_responsability;

public interface Departamento {
	void aprobarCambio(SolicitudCambio sc);
	void setnextApprover(Departamento d);

}
