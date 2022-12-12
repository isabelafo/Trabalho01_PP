package classes;

import interfaces.Saldo;

public class Boleto implements Saldo {
	private String codigoBarras;

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	@Override
	public void adicionarDinheiro() {
		System.out.println("C�digo de barras OK.");
	}
}
