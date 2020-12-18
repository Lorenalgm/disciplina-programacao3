package maiornumero;

public class MediaAluno {
	public static void main(String[] args) {
		calcular();
	}
	
	public static void calcular() {
		 int[] notas = new int[4];
		 int media=0;
		 int contador=0;
		 
		 for(int c = 0; c<4;c++) {
			 adicionar_notas(c, notas);
			 media = media + notas[c];
			 contador++;
		 }
		 
		 media = media/contador;
		 
		 System.out.println("A média do aluno é "+media);
		
	}
	
	public static void adicionar_notas(int posicao, int[] notas) {
		notas[posicao] = (int) (Math.random()*100);
		System.out.println("Nota "+posicao+": "+notas[posicao]);
	}	
	

}
