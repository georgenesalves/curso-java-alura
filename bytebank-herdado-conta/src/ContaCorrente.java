
public class ContaCorrente extends Conta implements Tributavel {

	private double somaSaques;
	private double somaTransferencias;

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public boolean sacaValor(double valor) {
		if (super.saldo >= valor) {
			super.saldo -= valor;
			super.saldo = saldo - (saldo * 0.01);
			System.out.println("Seu saque será tributado em " + valor * 0.01);
			this.somaSaques = somaSaques + (valor * 0.01);
			return true;
		} else {
			System.out.println("Saldo insuficiente.");
			return false;
		}

	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}

	public boolean transfere(double valor, Conta destino) {
		if (valor <= super.saldo) {
			destino.deposita(valor);
			super.saldo = saldo - (saldo * 0.01);
			System.out.println("A sua transferencia será tributada em " + valor * 0.01);
			this.somaTransferencias = somaTransferencias + (valor * 0.01);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public double getValorImposto() {
		return this.somaSaques + this.somaTransferencias;
	}

}
