package exericios;

import java.time.LocalDate;

public class Locacao {

	private LocalDate dataEntrada;
	private LocalDate dataSaida;
	
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
