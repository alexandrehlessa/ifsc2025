import java.util.ArrayList;

public class ControllerMaster {


    Leitor leitor = new Leitor();


    public static void LoginMaster(Leitor leitor, Administrador master){
        Main.limparConsole();
        System.out.println("Logue como Master. Digite login e senha no estilo LOGINSENHA");
        String login = leitor.lerString("loginsenha ");
        while (!login.equals(master.getEmailEmpresa() + master.getSenha())) {
            login = leitor.lerString("Login ou senha incorreta. Tente novamente ou digite 'voltar': ");
            if (login.equals("voltar")) {
                Main.main(new String[0]);
            }
        }
    }

    public static void MenuMaster(Leitor leitor, Administrador master){
        while(true) {
            System.out.println("\nVocê está logado como Master. O que deseja fazer?");
            System.out.println("(1) Cadastrar um administrador");
            System.out.println("(2) Cadastrar uma categoria");
            System.out.println("(3) Cadastrar uma subcategoria");
            System.out.println("(4) Cadastrar um produto");
            System.out.println("(5) Remover um administrador");
            System.out.println("(6) Remover uma categoria, subcategooria ou produto");
            System.out.println("(7) Cadastro/Visualização do mercado");
            System.out.println("(8) Ver lista de compras");
            System.out.println("(9) Ver lista de administradores");
            System.out.println("(10) Ver lista de categorias");
            System.out.println("(11) Ver lista de subcategorias");
            System.out.println("(12) Ver lista de produtos");
            System.out.println("(0) Sair");
            int opcao = leitor.lerInt("Digite a opção desejada");
            if (opcao == 0) {
                break;
            }
            if (opcao == 1) {
                ControllerAdministrador.CadastrarAdministrador(master, leitor);
            }
            if (opcao == 2) {
                ControllerCategoria.CadastrarCategoria(leitor);
            }
            if (opcao == 3) {
                ControllerSubcategoria.CadastrarSubcategorias(leitor);
            }
            if (opcao == 4) {
                ControllerProduto.CadastrarProduto(leitor);
            }
            if (opcao == 5) {
                System.out.println("\nEm desenvolvimento...(Delete)");
            }
            if ((opcao == 6)) {
                System.out.println("\nEm desenvolvimento...(Delete)");
            }
            if (opcao == 7) {
                ControllerMercadoParceiro.MercadoParceiro();
            }
            if (opcao == 8){
                ControllerCompra.ListagemCompras();
            }
            if (opcao == 9) {
                ControllerAdministrador.ListagemAdministradores();
            }
            if (opcao == 10) {
                ControllerCategoria.ListagemCategorias(leitor);
            }
            if (opcao == 11) {
                ControllerSubcategoria.ListagemSubCategorias(leitor);
            }
            if (opcao == 12) {
                ControllerProduto.ListagemProdutos(leitor);
            }
        }
    }

}
