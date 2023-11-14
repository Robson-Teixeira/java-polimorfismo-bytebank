
public class FuncionarioTipo {

	private String nome;
	private String cpf;
	private double salario;
	private int tipo = 0; // 0 - Funcionário comum, 1 - Gerente, 2 - Diretor
	private int senha;

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

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getTipo() {
		return this.tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getBonificacao() {
		if (this.tipo == 0) // Funcionário comum
			return this.salario * 0.1;
		else if (this.tipo == 1) // Gerente
			return this.salario;
		else // Diretor
			return this.salario + 1000.0;

		// Como evitar o aumento de possibilidades para cada novo tipo?
	}

	public boolean autentica(int senha) {
		if (this.senha == senha)
			return true;
		else
			return false;

		// Como expor o método apenas para tipos específicos?
	}

}
