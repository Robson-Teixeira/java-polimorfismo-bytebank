
public class ControleBonificacao {

	private double soma;

	public double getSoma() {
		return this.soma;
	}

	public void registra(Funcionario funcionario) {
		this.soma += funcionario.getBonificacao(); // Método implementado pela classe específica/referenciada
	}

}
