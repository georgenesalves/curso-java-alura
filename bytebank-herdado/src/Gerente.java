
// Gerente eh um Funcionário. Gerente herda da classe Funcionário. Assina o contrato autenticável. É um Autenticavel.
//
public class Gerente extends Funcionario implements Autenticavel {
	
	private LogicaAutenticacao autenticador;
	

	public Gerente() {
		this.autenticador = new LogicaAutenticacao();
		
	}
	


	public double getBonificacao() {
		System.out.println("Chamando a Bonificação do GERENTE.");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);		
	}
}
