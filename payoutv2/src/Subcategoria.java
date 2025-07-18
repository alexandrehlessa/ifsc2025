public class Subcategoria {
    private int subcategoriaId;
    private String nome;
    private Categoria categoria;

    public Subcategoria(int subcategoriaId, String nome, Categoria categoria) {
        this.subcategoriaId = subcategoriaId;
        this.nome = nome;
        this.categoria = categoria;
    }

    public int getSubcategoriaId() {
        return subcategoriaId;
    }

    public String getNome() {
        return nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
