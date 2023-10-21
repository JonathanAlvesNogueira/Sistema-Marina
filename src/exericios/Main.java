package exericios;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		List<Apartamento> listAps = new LinkedList<>();
		List<Proprietario> listProp = new LinkedList<>();
		
		
		int opc = 0;
		while(opc != 9){
			opc = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção do menu "
					+ "\n   "
					+ "1. Cadastrar apartamento"
					+ "\n 2. Gerar Boleto"
					+ "\n 3. Lançar despesa"));
			switch(opc) {
				case 1: 
					System.out.println("Cadastrando apartamento...");
					System.out.println("Informe o nome");
					String nome = JOptionPane.showInputDialog("Informe o nome do proprietário: ");
					
					System.out.println("Informe o telefone do Proprietário: ");
					String telefone = JOptionPane.showInputDialog("Informe o nome do proprietário: ");
					Proprietario prop = new Proprietario(nome, telefone);
					listProp.add(prop);
				
					int qtdeQuartos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de quartos: "));
					int numeroAP = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero do apartamento: "));
					Apartamento ap = new Apartamento(numeroAP, qtdeQuartos, prop);
					listAps.add(ap);
					break;
				case 2:
					String mesAno = JOptionPane.showInputDialog("Informe o mês do ano: ");
					int totalQuartos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de quartos: "));
					double valorAPagar = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a pagar: "));
					
					// Capturar o dia
			        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de vencimento:"));
			        

			        // Capturar o mês
			        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês de vencimento:"));

			        // Capturar o ano
			        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de vencimento:"));

			        // Criar um objeto LocalDate
			        LocalDate dataVencimento = LocalDate.of(ano, mes, dia);
			        
			        
			        
			    	// Capturar o dia
			        
			        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de vencimento:"));

			        // Capturar o mês
			        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês de vencimento:"));

			        // Capturar o ano
			        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de vencimento:"));

			        // Criar um objeto LocalDate
			        LocalDate dataPagamento = LocalDate.of(ano, mes, dia);
			        
			        double jurosMora = 0.0;
					
			        if (dataPagamento.isAfter(dataVencimento)) {
			        	jurosMora = 0.02;
			        } else if (dataPagamento.isBefore(dataVencimento)) {
			        	jurosMora = 0.0;
			        } 
					
			        double valorTotal = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total da cobrança: "));
			        if (jurosMora > 0.0) {
			        	valorTotal = valorTotal + (valorTotal * jurosMora);
			        }
			        
					Cobranca cob = new Cobranca(mesAno,totalQuartos, valorAPagar, dataVencimento, dataPagamento, jurosMora, valorTotal);
					break;
					
				case 3:
					
					String mesDoAno = JOptionPane.showInputDialog("Informe o mes ") ;
					double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da despesa: "));
					
					 dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de emissao:"));

				        // Capturar o mês
				        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês de emissao:"));

				        // Capturar o ano
				        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de emissao:"));

				        // Criar um objeto LocalDate
				        LocalDate dataEmissao = LocalDate.of(ano, mes, dia);
				        
				        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de vencimento:"));

				        // Capturar o mês
				        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês de vencimento:"));

				        // Capturar o ano
				        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de vencimento:"));

				        // Criar um objeto LocalDate
				        LocalDate dataVencimentoDespesa = LocalDate.of(ano, mes, dia);
					
					Despesa desp = new Despesa(mesDoAno, valor, dataEmissao, dataVencimentoDespesa);
					break;
			}
			
			
			
			
		}
		
		
		
		
		
		
		
	}

}
