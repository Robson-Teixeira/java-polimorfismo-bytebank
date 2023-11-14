
public class TesteGerente {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		gerente.setNome("Robson Teixeira");
		gerente.setCpf("079.371.220-30");
		gerente.setSalario(5000.00);
		gerente.setSenha(131123);
		gerente.setLogin("rmtb");

		System.out.println("Gerente - Nome: " + gerente.getNome());
		System.out.println("Gerente - CPF: " + gerente.getCpf());
		System.out.println("Gerente - Bonificação: " + gerente.getBonificacao());
		System.out.println("Gerente - Autenticado: " + gerente.autentica("rmtb", 131123));

	}

}
