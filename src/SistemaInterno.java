
public class SistemaInterno {

	private int senha = 151123;

	public void autentica(Autenticavel autenticavel) {

		String mensagem = autenticavel.getClass().getName() + ": Acesso %s ao sistema!";

		System.out.println(autenticavel.autentica(this.senha) ? 
				String.format(mensagem, "liberado") : String.format(mensagem, "negado"));
	}

}
