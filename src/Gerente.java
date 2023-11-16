
public class Gerente extends FuncionarioAutenticavel {

	// Caso a classe não implemente o método, ela deverá ser abstrata
	public double getBonificacao() {
		return super.getSalario();
	}

}
