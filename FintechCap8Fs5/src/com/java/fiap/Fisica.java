package com.java.fiap;

class Fisica extends Pessoa {
    private String cpf;

    public Fisica(String nome, String email, String senha, String cpf) {
        super(nome, email, senha);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void cadastrar() {
        // Implementação do cadastro para pessoa física
    }

    @Override
    public boolean autenticar(String senha) {
        // Implementação da autenticação para pessoa física
        return false;
    }
}