public class Produto {
    private int produtoId;
    private String nome;
    private String marca;
    private float precoVenda;
    private String codigoBarras;
    private int quantidade;
    private Subcategoria subcategoria;

    public Produto(int produtoId, String nome, String marca, float precoVenda, String codigoBarras, int quantidade, Subcategoria subcategoria) {
        this.produtoId = produtoId;
        this.nome = nome;
        this.marca = marca;
        this.precoVenda = precoVenda;
        this.codigoBarras = codigoBarras;
        this.quantidade = quantidade;
        this.subcategoria = subcategoria;
    }

    public int getProdutoId() {
        return produtoId;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Subcategoria getSubcategoria() {
        return subcategoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setSubcategoria(Subcategoria subcategoria) {
        this.subcategoria = subcategoria;
    }
}
