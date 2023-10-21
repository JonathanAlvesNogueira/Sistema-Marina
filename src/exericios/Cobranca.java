package exericios;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Cobranca {

	private String mesAno;
	private int totalQuartos;
	private double  valorAPagar; 
	private LocalDate dataVencimento;
	private LocalDate dataPagamento;
	private double  jurosMora;
	private  double valorTotal;
	
	public Cobranca(String mesAno, int totalQuartos, double valorAPagar, LocalDate dataVencimento,
			LocalDate dataPagamento, double  jurosMora, double  valorTotal) {
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
	public double getValorAPagar() {
		return valorAPagar;
	}
	public void setValorAPagar(double valorAPagar) {
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
	public double getJurosMora() {
		return jurosMora;
	}
	public void setJurosMora(double jurosMora) {
		this.jurosMora = jurosMora;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	} 
	
	
	
	
	
	
	
	
	
	
	
}
