package exericios;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Despesa {

	private String mesAno;
	private double currency;
	private LocalDate dataEmissão;
	private LocalDate dataVencimento;
	
	public Despesa(String mesAno, double currency, LocalDate dataEmissão, LocalDate dataVencimento) {
		super();
		this.mesAno = mesAno;
		this.currency = currency;
		this.dataEmissão = dataEmissão;
		this.dataVencimento = dataVencimento;
	}

	public String getMesAno() {
		return mesAno;
	}

	public void setMesAno(String mesAno) {
		this.mesAno = mesAno;
	}

	public double getCurrency() {
		return currency;
	}

	public void setCurrency(double currency) {
		this.currency = currency;
	}

	public LocalDate getDataEmissão() {
		return dataEmissão;
	}

	public void setDataEmissão(LocalDate dataEmissão) {
		this.dataEmissão = dataEmissão;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	
	
	
	
	
	
	
}
