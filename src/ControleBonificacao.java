
public class ControleBonificacao {

	private double soma;

	public double getSoma() {
		return this.soma;
	}

	public void registra(Funcionario funcionario) {
		this.soma += funcionario.getBonificacao();
		// Aciona método implementado pela classe específica/tipo do objeto instanciado
	}

}
