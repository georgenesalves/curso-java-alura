
public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo getBonificacao do Designer.");
		return super.getSalario()*0.05 + 100;		
	}
	

	
}
