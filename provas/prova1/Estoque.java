package estoque;

import java.util.Scanner;

public class Estoque {
	public String quantidade;
	public static int identificacao=4;
	
	public static void main(String[] args) {
		Produto caneta = new Produto("Caneta", 120);
		Produto lapis = new Produto("Lapis", 24);
		Produto papel = new Produto("Papel", 2500);
		Produto borracha = new Produto("Borracha", 6);
		
		System.out.println("Qual seu nome?");
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.next();
		
		System.out.println("Qual sua senha?");
		String senha = entrada.next();
		
		
		if(nome.equals("unifap") && senha.equals("unifap123")) {
			System.out.println("Boas vindas!");
			menu(caneta, lapis, papel, borracha);
		}else {
			System.out.println("Acesso negado!");
		}
		
	}
	
	public static void menu(Produto caneta, Produto lapis, Produto papel,Produto borracha) {			
		System.out.println("Selecione uma opção");
		System.out.println("Opção 1: Entrada");
		System.out.println("Opção 2: Saída");
	    System.out.println("Opção 3: Quantidade em estoque");
	    System.out.println("Opção 4: Sair do programa");
		 
	    Scanner entrada = new Scanner(System.in);
		int opcao = entrada.nextInt();		 
		
			 switch(opcao){
				 case 1:
					 int teste = verificar_produto();
					 
					 switch(teste){
					 	case 1:
					 		 caneta.Entrada();
					 		menu(caneta, lapis, papel, borracha);
					 		 break;
					 	case 2:
					 		lapis.Entrada();
					 		menu(caneta, lapis, papel, borracha);
					 		break;
					 	case 3:
					 		papel.Entrada();
					 		menu(caneta, lapis, papel, borracha);
							break;
					 	case 4:
					 		borracha.Entrada();
					 		menu(caneta, lapis, papel, borracha);
					 	default:
					 		System.out.println("Entrada inválida!");
							menu(caneta, lapis, papel, borracha);							
							break;	 
					 }
				 case 2:
					 int teste2 = verificar_produto();
					 
					 switch(teste2){
					 	case 1:
					 		 caneta.Saida();
					 		menu(caneta, lapis, papel, borracha);
					 		 break;
					 	case 2:
					 		lapis.Saida();
					 		menu(caneta, lapis, papel, borracha);
					 		break;
					 	case 3:
					 		papel.Saida();
					 		menu(caneta, lapis, papel, borracha);
							break;
					 	case 4:
					 		borracha.Saida();
					 		menu(caneta, lapis, papel, borracha);
					 	default:
					 		System.out.println("Entrada inválida!");
							menu(caneta, lapis, papel, borracha);							
							break;	 
					 }
				 case 3:
					 int teste3 = verificar_produto();
					 
					 switch(teste3){
					 	case 1:
					 		 caneta.Quantidade();
					 		menu(caneta, lapis, papel, borracha);
					 		 break;
					 	case 2:
					 		lapis.Quantidade();
					 		menu(caneta, lapis, papel, borracha);
					 		break;
					 	case 3:
					 		papel.Quantidade();
					 		menu(caneta, lapis, papel, borracha);
							break;
					 	case 4:
					 		borracha.Quantidade();
					 		menu(caneta, lapis, papel, borracha);
					 	default:
					 		System.out.println("Entrada inválida!");
							menu(caneta, lapis, papel, borracha);							
							break;	 
					 }
				 default:
					 System.out.println("Até logo!");
					break;	 
					 

			}
	     
	}
	
	public static int verificar_produto() {
		System.out.println("Selecione um produto");
		System.out.println("Opção 1: Caneta");
		System.out.println("Opção 2: Lápis");
	    System.out.println("Opção 3: Papel");
	    System.out.println("Opção 4: Borracha");
		 
	    Scanner entrada = new Scanner(System.in);
		int identificacao = entrada.nextInt();
		
		return identificacao;
	}
	
	

	
}
