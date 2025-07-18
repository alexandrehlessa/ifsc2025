public class Categoria {
    private int categoriaId;
    private String  nome;
    private String secaoMercado;


    public Categoria(int categoriaId, String nome, String secaoMercado) {
        this.categoriaId = categoriaId;
        this.nome = nome;
        this.secaoMercado = secaoMercado;
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public String getNome() {
        return nome;
    }

    public String getSecaoMercado() {
        return secaoMercado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSecaoMercado(String secaoMercado) {
        this.secaoMercado = secaoMercado;
    }
}
