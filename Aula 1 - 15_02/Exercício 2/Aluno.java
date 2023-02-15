
public class Aluno extends Pessoa {
	int matricula;

	public Aluno() {
		this.matricula = 123;
	}

	@Override
	public void apresentar() {
		System.out.println("Olá, eu sou o aluno " + this.nome + " com matrícula " + this.matricula + " e tenho "
				+ this.idade + " anos");
	}
}
