import javax.management.MBeanRegistration;

public class TesteReferencias {

	public static void main(String[] args) {
		Gerente g1 = new Gerente(); // criando um objeto do tipo gerente. criando uma variável g1 que vai receber o novo gerente.
//		A parte da esquerda é mais genérica e a parte da direita é específica.
		g1.setNome("Antônio");
		String nome = g1.getNome();
//		System.out.println(nome);
		
		
//		g1.setSenha(222);
//		g1.autentica(222);
		g1.setSalario(5000.0);
		
		ControleBonificacao controle1 = new ControleBonificacao();
		controle1.registra(g1);
	
		
		
		
		
//		boolean autenticou = g1.autentica(222);
//		System.out.println(autenticou);
		
		Funcionario func1 = new Funcionario();
		func1.setNome("Jorge");
		func1.setSalario(2500.0);
		controle1.registra(func1);
		
		
		Jardineiro jard1 = new Jardineiro();
		jard1.setNome("Severino");
		jard1.setSalario(2000.0);
		
		controle1.registra(jard1);
		
		
		
		
		
		System.out.println(controle1.getSoma());
		System.out.println();
		
	

	}

}
