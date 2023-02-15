
public class Pessoa {
	String nome;
	int idade;

	public Pessoa() {
		this.nome = "Guilherme";
		this.idade = 22;
	}

	public void apresentar() {
		System.out.println("Olá, eu sou o aluno " + this.nome + " e tenho " + this.idade + " anos");
	}
}
