package exericios;

import java.util.HashSet;
import java.util.Set;

public class Competencia {

	private Despesa despesa;
	private Cobranca cobrança;
	private Set<Competencia> listaCompetencia = new HashSet<>();
	
	
	
	public Competencia(Despesa despesa, Cobranca cobrança) {
		super();
		this.despesa = despesa;
		this.cobrança = cobrança;
		
	}

	public Despesa getDespesa() {
		return despesa;
	}

	public void setDespesa(Despesa despesa) {
		this.despesa = despesa;
	}

	public Cobranca getCobrança() {
		return cobrança;
	}

	public void setCobrança(Cobranca cobrança) {
		this.cobrança = cobrança;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
