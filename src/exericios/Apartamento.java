package exericios;

public class Apartamento {

	private int numeroAP;
	private int qtdeQuartos;
	/* private tipoOcupacao: EnumTipoOcupação */
	private Proprietario proprietario;
	

	public Apartamento(int numeroAP, int qtdeQuartos, Proprietario proprietario) {
		super();
		this.numeroAP = numeroAP;
		this.qtdeQuartos = qtdeQuartos;
		this.proprietario = proprietario;
	}

	
	public int getNumeroAP() {
		return numeroAP;
	}



	public void setNumeroAP(int numeroAP) {
		this.numeroAP = numeroAP;
	}

	public int getQtdeQuartos() {
		return qtdeQuartos;
	}


	public void setQtdeQuartos(int qtdeQuartos) {
		this.qtdeQuartos = qtdeQuartos;
	}



	public Proprietario getProprietario() {
		return proprietario;
	}


	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}



	
	
	
	
	
	
	
	
}
