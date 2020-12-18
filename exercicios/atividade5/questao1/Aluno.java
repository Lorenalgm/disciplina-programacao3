package escola;

public class Aluno extends Pessoa{
	public String matricula;	

	public Aluno(String matricula) {
		this.matricula = matricula;
	}
	
	public String toString() {
		return "Nome: " + nome + " e Matrícula: " + matricula;
	}
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Lorena");
		Aluno  registro = new Aluno("1234");
		
		System.out.println(pessoa.toString());
		System.out.println(registro.toString());
	}
}
