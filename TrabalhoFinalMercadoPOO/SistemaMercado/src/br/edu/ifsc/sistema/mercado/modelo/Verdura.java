package br.edu.ifsc.sistema.mercado.modelo;

import br.edu.ifsc.sistema.mercado.interfaces.Consumiveis;

public class Verdura extends Produto implements Consumiveis {
    private String tipo;
    private Float preco;


    public Verdura(String nome, String descricao, String tipo,  Float preco) {
        super(nome, descricao);
        this.preco = preco;
        this.tipo = tipo;
    }

    @Override
    public boolean isConsumivel() {
        return true;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }


}
