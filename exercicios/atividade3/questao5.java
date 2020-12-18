package maiornumero;

public class ComparaNumero {
	public static void main(String[] args) {
		comparar(5,2);
	}
	
	public static void comparar(int numero1, int numero2) {
		
		if(numero1 == numero2) {
			System.out.println("Os números são iguais");
		}else {
			System.out.println("Os números são diferentes");
		}
		
		if(numero1 > numero2) {
			System.out.println(numero1+","+numero2);
		}else {
			System.out.println(numero2+","+numero1);
		}
		
	}
}
