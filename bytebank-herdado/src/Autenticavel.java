
// A classe agora se tornou uma interface e não é mais uma classe. Nesse caso a classe é abstrata e o métodos são abstratos.
// Nesse caso, quem assina esse contrato, precisa implementar os seguintes métodos abaixo que passam a constar apenas a assinatura e não tem o corpo, já que agora são abstratos.
//Método SetSenha e Método autentica.

public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
