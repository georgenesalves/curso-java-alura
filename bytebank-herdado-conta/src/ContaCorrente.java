
public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
		
//	@Override
//	public boolean transfere(double valor, Conta destino) {
//	double valorATransferir = valor + 0.2;
//		return super.transfere(valorATransferir, destino);
//	}
	
	@Override
	public boolean sacaValor(double valor) {
		double valorASacar = valor + 0.2;
		return super.sacaValor(valorASacar);
	}


@Override
public void deposita(double valor) {
	super.saldo += valor;
	
}

}
