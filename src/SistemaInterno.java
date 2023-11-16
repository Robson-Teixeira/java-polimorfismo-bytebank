
public class SistemaInterno {

	private int senha = 151123;

	public void autentica(Autenticavel autenticavel) {
		if (autenticavel.autentica(this.senha))
			System.out.println("Acesso liberado ao sistema!");
		else
			System.out.println("Acesso negado ao sistema!");
	}

}
