package classes;

import interfaces.Deducao;

public class Saque24horas implements Deducao{

	@Override
	public void retirarDinheiro() {
		System.out.println("Procure qualquer agencia do Banco24horas.");
	}
}
