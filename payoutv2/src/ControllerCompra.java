import java.util.ArrayList;

public class ControllerCompra {
    public static int pilhaCompra = 0;
    static ArrayList<Compra> compras = new ArrayList<Compra>();
    static ArrayList<String> carrinhodecompras = new ArrayList<>();
    static int diaAtual = ControllerData.Data()[0];
    static int mesAtual = ControllerData.Data()[1];
    static int anoAtual = ControllerData.Data()[2];
    static float precoTotal = 0;
    static float totalComprado = 0;

    static Leitor leitor = new Leitor();

    public static float CarrinhoDeCompras() {
        carrinhodecompras.clear();
        float precoProdutos = 0;
        if (ControllerProduto.produtos.size() == 0) {
            System.out.println("\nNenhum produto cadastrada!");
            String voltar = leitor.lerString("\n\nAperte Enter para voltar!");
            return 0;
        }
        System.out.println("\nListagem dos produtos cadastrados:");
        if (ControllerProduto.produtos.size() > 0) {
            for (int i = 0; i < ControllerProduto.produtos.size(); i++) {
                Produto produto = ControllerProduto.produtos.get(i);
                Categoria vo = produto.getSubcategoria().getCategoria();
                System.out.println("\nID: " + produto.getProdutoId() + "\nNome: " + produto.getNome() + "\nMarca: " + produto.getMarca() +
                        "\nPreço: " + produto.getPrecoVenda() + "\nCódigo de barras: " + produto.getCodigoBarras() + "\nQuantidade: " + produto.getQuantidade() + "\nSubcategoria pai: " + produto.getSubcategoria().getNome() + "\nNome da Categoria vô: " + vo.getNome() + "\n\n");

            }

        }
        while (true) {
            int idProdutoCompra = leitor.lerInt("Digite o id do produto que deseja adicionar ao carrinho. Digite '0' para desistir da compra. Digite um número maior que 1000 para finalizar a compra.");

            if (idProdutoCompra == 0) {
                System.out.println("Compra cancelada");
                carrinhodecompras.clear();
                precoProdutos = 0;
                break;
            } else if (idProdutoCompra > 1000) {
                System.out.println("\nCompra finalizada\n");
                break;
            }

            boolean produtoEncontrado = false;
            for (int i = 0; i < ControllerProduto.produtos.size(); i++) {
                Produto produto = ControllerProduto.produtos.get(i);
                if (produto.getProdutoId() == idProdutoCompra) {
                    System.out.println("Produto '" + produto.getNome() + "' adicionado com sucesso");
                    carrinhodecompras.add(produto.getNome());
                    System.out.println("Carrinho: " + carrinhodecompras);
                    precoProdutos = precoProdutos + produto.getPrecoVenda();
                    produtoEncontrado = true;
                    System.out.println("Preço do carrinho: R$" + precoProdutos);
                    break;
                }
            }

            if (!produtoEncontrado) { //essa sugestão, inclusive o "!" antes da variável foi uma sugestão do GPT quando disse que não estáva conseguindo colocar uma mensagem como "esse id nao existe"
                System.out.println("Não existe produto com esse ID\n");
            }
        }
        return precoTotal = precoProdutos;
    }


    public static void FinalizarCompra(){

        CarrinhoDeCompras();
        int novoPilhaCompra = pilhaCompra + 1;
        pilhaCompra = novoPilhaCompra;
        Compra novoCompra = new Compra(novoPilhaCompra, diaAtual, mesAtual, anoAtual, new ArrayList<>(carrinhodecompras), precoTotal); //Aqui tb foi auxilio, NUNCA saberia sozinho que daria pra "clonar" desse jeito um array. Aprendizado
        compras.add(novoCompra);
        System.out.println("Número da compra: " + novoCompra.getPilhaCompra() + "\nData da compra: " + novoCompra.getDia() + "/" + novoCompra.getMes() + "/" + novoCompra.getAno() + "\nCarrinho continha: " + novoCompra.getProdutoscomprados() + "\nPreço total foi R$" + novoCompra.getPreco());

        String voltar = leitor.lerString("\n\nAperte Enter para voltar!");


    }

    public static void ListagemCompras(){
        if (compras.size() > 0) {
            System.out.println("\nListagem dos compras:");
            for (int i = 0; i < compras.size(); i++) {
                System.out.println("\nNúmero da Compra: " + compras.get(i).getPilhaCompra()
                        + "\nData da Compra: " + compras.get(i).getDia() + "/" + compras.get(i).getMes() + "/" + compras.get(i).getAno()
                        + "\nCarrinho: " + compras.get(i).getProdutoscomprados()
                        + "\nPreço total foi R$" + compras.get(i).getPreco());
                totalComprado = totalComprado + compras.get(i).getPreco();
            }
            System.out.println("\nFim da listagem das compras\nTotal comprado na história: R$" + totalComprado);
            String voltar = leitor.lerString("\n\nAperte Enter para voltar!");

        }
        if (compras.size() == 0) {
            System.out.println("\nNão há compras cadastradas!");
            String voltar = leitor.lerString("\n\nAperte Enter para voltar!");
        }

    }



}
