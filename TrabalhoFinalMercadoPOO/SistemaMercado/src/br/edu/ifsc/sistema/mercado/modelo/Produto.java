package br.edu.ifsc.sistema.mercado.modelo;

import java.util.ArrayList;

public abstract class Produto {
    ArrayList<Produto> produtos = new ArrayList<Produto>();

    private String nome;

    private String descricao;

    public Produto(String nome) {
        this.nome = nome;
        this.descricao = nome;
        produtos.add(this);
    }

    public Produto(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        produtos.add(this);
    }


    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
