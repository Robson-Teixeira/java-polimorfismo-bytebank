
public class TesteSistema {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		gerente.setSenha(151123);

		Administrador administrador = new Administrador();
		administrador.setSenha(1511230);

		SistemaInterno sistemaInterno = new SistemaInterno();
		sistemaInterno.autentica(gerente);
		sistemaInterno.autentica(administrador);

	}

}
