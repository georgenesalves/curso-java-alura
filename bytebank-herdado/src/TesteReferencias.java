
public class TesteReferencias {

	public static void main(String[] args) {
		Gerente g1 = new Gerente(); // criando um objeto do tipo gerente. criando uma vari�vel g1 que vai receber o novo gerente.
//		A parte da esquerda � mais gen�rica e a parte da direita � espec�fica.
		g1.setNome("Ant�nio");
//		String nome = g1.getNome();
//		System.out.println(nome);
		
		
//		g1.setSenha(222);
//		g1.autentica(222);
		g1.setSalario(5000.0);
		
		ControleBonificacao controle1 = new ControleBonificacao();
		controle1.registra(g1);
		ControleDecimoTerceiro controle2 = new ControleDecimoTerceiro();		
//		O objeto2 � do tipo controleDecimoTerceiro.
		
		
//		boolean autenticou = g1.autentica(222);
//		System.out.println(autenticou);
		
//		Funcionario func1 = new Funcionario();
//		func1.setNome("Jorge");
//		func1.setSalario(2500.0);
//		controle1.registra(func1);
//		controle2.decimoTerceiro(func1);
		
		
		
		Jardineiro jard1 = new Jardineiro();
		jard1.setNome("Severino");
		jard1.setSalario(2000.0);
		controle2.decimoTerceiro(jard1); //chama o m�todo decimoTerceiro da classe ControleDecimoTerceiro.
		
		controle1.registra(jard1);  //chama o m�todo registra da classe ControleBonificacao. 
//		
//		Designer d = new Designer();
//		d.setSalario(3000.0);
//		controle1.registra(d);
//		controle2.decimoTerceiro(d);		
		
		
		System.out.println(controle1.getSoma());
		System.out.println(controle2.getSomatorio());
		
	

	}

}
