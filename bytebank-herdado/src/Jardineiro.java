
public class Jardineiro extends Funcionario {
	
	public double getBonificacao() {
//		return 100;		
		return super.getSalario()*0.05;
	}
	
	public double getDecimoTerceiro() {
		System.out.println("Chamando decimoTerceiro do jardineiro.");
		return super.getDecimoTerceiro() + super.getSalario();
	}
	

	
}
