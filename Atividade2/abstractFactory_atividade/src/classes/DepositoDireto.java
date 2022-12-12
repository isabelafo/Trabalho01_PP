package classes;

import interfaces.Deducao;

public class DepositoDireto implements Deducao {
	
	@Override
	public void retirarDinheiro() {
		System.out.println("Dep�sito efetuado.");
	}
}
