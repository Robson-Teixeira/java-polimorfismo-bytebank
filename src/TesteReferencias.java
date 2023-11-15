
public class TesteReferencias {

	public static void main(String[] args) {

		Funcionario gerente = new Gerente();
		gerente.setNome("Robson Teixeira");
		String nome = gerente.getNome();
		System.out.println(nome);
		
		/* Não compilam
		gerente.setSenha(131123);
		gerente.setLogin("rmtb");
		*/

	}

}
