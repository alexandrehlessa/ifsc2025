package br.edu.ifsc.sistema.mercado.modelo;

import br.edu.ifsc.sistema.mercado.interfaces.Consumiveis;
import br.edu.ifsc.sistema.mercado.interfaces.ConsumiveisNaHora;
import br.edu.ifsc.sistema.mercado.interfaces.Descontaveis;

public class Padaria extends Produto implements ConsumiveisNaHora, Consumiveis, Descontaveis {
    private float preco;
    private boolean possuiGluten;


    public Padaria(String nome, String descricao, float preco, boolean possuiGluten) {
        super(nome, descricao);

        this.preco = preco;
        this.possuiGluten = possuiGluten;
    }

    @Override
    public boolean isConsumivel() {
        return true;
    }

    @Override
    public boolean isConsumidoImediatamente() {
        return true;
    }

    @Override
    public double aplicarDesconto(double preco, int desconto) {
        return preco * (desconto/100) ; // 10% de desconto
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean isPossuiGluten() {
        return possuiGluten;
    }

    public void setPossuiGluten(boolean possuiGluten) {
        this.possuiGluten = possuiGluten;
    }

}
