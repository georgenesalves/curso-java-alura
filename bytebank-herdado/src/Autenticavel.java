
// A classe agora se tornou uma interface e n�o � mais uma classe. Nesse caso a classe � abstrata e o m�todos s�o abstratos.
// Nesse caso, quem assina esse contrato, precisa implementar os seguintes m�todos abaixo que passam a constar apenas a assinatura e n�o tem o corpo, j� que agora s�o abstratos.
//M�todo SetSenha e M�todo autentica.

public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
