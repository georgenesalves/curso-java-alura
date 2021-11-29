
//A classe abstract n�o pode instaciar objeto, porque � abstrata. os objetos somente ser�o instanciados a partir das classes filhas.

public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario;

//	O m�todo abstrato � um m�todo sem o bloco de c�digo. N�o h� implementa��o. Exige que o m�todo seja descrito em cada classe em separado.
	public abstract double getBonificacao();

	public double getDecimoTerceiro() {
		System.out.println("Chamando decimoTerceiro do funcion�rio.");
		return this.salario * 0.12;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
