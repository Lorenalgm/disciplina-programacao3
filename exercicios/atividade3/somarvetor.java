package maiornumero;

public class SomaMatriz extends ImprimirNumeros {
	public static void main(String[] args) {
		calcular(20, 10);
	}
	
	public static void calcular(int numero1, int numero2) {
		 int[][] matriz = new int[numero1][numero2];
		 int[] soma = new int[numero2];
		
		 for(int l = 0; l<numero1;l++) {
			 for(int c=0;c < numero2; c++) {
				 matriz[l][c] = (int) (Math.random()*100);
				 soma[c] = soma[c] + matriz[l][c];
			 }
		 }
		 
		 for(int l = 0; l<numero1;l++) {
			 for(int c=0;c < numero2; c++) {
				 System.out.printf("\t %d \t",matriz[l][c]);			 
			 }			 
			 System.out.println(" ");
		 }
		 
		 for(int c = 0; c<numero2;c++) {
				 System.out.printf("\t %d \t",soma[c]);
		 }
		
	}
}
