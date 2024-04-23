package com.java.fiap;

import java.util.Date;

class Fatura extends Transacao {
	private int numeroFatura;
	private boolean statusPagamento;

	public Fatura(int idTransacao, double valor, Date data, int numeroFatura) {
		super(idTransacao, valor, data, tipo);
		this.numeroFatura = numeroFatura;
		this.statusPagamento = false; // Inicialmente não está paga
	}

	public int getNumeroFatura() {
		return numeroFatura;
	}

	public void setNumeroFatura(int numeroFatura) {
		this.numeroFatura = numeroFatura;
	}

	public boolean isStatusPagamento() {
		return statusPagamento;
	}

	public void setStatusPagamento(boolean statusPagamento) {
		this.statusPagamento = statusPagamento;
	}

	// Métodos
	public void realizarPagamento() {
		this.statusPagamento = true;
	}

	public void registraNovaFatura() {
		// Implementação do registro de nova fatura
	}

	public String getDataVencimento() {
		// TODO Auto-generated method stub
		return null;
	}
}
