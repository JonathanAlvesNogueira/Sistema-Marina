package exericios;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Despesa {

	private String mesAno;
	private double currency;
	private LocalDate dataEmissão;
	private LocalDate dataVencimento;
	private TipoDespesa tipoDespesa;
	
	public Despesa(String mesAno, double currency, LocalDate dataEmissão, LocalDate dataVencimento,TipoDespesa tipoDespesa) {
		super();
		this.mesAno = mesAno;
		this.currency = currency;
		this.dataEmissão = dataEmissão;
		this.dataVencimento = dataVencimento;
		this.tipoDespesa = tipoDespesa;
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

	public TipoDespesa getTipoDespesa() {
		return tipoDespesa;
	}

	public void setTipoDespesa(TipoDespesa tipoDespesa) {
		this.tipoDespesa = tipoDespesa;
	}
	
	
	
	
	
	
	
	
}
