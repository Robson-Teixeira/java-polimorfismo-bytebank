
public class Gerente extends Funcionario {

	// Caso a classe não implemente o método, ela deverá ser abstrata
	public double getBonificacao() {
		return super.getSalario();
	}

}
