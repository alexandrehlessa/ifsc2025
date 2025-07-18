import java.util.ArrayList;

public class Compra {
    private int pilhaCompra;
    private int dia;
    private int mes;
    private int ano;
    private ArrayList<String> produtoscomprados;
    private float preco;

    public Compra(int pilhaCompra, int dia, int mes, int ano, ArrayList<String> produtoscomprados, float preco) {
        this.pilhaCompra = pilhaCompra;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.produtoscomprados = produtoscomprados;
        this.preco = preco;
    }

    public int getPilhaCompra() {
        return pilhaCompra;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public ArrayList<String> getProdutoscomprados() {
        return produtoscomprados;
    }

    public float getPreco() {
        return preco;
    }
}
