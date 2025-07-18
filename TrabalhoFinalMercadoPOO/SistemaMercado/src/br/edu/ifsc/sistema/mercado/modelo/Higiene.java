package br.edu.ifsc.sistema.mercado.modelo;

import br.edu.ifsc.sistema.mercado.interfaces.Consumiveis;

public class Higiene extends Produto implements Consumiveis {
    private float preco;


    public Higiene(String nome, String descricao, float preco) {
        super(nome, descricao);

        this.preco = preco;
    }

    @Override
    public boolean isConsumivel() {
        return false;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }


}
