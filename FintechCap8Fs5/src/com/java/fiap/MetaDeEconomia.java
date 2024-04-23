package com.java.fiap;

import java.util.Date;

class MetaDeEconomia extends Transacao {
	private double valorMeta;
	private Date dataLimite;

	public MetaDeEconomia(int idTransacao, double valor, Date data, String tipo, double valorMeta, Date dataLimite) {
		super(idTransacao, valor, data, tipo);
		this.valorMeta = valorMeta;
		this.dataLimite = dataLimite;
	}

	public double getValorMeta() {
		return valorMeta;
	}

	public void setValorMeta(double valorMeta) {
		this.valorMeta = valorMeta;
	}

	public Date getDataLimite() {
		return dataLimite;
	}

	public void setDataLimite(Date dataLimite) {
		this.dataLimite = dataLimite;
	}

	// Métodos
	public double verificarProgresso() {
		// Implementação do método para verificar progresso
		return 0.0;
	}

	public void atingirMeta() {
		// Implementação do método para atingir a meta
	}
}
