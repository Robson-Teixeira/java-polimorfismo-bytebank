
public class Administrador extends Funcionario implements Autenticavel {

	private int senha;
	private String login;

	@Override
	public double getBonificacao() {
		return 50.0;
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public void setLogin(String login) {
		this.login = login;
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha)
			return true;
		else
			return false;
	}

	@Override
	public boolean autentica(String login, int senha) {
		if (this.login == login && this.autentica(senha))
			return true;
		else
			return false;
	}

}
