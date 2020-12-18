package maiornumero;

import java.util.Scanner;

public class Decrescente {
	public static void main(String[] args) {
		calcular();
	}
	
	public static void calcular() {
		int numero;
		
		System.out.println("Informe um número: ");
		numero = new Scanner(System.in).nextInt();
		
		for(int i=  numero; i > 0;i--) {
			System.out.println(i);
		}
		
	}
}
