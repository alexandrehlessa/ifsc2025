package br.edu.ifsc.sistema.mercado.modelo;

import br.edu.ifsc.sistema.mercado.interfaces.Consumiveis;

public class Carne extends Produto implements Consumiveis {
    private float precoKilo;

    public Carne(String nome, String descricao, float precoKilo) {
        super(nome, descricao);
        this.precoKilo = precoKilo;
    }

    public float getPrecoKilo() {
        return precoKilo;
    }

    public void setPrecoKilo(float precoKilo) {
        this.precoKilo = precoKilo;
    }

    @Override
    public boolean isConsumivel() {
        return true;
    }
}
