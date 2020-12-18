package maiornumero;

public class ImprimirNumeros {
	public static void main(String[] args) {
		calcular(30);
	}
	
	public static void calcular(int numero) {
		int impares = 0;
		int pares = 1;
		
		for(int i=1;i<=numero;i++) {
			if( i % 2 == 0) {
				pares = pares * i;
			}else {
				impares = impares+i;
			}
		}
		
		
		System.out.println("soma dos números impares: "+impares);
		System.out.println("multiplicação dos números pares: "+pares);
	}
}

