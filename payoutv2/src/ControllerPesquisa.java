import java.util.ArrayList;

public class ControllerPesquisa {

    static Leitor leitor = new Leitor();
    static ArrayList<String> produtosEncontrados = new ArrayList<String>();
    static int totalDeProdutosEncontrados = 0;

    public static void Pesquisar() {
        while (true) {
            if (ControllerProduto.produtos.size() == 0) {
                System.out.println("\nNenhum produto cadastrada!");
                String voltar = leitor.lerString("\n\nAperte Enter para voltar!");
                break;
            }
            Main.limparConsole();
            System.out.println("------------------");
            System.out.println("(1) Pesquisar por nome");
            System.out.println("(2) Pesquisar por id");
            System.out.println("(3) Pesquisar por categoria");
            System.out.println("(4) Todos os produtos");
            System.out.println("(0) Sair");
            System.out.println("------------------");
            int opcao = leitor.lerInt("Opção");
            if (opcao == 1) {
                PesquisarPorNome();
            }
            if (opcao == 2) {
                PesquisarPorId();
            }
            if (opcao == 3) {
                PesquisarPorCategoria();
            }
            if (opcao == 4) {
                ControllerProduto.ListagemProdutos(leitor);
                String voltar = leitor.lerString("\n\nAperte Enter para voltar!");
            }
            if (opcao == 0) {
                break;
            }
        }
    }

    public static void PesquisarPorCategoria() {
        String categoriaPesquisa = leitor.lerString("Digite a categoria do produto");
        for (int i = 0; i < ControllerProduto.produtos.size(); i++) {
            Produto produto = ControllerProduto.produtos.get(i);
            Categoria vo = produto.getSubcategoria().getCategoria();
            String categoriaMinusculo = vo.getNome().toLowerCase();
            String categoriaPesquisaMinusculo = categoriaPesquisa.toLowerCase();
            if (categoriaMinusculo.equals(categoriaPesquisaMinusculo)) {
                System.out.println("\nID: " + produto.getProdutoId() + "\nNome: " + produto.getNome() + "\nMarca: " + produto.getMarca() +
                        "\nPreço: " + produto.getPrecoVenda() + "\nCódigo de barras: " + produto.getCodigoBarras() + "\nQuantidade: " + produto.getQuantidade() + "\nSubcategoria pai: " + produto.getSubcategoria().getNome() + "\nNome da Categoria vô: " + vo.getNome() + "\n");
                produtosEncontrados.add(produto.getNome());
                totalDeProdutosEncontrados++;
            }
        }
        if (totalDeProdutosEncontrados == 0) {
            System.out.println("\nNenhum produto cadastrado com essa categoria!");
        }
        String voltar = leitor.lerString("\n\nAperte Enter para voltar!");
    }

    public static void PesquisarPorId() {
        int idPesquisa = leitor.lerInt("Digite o ID do produto");
        for (int i = 0; i < ControllerProduto.produtos.size(); i++) {
            Produto produto = ControllerProduto.produtos.get(i);
            Categoria vo = produto.getSubcategoria().getCategoria();
            if (produto.getProdutoId() == (idPesquisa)) {
                System.out.println("\nID: " + produto.getProdutoId() + "\nNome: " + produto.getNome() + "\nMarca: " + produto.getMarca() +
                        "\nPreço: " + produto.getPrecoVenda() + "\nCódigo de barras: " + produto.getCodigoBarras() + "\nQuantidade: " + produto.getQuantidade() + "\nSubcategoria pai: " + produto.getSubcategoria().getNome() + "\nNome da Categoria vô: " + vo.getNome() + "\n");
                produtosEncontrados.add(produto.getNome());
                totalDeProdutosEncontrados++;
            }
        }
        if (totalDeProdutosEncontrados == 0) {
            System.out.println("\nNenhum produto cadastrado com esse ID!");
        }
        String voltar = leitor.lerString("\n\nAperte Enter para voltar!");
    }


    public static void PesquisarPorNome() {
        String nomePesquisa = leitor.lerString("Digite o nome do produto");
        for (int i = 0; i < ControllerProduto.produtos.size(); i++) {
            Produto produto = ControllerProduto.produtos.get(i);
            Categoria vo = produto.getSubcategoria().getCategoria();
            String produtoMinusculo = produto.getNome().toLowerCase();
            String nomePesquisaMinusculo = nomePesquisa.toLowerCase();
            if (produtoMinusculo.equals(nomePesquisaMinusculo)) {
                System.out.println("\nID: " + produto.getProdutoId() + "\nNome: " + produto.getNome() + "\nMarca: " + produto.getMarca() +
                        "\nPreço: " + produto.getPrecoVenda() + "\nCódigo de barras: " + produto.getCodigoBarras() + "\nQuantidade: " + produto.getQuantidade() + "\nSubcategoria pai: " + produto.getSubcategoria().getNome() + "\nNome da Categoria vô: " + vo.getNome() + "\n");
                produtosEncontrados.add(produto.getNome());
                totalDeProdutosEncontrados++;
            }
        }
        if (totalDeProdutosEncontrados == 0) {
            System.out.println("\nNenhum produto cadastrado com esse Nome!");
        }
        String voltar = leitor.lerString("\n\nAperte Enter para voltar!");
    }

}