import java.util.ArrayList;

public class ControllerSubcategoria {

    static ArrayList<Subcategoria> subcategorias = new ArrayList<Subcategoria>();
    private static int subCategoriaId = 0;


    public static void CadastrarSubcategorias(Leitor leitor) {
        Main.limparConsole();
        if (ControllerCategoria.categorias.size() == 0) {
            String voltar = leitor.lerString("Nenhuma categoria cadastrada, é necessário alguma categoria para criar uma subcategoria. \nAperte Enter para voltar ao menu do administrador");
            return;
        }

        int novoSubCategoriaId = subCategoriaId + 1;
        subCategoriaId ++;

        String novoNomeSubCategoria = leitor.lerString("Nome da nova subcategoria");
        ControllerCategoria.ListagemCategorias(leitor);
        while (true) {
            int idCategoria = leitor.lerInt("Selecione pelo ID a subcategoria desejada. '0' para voltar ao menu do administrador.");
            if (idCategoria == (0)) {
                return;
            }
            for (int i = 0; i < ControllerCategoria.categorias.size(); i++) {
                Categoria novoCategoria = ControllerCategoria.categorias.get(i);
                if(idCategoria == (novoCategoria.getCategoriaId())){
                    Subcategoria novoSubCategoria = new Subcategoria(novoSubCategoriaId, novoNomeSubCategoria, novoCategoria);
                    subcategorias.add(novoSubCategoria);
                    Main.limparConsole();
                    System.out.println("Subcategoria cadastrada com sucesso!" + "\nID: " + novoSubCategoria.getSubcategoriaId() + "\nNome: " + novoSubCategoria.getNome() + "\nNome da categoria pai: " + novoCategoria.getNome() );;
                    String voltar = leitor.lerString("\n\nAperte Enter para voltar ao menu do administrador");
                    return;

                };
            }
        }
    }

    public static void ListagemSubCategorias(Leitor leitor) {
        System.out.println("\nListagem das subcategorias cadastradas:");
        if (subcategorias.size() > 0) {
            for (int i = 0; i < subcategorias.size(); i++) {
                Subcategoria subcategoria = subcategorias.get(i);
                System.out.println("\nID: " + subcategoria.getSubcategoriaId() + "\nNome: " + subcategoria.getNome() + "\nNome da categoria pai: " + subcategoria.getCategoria().getNome());

            }
            System.out.println("\nFim da Listagem de subcategorias");
        }

        if (subcategorias.size() == 0) {
            System.out.println("\nNenhuma subcategoria cadastrada!");
            String voltar = leitor.lerString("\n\nAperte Enter para voltar ao menu do administrador");
        }
    }

}
