
public class Funcionario {
	String nome;
	double salario;
	String departamento;

	public Funcionario() {
		this.nome = "João";
		this.salario = 6572.12;
		this.departamento = "Operacional";
	}

	public void mostrarInformacoes() {
		System.out.println(
				"Nome: " + this.nome + "," + " Salário: " + this.salario + "," + " Departamento: " + this.departamento);
	}

}
