package classes;

import interfaces.Deducao;
import interfaces.OnlinePayment;
import interfaces.Saldo;

public class PicPay implements OnlinePayment {

	@Override
	public Deducao retirarDinheiro() {
		return new Saque24horas();
	}

	@Override
	public Saldo adicionarDinheiro() {
		return new Boleto();
	}
}

