
public class ControleBonificacao {
	private double Soma;
	
//	Na classe ControleBonificacao eu tenho os métodos que registram as bonificações dos vários funcionários.
//	Em cada classe é definido o tipo de bonificação de cada um. e nessa classe estou somando todas as bonificações para saber o total que vai ser pago.
	
	
	
	public void registra(Funcionario f) {	
		this.Soma = Soma + f.getBonificacao();
		}
	
		
	
	public double getSoma() {
		return Soma;
	}

}
