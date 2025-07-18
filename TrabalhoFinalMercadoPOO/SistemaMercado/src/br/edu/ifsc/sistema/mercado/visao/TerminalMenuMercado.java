package br.edu.ifsc.sistema.mercado.visao;


import br.edu.ifsc.sistema.mercado.controle.*;

public class TerminalMenuMercado {

    public static void main(String[] args) {
        TerminalMenuMercado terminal = new TerminalMenuMercado();
        terminal.mainMenuMercado();
    }

    Leitor leitor = new Leitor();

    public String mainMenuMercado() {
        while (true) {
            System.out.println("Decida o que fazer:\n" +
                    "C - Cadastrar um produto\n" +
                    "E - Editar um produto\n" +
                    "R - Remover um produto\n" +
                    "B - Buscar dados de um produto\n" +
                    "L - Listagem produtos de uma categoria\n" +
                    "0 - Sair");
        String opcao = leitor.lerString("Escolha uma opção\n->");

            if (opcao.equals("0")){
                System.out.println("Adeus");
            System.exit(0);
            }else if (
                    opcao.equals("C") ||
                            opcao.equals("E") ||
                            opcao.equals("R") ||
                            opcao.equals("B") ||
                            opcao.equals("L")
            ) {

                categoryMercado(opcao);
                return opcao;
            }else {
                System.out.println("\nDigite uma opção válida\n");
                mainMenuMercado();
            }
      }
    }


    public String categoryMercado(String opcaoMainMenu) {
        System.out.println("Escolha uma categoria:\n" +
                "C - Carne\n" +
                "H - Higiene\n" +
                "P - Padaria\n" +
                "V - Verdura\n" +
                "0 - Sair");
        String linha = leitor.lerString("Escolha uma opção\n->");
        if (linha.isEmpty()) return categoryMercado(opcaoMainMenu);
        char opcao = Character.toUpperCase(linha.charAt(0));

        switch (opcao) {
            case '0':
                return mainMenuMercado();

            case 'C':
                BuscaProduto ListagemProduto;
                if (opcaoMainMenu.equals("C")) {
                    CadastroProduto.cadastrarCarne();
                } else if (opcaoMainMenu.equals("E")) {
                    EdicaoProduto.atualizarCarne();
                } else if (opcaoMainMenu.equals("L")) {
                    ListagemCategoria.listagemCarne();
                } else if (opcaoMainMenu.equals("B")) {
                    BuscaProduto.buscarCarne();
                }else if (opcaoMainMenu.equals("R")) {
                    DelecaoProduto.deletarCarne();
                }
                break;

            case 'H':
                if (opcaoMainMenu.equals("C")) {
                    CadastroProduto.cadastrarHigiene();
                } else if (opcaoMainMenu.equals("E")) {
                    EdicaoProduto.atualizarHigiene();
                } else if (opcaoMainMenu.equals("L")) {
                    ListagemCategoria.listagemHigiene();
                }else if (opcaoMainMenu.equals("B")) {
                    BuscaProduto.buscarHigiene();
                }else if (opcaoMainMenu.equals("R")) {
                    DelecaoProduto.deletarHigiene();
                }
                break;

            case 'P':
                if (opcaoMainMenu.equals("C")) {
                    CadastroProduto.cadastrarPadaria();
                } else if (opcaoMainMenu.equals("E")) {
                    EdicaoProduto.atualizarPadaria();
                } else if (opcaoMainMenu.equals("L")) {
                    ListagemCategoria.listagemPadaria();
                }else if (opcaoMainMenu.equals("B")) {
                    BuscaProduto.buscarPadaria();
                }else if (opcaoMainMenu.equals("R")) {
                    DelecaoProduto.deletarPadaria();
                }
                break;

            case 'V':
                if (opcaoMainMenu.equals("C")) {
                    CadastroProduto.cadastrarVerdura();
                } else if (opcaoMainMenu.equals("E")) {
                    EdicaoProduto.atualizarVerdura();
                } else if (opcaoMainMenu.equals("L")) {
                    ListagemCategoria.listagemVerdura();
                }else if (opcaoMainMenu.equals("B")) {
                    BuscaProduto.buscarVerdura();
                }else if (opcaoMainMenu.equals("R")) {
                    DelecaoProduto.deletarVerdura();
                }
                break;

            default:
                System.out.println("\nDigite uma opção válida\n");
                return categoryMercado(opcaoMainMenu);
        }

        return mainMenuMercado();
    }





}
