
public class Cliente implements Autenticavel {

	private String nome;
	private String cpf;
	private String profissao;
	private int senha;
	private String login;

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
