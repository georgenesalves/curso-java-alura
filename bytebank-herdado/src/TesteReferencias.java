
public class TesteReferencias {

	public static void main(String[] args) {
		Gerente g1 = new Gerente(); 
		
		g1.setNome("Antônio");
//		g1.autentica(2222);
//		String nome = g1.getNome();
		g1.setSalario(5000.0);
		
		
		Designer func1 = new Designer();
		func1.setNome("Jorge");
		func1.setSalario(2500.0);
		
		Jardineiro jard1 = new Jardineiro();
		jard1.setNome("Severino");
		jard1.setSalario(2000.0);
		
		
		
		
		ControleBonificacao controle1 = new ControleBonificacao();
		controle1.registra(g1);
		controle1.registra(func1);
		controle1.registra(jard1); 
		
		
		
//		ControleDecimoTerceiro controle2 = new ControleDecimoTerceiro();	
//		controle2.decimoTerceiro(jard1);
//		controle2.decimoTerceiro(func1);

		
	
		
//		boolean autenticou = g1.autentica(222);
//		System.out.println(autenticou);
		
		
		System.out.println(jard1.getBonificacao());
		System.out.println(controle1.getSoma());
//		System.out.println(controle2.getSomatorio());
		
	

	}

}
