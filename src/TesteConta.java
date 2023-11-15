
public class TesteConta {
	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente(1123, 1337);
		contaCorrente.deposita(100.00);

		ContaPoupanca contaPoupanca = new ContaPoupanca(1123, 1338);
		contaPoupanca.deposita(200.00);

		contaCorrente.transfere(10.0, contaPoupanca);

		System.out.println("Conta Corrente - Saldo: " + contaCorrente.getSaldo());
		System.out.println("Conta Poupança - Saldo: " + contaPoupanca.getSaldo());

	}
}
