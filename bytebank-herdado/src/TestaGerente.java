
public class TestaGerente {

	public static void main(String[] args) {
	
		Gerente g1 = new Gerente();
		g1.setNome("Geórgnes");
		g1.setCpf("296.985.701-44");
		g1.setSalario(5000);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(222);
		
		boolean autorizado = g1.autentica(222);
		
		
		
		System.out.println(autorizado);
//		System.out.println(g1.getBonificacao());
		

	}

}
