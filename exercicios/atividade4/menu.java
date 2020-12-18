package estacionamento;

import java.util.Scanner;

public class Menu extends Veiculo {
	public static void main(String[] args) {
		menu();
	}
	
	public static void menu() {			
		System.out.println("Selecione uma opção");
		System.out.println("Opção 1: Entrada");
		System.out.println("Opção 2: Saída");
	    System.out.println("Opção 3: Sair");
		 
	    Scanner entrada = new Scanner(System.in);
		int opcao = entrada.nextInt();		 
		
			 switch(opcao){
				 case 1:					 
					 Entrada();
					 break;
				 case 2:
					 Saida(teste);
					 break;				
				 default:
					 System.exit(0);
					 break;
			}
	     
	}
}
