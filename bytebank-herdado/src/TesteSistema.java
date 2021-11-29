
public class TesteSistema {

	public static void main(String[] args) {

		Autenticavel jorge = new Gerente();
		jorge.setSenha(2222);
		Administrador adm = new Administrador();
		adm.setSalario(5000.0);
		
		adm.setSenha(2222);

		
		Cliente cl = new Cliente();
		cl.autentica(2222);
		cl.setSenha(2222);
		
		
		
		

		SistemaInterno si = new SistemaInterno();
		si.autentica(jorge);
		si.autentica(adm);
		si.autentica(cl);
		
		
		

	}

}
