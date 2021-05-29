package aplicacao;

import java.util.ArrayList;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empresa;
import entities.Inividual;
import entities.taxaPagamento;

public class App {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Entre com o número de contribuintes");
		int N = sc.nextInt();
		List<taxaPagamento> lista = new ArrayList<taxaPagamento>();
		
		for( int i = 1; i<= N; i++) {
			System.out.println("TaxaPagamento #" + i + "dados");
			System.out.print("Individual ou Empresa (i/e)?");
			char type = sc.next().charAt(0);
			System.out.print("Nome");
			String nome= sc.next();
			System.out.print("Renda Anual:");
			Double rendaAnual= sc.nextDouble();
			if(type == 'i') {
				System.out.print("Despesa com Saúde");
				Double  despesaSaude = sc.nextDouble();
				Inividual x = new Inividual(nome, rendaAnual, despesaSaude);
				lista.add(x);
			}
			else {
				System.out.print("Número de Funcionários:");
				Integer numeroFuncionario = sc.nextInt();
				Empresa x = new Empresa(nome, rendaAnual, numeroFuncionario);
				lista.add(x);
			}
		}
		
		System.out.println();
		System.out.println("TAXA DE PAGAMENTOS:");
		
		for (taxaPagamento tp : lista) {
			
			System.out.println(tp.getNome()+ ": $" + String.format("%.2f", tp.taxa()));
		}
		System.out.println();
		double soma = 0.0;
		for (taxaPagamento tp : lista) {
			soma += tp.taxa();
			
		}
		System.out.println("TOTAL DE TAXAS:"+ String.format("%.2f", soma));
		
		sc.close();

	}

}
