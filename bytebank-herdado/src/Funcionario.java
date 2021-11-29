
//A classe abstract não pode instaciar objeto, porque é abstrata. os objetos somente serão instanciados a partir das classes filhas.

public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario;

//	O método abstrato é um método sem o bloco de código. Não há implementação. Exige que o método seja descrito em cada classe em separado.
	public abstract double getBonificacao();

	public double getDecimoTerceiro() {
		System.out.println("Chamando decimoTerceiro do funcionário.");
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
