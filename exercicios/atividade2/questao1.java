package maiornumero;

public class MaiorNumero {
	public static void main(String[] args) {
		calcular(3, 1);
	}
	
	public static void calcular (int numero1,int numero2) {
		
		if(numero1 > numero2) {
			System.out.println("O maior número é: "+numero1);
		}else {
			System.out.println("O maior número é: "+numero2);
		}
		
		
	}
}
