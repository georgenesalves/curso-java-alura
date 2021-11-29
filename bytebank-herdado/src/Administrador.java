
public class Administrador extends Funcionario implements Autenticavel {
	
	private LogicaAutenticacao autenticador; // Atributo;
	
	public Administrador() {  // construtor da classe 
		this.autenticador = new LogicaAutenticacao(); //
		
	}

	@Override
	public double getBonificacao() {
		return 50;
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
