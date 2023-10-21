package exericios;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Despesa {

	private String mesAno;
	private BigDecimal currency;
	private LocalDate dataEmissão;
	private LocalDate dataVencimento;
	
	public Despesa(String mesAno, BigDecimal currency, LocalDate dataEmissão, LocalDate dataVencimento) {
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

	public BigDecimal getCurrency() {
		return currency;
	}

	public void setCurrency(BigDecimal currency) {
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
