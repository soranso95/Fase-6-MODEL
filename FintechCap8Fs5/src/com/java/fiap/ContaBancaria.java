package com.java.fiap;

import java.util.Date;

class ContaBancaria extends Transacao {
    private double saldoConta;
    private String numeroConta;
    private String tipoConta;

    public ContaBancaria(int idTransacao, double valor, Date data, double saldoConta, String numeroConta, String tipoConta) {
        super(idTransacao, valor, data, tipoConta);
        this.saldoConta = saldoConta;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    // Métodos
    public void depositar(double valor) {
        this.saldoConta += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldoConta) {
            this.saldoConta -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void transferir(double valor, ContaBancaria contaDestino) {
        if (valor <= saldoConta) {
            this.saldoConta -= valor;
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}