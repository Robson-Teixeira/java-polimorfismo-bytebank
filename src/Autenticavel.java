
public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract void setLogin(String login);

	public abstract boolean autentica(int senha);

	public abstract boolean autentica(String login, int senha);

}
