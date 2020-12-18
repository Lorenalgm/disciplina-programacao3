package maiornumero;
import java.util.HashMap;
import java.util.Map;

public class Agenda {
	public static void main(String[] args) {
		Contato lorena = new Contato("Lorena", "lorena@teste.com");
		
		Agenda agenda = new Agenda();
		agenda.adicionarContato(lorena);
		System.out.println(agenda.buscarContato("Fernando"));
		System.out.println(agenda.buscarContato("Lorena"));
		agenda.deletarContato(lorena);
		System.out.println(agenda.buscarContato("Lorena"));
	}
	
	private Map<String, String> contatos;
	
	public void adicionarContato(Contato contato) {
		contatos.put(contato.nome, contato.email);
	}
	
	public String buscarContato(String nome) {
		return (contatos.containsKey(nome)) ? nome : "Contato não encontrado";
	}
	
	public void deletarContato(Contato contato) {
		contatos.remove(contato.nome, contato.email);
	}
	
	public Agenda() {
		contatos = new HashMap<>();
	}
}
