package com.java.fiap;

import java.util.Date;

class Investimento extends Transacao {
    private String tipo;
    private double retornoEsperado;

    public Investimento(int idTransacao, double valor, Date data, String tipo, double retornoEsperado) {
        super(idTransacao, valor, data, tipo);
        this.tipo = tipo;
        this.retornoEsperado = retornoEsperado;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getRetornoEsperado() {
        return retornoEsperado;
    }

    public void setRetornoEsperado(double retornoEsperado) {
        this.retornoEsperado = retornoEsperado;
    }

    // Métodos
    public double calcularRetorno() {
        // Implementação do método para calcular retorno
        return 0.0;
    }
}

