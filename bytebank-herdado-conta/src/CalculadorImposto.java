
//Cada vez que houver uma retirada atrav�s de uma transferencia ou um saque na conta corrente, vai ser descontado 1%;
//Cada vez que houver um dep�sito na conta SeguroDeVida, vai ser tributado 10% do valor.


public class CalculadorImposto {
	private double totalImposto;
	
	public void tributa(Tributavel tb) {
		double valor = tb.getValorImposto();
		this.totalImposto += valor;		
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
	

	
	

}
