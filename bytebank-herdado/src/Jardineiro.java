
public class Jardineiro extends Funcionario {
	
	public double getBonificacao() {
		return 100;		
	}
	
	public double getDecimoTerceiro() {
		System.out.println("Chamando decimoTerceiro do jardineiro.");
		return super.getDecimoTerceiro() + super.getSalario();
	}
	

	
}
