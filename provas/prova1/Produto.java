package estoque;

import java.util.Scanner;

public class Produto extends Estoque {
	String nome;
	int unidade;
	
	Produto(String nome_produto, int unidade_produto) {
		nome = nome_produto;
		unidade = unidade_produto;
	}
	
	public String toString() {
		String produto = "Produto: ";
		produto += nome + "\n" + unidade;
		return produto;
	}
	
	public void Entrada() {
		
		System.out.println("Informe a quantidade para adicionar: ");
		Scanner entrada = new Scanner(System.in);
		int quantidade = entrada.nextInt();
		
		unidade = unidade + quantidade;
		
		System.out.println(quantidade+" "+nome+" adicionados!");

	}
	
	public void Saida() {
		
		System.out.println("Informe a quantidade para retirar: ");
		Scanner entrada = new Scanner(System.in);
		int quantidade = entrada.nextInt();
		
		unidade = unidade - quantidade;
		
		System.out.println("Produto retirado!");	
	}
	
	public void Quantidade() {
		System.out.println("Produto: "+nome);
		System.out.println("Quantidade: "+unidade);

	}
}
