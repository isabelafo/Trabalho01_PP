package classes;

import interfaces.Deducao;
import interfaces.OnlinePayment;
import interfaces.Saldo;

public class PayPal implements OnlinePayment {

	@Override
	public Deducao retirarDinheiro() {
		return new DepositoDireto();
	}

	@Override
	public Saldo adicionarDinheiro() {
		return new Transferencia();
	}
}
