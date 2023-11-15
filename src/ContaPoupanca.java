
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero); // Invoca o construtor que recebe int e int da classe Conta
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

}
