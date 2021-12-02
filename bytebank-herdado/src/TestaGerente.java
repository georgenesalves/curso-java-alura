
public class TestaGerente {

	public static void main(String[] args) {
		
		Gerente g2 = new Gerente();
		g2.setNome("Jorge");
		g2.setSalario(8000.0);
		//g2.setSenha(2222);
		
		Gerente gte = new Gerente();
		gte.setSenha(5555);
		
		
		
		
		
		SistemaInterno sis2 = new SistemaInterno();
		sis2.autentica(gte);
//		gte.setSenha(5555);
		
//		boolean autorizado = g2.autentica(5555);
//		System.out.println(autorizado);
		
		
	
//		Gerente g1 = new Gerente();
//		g1.setNome("Geórgnes");
//		g1.setCpf("296.985.701-44");
//		g1.setSalario(5000);
//		
//		System.out.println(g1.getNome());
//		System.out.println(g1.getCpf());
//		System.out.println(g1.getSalario());
//		
//		g1.setSenha(222);
//		
//		boolean autorizado = g1.autentica(222);
//		
//		
//		
//		System.out.println(autorizado);
//		System.out.println(g1.getBonificacao());
		

	}

}
