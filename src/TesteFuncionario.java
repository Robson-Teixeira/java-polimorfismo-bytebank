
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario funcionario = new EditorVideo();
		funcionario.setNome("Robson Teixeira");
		funcionario.setCpf("079.371.220-30");
		funcionario.setSalario(2590.00);

		System.out.println("Funcionário - Nome: " + funcionario.getNome());
		System.out.println("Funcionário - Bonificação: " + funcionario.getBonificacao());

	}

}
