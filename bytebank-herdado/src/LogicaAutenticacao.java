
public class LogicaAutenticacao {
	
	private int senha = 2222;

		public void setSenha(int senha) {
		this.senha = senha;
		
		
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}
