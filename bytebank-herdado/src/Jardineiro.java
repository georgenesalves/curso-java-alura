
public class Jardineiro extends Funcionario {
	
	public double getBonificacao() {
		return super.getBonificacao() + 100;		
	}
	
	public double getDecimoTerceiro() {
		System.out.println("Chamando decimoTerceiro do jardineiro.");
		return super.getDecimoTerceiro() + super.getSalario();
	}
	

	
}
