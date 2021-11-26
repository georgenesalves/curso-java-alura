
public class ControleDecimoTerceiro {
	double Somatorio;
	
	public void decimoTerceiro(Funcionario x) {
		System.out.println("chamando decimoTerceiro do Funcionario.");
		this.Somatorio = Somatorio + x.getDecimoTerceiro();
	}
	
	public double getSomatorio() {
		return Somatorio;
	}
	

}
