
public class TesteFuncionario {

	public static void main(String[] args) {
		Gerente georgenes = new Gerente();
		georgenes.setNome("Geórgenes Alves");
		georgenes.setCpf("296.985.701-44");
		georgenes.setSalario(3000.00);
		
		System.out.println(georgenes.getNome());
		System.out.println(georgenes.getSalario());
		System.out.println(georgenes.getBonificacao());

	}

}
