package com.java.fiap;

import java.util.Date;

class Transacao {
    private int idTransacao;
    private double valor;
    private Date data;
    protected static String tipo; // Receita ou despesa

    // Construtor
    public Transacao(int idTransacao, double valor, Date data, String tipo) {
        this.idTransacao = idTransacao;
        this.valor = valor;
        this.data = data;
        this.tipo = tipo;
    }

    // Métodos getters e setters
    public int getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(int idTransacao) {
        this.idTransacao = idTransacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Métodos da classe Transacao
    public void categorizarTransacao() {
        // Implementação do método para categorizar a transação
    }

    public void gerarRelatorio() {
        // Implementação do método para gerar relatório
    }
}
