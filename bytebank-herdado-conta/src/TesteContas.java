
public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(1456, 123);
		cc.deposita(500.0);
	    
	
		
		ContaPoupanca cp = new ContaPoupanca(222, 223);
		cp.deposita(200.0);
		
		
		Cliente cl1 = new Cliente();
		cl1.nome = "Raimundo";
		cc.setTitular(cl1);
		cc.getTitular().nome = "Raimundo";
		
		
		
	
		
		
		cc.transfere(100, cp);
		
//		cc.sacaValor(50.0);
		
		
		
		
		System.out.println(cp.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cc.getTitular().nome);
		
		
		

	}

}
