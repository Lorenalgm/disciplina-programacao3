package estacionamento;

import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Veiculo {	
	public static Calendar teste;

    public Calendar getTeste() {
         return Veiculo.teste;
    }
     
    public static void setTeste(Calendar data) {
         teste = data;
    }
	
	public static void Entrada() {
		System.out.println("Informe a placa do seu carro:");
		Scanner entrada = new Scanner(System.in);
		int placa = entrada.nextInt();	
		
		SimpleDateFormat simple = new SimpleDateFormat( "HH:mm:ss" );
		Calendar data = Calendar.getInstance();
		
		data.set(Calendar.HOUR_OF_DAY, 10);
		data.set(Calendar.MINUTE, 23);
		data.set(Calendar.SECOND, 15);	    
		
		setTeste(data);
		
		System.out.println(placa);
		System.out.println("Entrada registrada: carro "+placa);		
		System.out.println("Horário: "+simple.format(data.getTime()));		
		
		Menu.menu();
	}	


	public static void Saida(Calendar data) {
		SimpleDateFormat simple = new SimpleDateFormat( "HH:mm:ss" );	
		
		Calendar dataSaida = Calendar.getInstance();		
		dataSaida.set(Calendar.HOUR_OF_DAY, 15);
		dataSaida.set(Calendar.MINUTE, 30);
		dataSaida.set(Calendar.SECOND, 15);	 
		
		long diferenca =  dataSaida.getTimeInMillis()- data.getTimeInMillis();		
	
		diferenca = diferenca / (60*1000);	
		
		System.out.println("Entrada: "+simple.format(data.getTime()));
		System.out.println("Saída: "+simple.format(dataSaida.getTime()));
		
		int preco = 5;
		int extra= 1;
		long tempo = diferenca;
		
		if(tempo > 15 && tempo < 180) {
			System.out.println("Valor do estacionamento: R$"+preco);
		}else if(tempo > 180) {
			int horasextras = (int) Math.ceil((tempo-180)/60);
			
			
			for(int i=0;i<horasextras;i++) {
				preco = preco+extra;
			}
			
			System.out.println("Valor do estacionamento: R$"+preco);
		}else {
			System.out.println("Saída gratuita!");
		}
		
		Menu.menu();
		
	}
}
