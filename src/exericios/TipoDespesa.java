package exericios;

public class TipoDespesa {

	private String nome;
	private boolean valorRaeado;
	
	public TipoDespesa(String nome, boolean valorRaeado) {
		super();
		this.nome = nome;
		this.valorRaeado = valorRaeado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isValorRaeado() {
		return valorRaeado;
	}
	public void setValorRaeado(boolean valorRaeado) {
		this.valorRaeado = valorRaeado;
	}
	
	
	
	
	
	
}
