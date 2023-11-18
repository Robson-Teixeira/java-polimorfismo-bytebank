
public class AutenticacaoUtil {

	private int senha;
	private String login;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha)
			return true;
		else
			return false;
	}

	public boolean autentica(String login, int senha) {
		if (this.login == login && this.autentica(senha))
			return true;
		else
			return false;
	}

}
