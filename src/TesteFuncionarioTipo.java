
public class TesteFuncionarioTipo {

	public static void main(String[] args) {

		FuncionarioTipo funcionarioComum = new FuncionarioTipo();
		funcionarioComum.setSalario(2590.00);

		System.out.println("Funcionário Tipo 0 - Tipo: " + funcionarioComum.getTipo());
		System.out.println("Funcionário Tipo 0 - Bonificação: " + funcionarioComum.getBonificacao());

		FuncionarioTipo funcionarioGerente = new FuncionarioTipo();
		funcionarioGerente.setSalario(5000.00);
		funcionarioGerente.setTipo(1);

		System.out.println("Funcionário Tipo 1 - Tipo: " + funcionarioGerente.getTipo());
		System.out.println("Funcionário Tipo 1 - Bonificação: " + funcionarioGerente.getBonificacao());

		FuncionarioTipo funcionarioDiretor = new FuncionarioTipo();
		funcionarioDiretor.setSalario(7000.00);
		funcionarioDiretor.setTipo(3);

		System.out.println("Funcionário Tipo 1 - Tipo: " + funcionarioDiretor.getTipo());
		System.out.println("Funcionário Tipo 1 - Bonificação: " + funcionarioDiretor.getBonificacao());

	}

}
