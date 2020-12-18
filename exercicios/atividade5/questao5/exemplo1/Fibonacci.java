package tabuada;

public class Fibonacci extends Area {
	public static void main(String[] args) {
		fibonacci();
	}
	
	public static void fibonacci() {
		int numero = 10;
		int num1 = 0, num2 = 1; 
		int contador = 0; 
  
        while (contador < numero) { 
  
            System.out.print(num1 + " "); 
  
            int num3 = num2 + num1; 
            num1 = num2; 
            num2 = num3; 
            contador++; 
        }
        
        menu();
		
	}
}
