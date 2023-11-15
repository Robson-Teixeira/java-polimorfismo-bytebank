
public class TesteReferencias {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		funcionario.setSalario(2590.00);

		Gerente gerente = new Gerente();
		gerente.setSalario(5000.00);

		EditorVideo editorVideo = new EditorVideo();
		editorVideo.setSalario(2500.00);

		ControleBonificacao controleBonificacao = new ControleBonificacao();
		controleBonificacao.registra(funcionario);
		controleBonificacao.registra(gerente);
		controleBonificacao.registra(editorVideo);

		System.out.println("Total bonificação: " + controleBonificacao.getSoma());

	}

}
