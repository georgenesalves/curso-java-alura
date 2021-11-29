
// Gerente eh um Funcion�rio. Gerente herda da classe Funcion�rio. Assina o contrato autentic�vel. � um Autenticavel.
//
public class Gerente extends Funcionario implements Autenticavel {
	
	private LogicaAutenticacao autenticador;
	

	public Gerente() {
		this.autenticador = new LogicaAutenticacao();
		
	}
	


	public double getBonificacao() {
		System.out.println("Chamando a Bonifica��o do GERENTE.");
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
