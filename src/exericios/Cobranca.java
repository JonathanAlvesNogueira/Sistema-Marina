package exericios;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Cobranca {

	private String mesAno;
	private int totalQuartos;
	private BigDecimal valorAPagar; 
	private LocalDate dataVencimento;
	private LocalDate dataPagamento;
	private BigDecimal jurosMora;
	private BigDecimal valorTotal;
	
	public Cobranca(String mesAno, int totalQuartos, BigDecimal valorAPagar, LocalDate dataVencimento,
			LocalDate dataPagamento, BigDecimal jurosMora, BigDecimal valorTotal) {
		super();
		this.mesAno = mesAno;
		this.totalQuartos = totalQuartos;
		this.valorAPagar = valorAPagar;
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
		this.jurosMora = jurosMora;
		this.valorTotal = valorTotal;
	}
	public String getMesAno() {
		return mesAno;
	}
	public void setMesAno(String mesAno) {
		this.mesAno = mesAno;
	}
	public int getTotalQuartos() {
		return totalQuartos;
	}
	public void setTotalQuartos(int totalQuartos) {
		this.totalQuartos = totalQuartos;
	}
	public BigDecimal getValorAPagar() {
		return valorAPagar;
	}
	public void setValorAPagar(BigDecimal valorAPagar) {
		this.valorAPagar = valorAPagar;
	}
	public LocalDate getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public LocalDate getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	public BigDecimal getJurosMora() {
		return jurosMora;
	}
	public void setJurosMora(BigDecimal jurosMora) {
		this.jurosMora = jurosMora;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	} 
	
	
	
	
	
	
	
	
	
	
	
}
