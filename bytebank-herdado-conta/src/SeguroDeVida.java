
public class SeguroDeVida implements Tributavel {
	
	private double saldo;
	private double somaDepositos;
	
	public void deposita(double valor) {
		this.saldo = valor + valor - (valor*0.1);
		this.somaDepositos = somaDepositos + (valor*0.1);
		System.out.println("Seu depósito será tributado em " + valor*0.1);
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public double getValorImposto() {
		return this.somaDepositos;
	}
	
}
