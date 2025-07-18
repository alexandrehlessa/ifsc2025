import java.util.ArrayList;

public class ControllerProduto {
    static ArrayList<Produto> produtos = new ArrayList<Produto>();
    private static int produtoId = 0;



    public static void CadastrarProduto(Leitor leitor) {
        Main.limparConsole();
        if (ControllerSubcategoria.subcategorias.size() == 0) {
            String voltar = leitor.lerString("Nenhuma subcategoria cadastrada, é necessário alguma categoria para criar um produto. \nAperte Enter para voltar ao menu do administrador");
            return;
        }

        int novoProdutoId = produtoId + 1;
        produtoId ++;

        String novoNomeProduto = leitor.lerString("Nome do novo produto");
        String novoMarcaProduto = leitor.lerString("Nome da marca do novo produto");
        float novoPrecoVenda = leitor.lerFloat("Preço do novo produto");
        String novoCodigoBarra = leitor.lerString("Codigo de barras do novo produto");
        int novoQuantidade = leitor.lerInt("Quantidade do novo produto");
        ControllerSubcategoria.ListagemSubCategorias(leitor);
        while (true) {
            int idSubCategoria = leitor.lerInt("\nSelecione pelo ID a subcategoria desejada. '0' para voltar ao menu do administrador.");
            if (idSubCategoria == (0)) {
                return;
            }
            for (int i = 0; i < ControllerSubcategoria.subcategorias.size(); i++) {
                Subcategoria novoSubCategoria = ControllerSubcategoria.subcategorias.get(i);
                if(idSubCategoria == (novoSubCategoria.getSubcategoriaId())){
                    Produto novoProduto = new Produto(novoProdutoId, novoNomeProduto, novoMarcaProduto, novoPrecoVenda, novoCodigoBarra, novoQuantidade, novoSubCategoria);
                    produtos.add(novoProduto);
                    Main.limparConsole();
                    Categoria vo = novoSubCategoria.getCategoria();
                    System.out.println("Produto cadastrado com sucesso!" + "\nID: " + novoProduto.getProdutoId() + "\nNome: " + novoProduto.getNome() + "\nNome da subcategoria pai: " + novoSubCategoria.getNome() + "\nNome da Categoria vô: " + vo.getNome() + "\n\n");;
                    String voltar = leitor.lerString("\n\nAperte Enter para voltar ao menu do administrador");
                    return;

                };
            }
        }
    }

    public static void ListagemProdutos(Leitor leitor) {
        System.out.println("\nListagem dos produtos cadastrados:");
        if (produtos.size() > 0) {
            for (int i = 0; i < produtos.size(); i++) {
                Produto produto = produtos.get(i);
                Categoria vo = produto.getSubcategoria().getCategoria();
                System.out.println("\nID: " + produto.getProdutoId() + "\nNome: " + produto.getNome() + "\nMarca: " + produto.getMarca() +
                        "\nPreço: " + produto.getPrecoVenda() + "\nCódigo de barras: " + produto.getCodigoBarras() + "\nQuantidade: " + produto.getQuantidade() + "\nSubcategoria pai: " + produto.getSubcategoria().getNome() + "\nNome da Categoria vô: " + vo.getNome() + "\n");

            }
            System.out.println("Fim da listagem dos produtos");
        }

        if (produtos.size() == 0) {
            System.out.println("\nNenhum produto cadastrada!");
            String voltar = leitor.lerString("\n\nAperte Enter para voltar!");
        }
    }

}
