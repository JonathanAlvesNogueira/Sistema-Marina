package exericios;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Locacao {

	private LocalDate dataEntrada;
	private LocalDate dataSaida;
	private Set<Locacao> setLocacao = new HashSet<>();
	
	public Locacao(LocalDate dataEntrada, LocalDate dataSaida) {
		super();
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public LocalDate getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}
	
	
	
	
	
	
	
	
}
