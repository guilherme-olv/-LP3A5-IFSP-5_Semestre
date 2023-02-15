
public class Gerente extends Funcionario {

	String senha;

	public Gerente() {
		this.nome = "Maria";
		this.salario = 10478.00;
		this.senha = "teste456";
		this.departamento = " Administrativo";
	}

	@Override
	public void mostrarInformacoes() {
		System.out.println("Nome: " + this.nome + "," + " Salário: " + this.salario + "," + " Departamento: "
				+ this.departamento + "," + " Senha: " + this.senha);
	}

}
