
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero); // Invoca o construtor que recebe int e int da classe Conta
	}

	@Override
	public boolean saca(double valor) {
		return super.saca(valor + 0.20);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}

}
