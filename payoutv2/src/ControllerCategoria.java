import java.util.ArrayList;

public class ControllerCategoria {


    private static int categoriaId = 0;
    static ArrayList<Categoria> categorias = new ArrayList<Categoria>();

    public static void CadastrarCategoria(Leitor leitor) {

        Main.limparConsole();
        int novoCategoriaId = categoriaId + 1;
        categoriaId ++;
        String novoNome = leitor.lerString("Nome da Categoria: ");
        String novoSecao = leitor.lerString("Seção do mercado: ");
        Categoria novaCategoria = new Categoria(novoCategoriaId, novoNome, novoSecao);
        categorias.add(novaCategoria);
        ListagemCategorias(leitor);

    }

    public static void ListagemCategorias(Leitor leitor) {
        System.out.println("\nListagem das categorias cadastradas:\n");
        if (categorias.size() > 0) {
            for (int i = 0; i < categorias.size(); i++) {
                Categoria categoria = categorias.get(i);
                System.out.println("ID: " + categoria.getCategoriaId() + ", Nome: " + categoria.getNome() + ", Seção: " + categoria.getSecaoMercado());
            }
            System.out.println("\nFim da listagem de categorias\n");
        }

        if (categorias.size() == 0) {
            System.out.println("\nNenhuma categoria cadastrada!");
            String voltar = leitor.lerString("\n\nAperte Enter para voltar ao menu do administrador");

        }

    }
}
