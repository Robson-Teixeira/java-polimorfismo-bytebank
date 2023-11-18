
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticacaoUtil;

	public Gerente() {
		this.autenticacaoUtil = new AutenticacaoUtil();
	}

	// Caso a classe não implemente o método, ela deverá ser abstrata
	public double getBonificacao() {
		return super.getSalario();
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
