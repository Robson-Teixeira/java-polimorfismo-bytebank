
public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero); // Invoca o construtor que recebe int e int da classe Conta
	}

	@Override
	public boolean saca(double valor) {
		return super.saca(valor + 0.20);
	}

}
