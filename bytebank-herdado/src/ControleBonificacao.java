
public class ControleBonificacao {
	private double Soma;
	
//	Na classe ControleBonificacao eu tenho os m�todos que registram as bonifica��es dos v�rios funcion�rios.
//	Em cada classe � definido o tipo de bonifica��o de cada um. e nessa classe estou somando todas as bonifica��es para saber o total que vai ser pago.
	
	
	
	public void registra(Funcionario f) {	
		this.Soma = Soma + f.getBonificacao();
		}
	
		
	
	public double getSoma() {
		return Soma;
	}

}
