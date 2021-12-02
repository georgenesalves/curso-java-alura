
public class TesteTributos {

	public static void main(String[] args) {
		
		ContaPoupanca cp = new ContaPoupanca(122, 222);
		cp.deposita(100.00);
		
			
	
		ContaCorrente cc = new ContaCorrente(122, 333);
		cc.deposita(500.00);
		
		cc.transfere(50, cp);
		
		cc.sacaValor(100.0);
		
		SeguroDeVida sv = new SeguroDeVida();
		sv.deposita(500.00);
		
		CalculadorImposto controleImpostos = new CalculadorImposto();
		controleImpostos.tributa(sv);
		controleImpostos.tributa(cc);
		
		
		System.out.println(controleImpostos.getTotalImposto());
		
		
		
	}

}
