package com.java.fiap;

class CategoriaTransacao {
    private int idCategoria;
    private String nomeCategoria;
    private String descricao;

    // Construtor
    public CategoriaTransacao(int idCategoria, String nomeCategoria, String descricao) {
        this.idCategoria = idCategoria;
        this.nomeCategoria = nomeCategoria;
        this.descricao = descricao;
    }

    // Métodos getters e setters
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Métodos da classe CategoriaTransacao
    public void adicionarCategoria() {
        // Implementação do método para adicionar categoria
    }

    public void removerCategoria() {
        // Implementação do método para remover categoria
    }
}
