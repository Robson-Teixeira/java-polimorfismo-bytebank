
public class Cliente implements Autenticavel {

	private String nome;
	private String cpf;
	private String profissao;
	private AutenticacaoUtil autenticacaoUtil;

	public Cliente() {
		this.autenticacaoUtil = new AutenticacaoUtil();
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return this.profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
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
