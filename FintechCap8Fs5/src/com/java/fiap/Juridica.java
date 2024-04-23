package com.java.fiap;

class Juridica extends Pessoa {
    private String cnpj;

    public Juridica(String nome, String email, String senha, String cnpj) {
        super(nome, email, senha);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void cadastrar() {
        // Implementação do cadastro para pessoa jurídica
    }

    @Override
    public boolean autenticar(String senha) {
        // Implementação da autenticação para pessoa jurídica
        return false;
    }
}