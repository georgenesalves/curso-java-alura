
public class SistemaInterno {

	private int senha = 5555;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getSenha() {
		return senha;
	}
	


	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if (autenticou) {
			System.out.println("Pode acessar o sistema.");
		} else {
			System.out.println("Acesso NEGADO.");
		}

	}

}
