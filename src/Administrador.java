
public class Administrador extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticacaoUtil;

	public Administrador() {
		this.autenticacaoUtil = new AutenticacaoUtil();
	}

	@Override
	public double getBonificacao() {
		return 50.0;
	}

	@Override
	public void setSenha(int senha) {
		this.autenticacaoUtil.setSenha(senha);
	}

	@Override
	public void setLogin(String login) {
		this.autenticacaoUtil.setLogin(login);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticacaoUtil.autentica(senha);
	}

	@Override
	public boolean autentica(String login, int senha) {
		return this.autenticacaoUtil.autentica(login, senha);
	}

}
