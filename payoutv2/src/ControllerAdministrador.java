import java.util.ArrayList;

public class ControllerAdministrador {


    public static int id = 0;
    static ArrayList<Administrador> administradores = new ArrayList<Administrador>();


    public static void LoginAdministrador(Leitor leitor) {
        Main.limparConsole();
        while(true) {
            System.out.println("Logue como Administrador. Digite login e senha no estilo LOGINSENHA ou digite 'voltar' para voltar ao menu. ");
            String login = leitor.lerString("loginsenha ");
            if (login.equals("voltar")) {
                Main.main(new String[0]);
            }
            for (int i = 0; i < administradores.size(); i++) {
                Administrador admin = administradores.get(i);
                String loginCadastrado =  admin.getEmailEmpresa() + admin.getSenha();
                if(login.equals(loginCadastrado)){
                    System.out.println("Acessou como administrador!");
                    MenuAdministrador(leitor);
                    break;
                }
            }
            System.out.println("Senha ou email incorretos, tente novamente!");
            LoginAdministrador(leitor);

        }
    }

    public static void MenuAdministrador(Leitor leitor) {
        Main.limparConsole();
        while(true) {
            System.out.println("\nVocê está logado como Administrador. O que deseja fazer?");
            System.out.println("(1) Cadastrar uma categoria");
            System.out.println("(2) Cadastrar uma subcategoria");
            System.out.println("(3) Cadastrar um produto");
            System.out.println("(4) Listar as categorias");
            System.out.println("(5) Listar as subcategorias");
            System.out.println("(6) Listar os produtos");
            System.out.println("(0) Sair");

            int opcao = leitor.lerInt("opcao: ");
            if (opcao == 0) {
                break;
            }
            if (opcao == 1) {
                ControllerCategoria.CadastrarCategoria(leitor);
            }
            if (opcao == 2) {
                ControllerSubcategoria.CadastrarSubcategorias(leitor);
            }
            if (opcao == 3) {
                ControllerProduto.CadastrarProduto(leitor);
            }
            if (opcao == 4) {
                ControllerCategoria.ListagemCategorias(leitor);
            }
            if (opcao == 5) {
                ControllerSubcategoria.ListagemSubCategorias(leitor);
            }
            if (opcao == 6) {
                ControllerProduto.ListagemProdutos(leitor);
            }
        }
    }

    public static void CadastrarAdministrador(Administrador master, Leitor leitor) {
        Main.limparConsole();
        if (master.getAdministradorId() != (0)) {
            System.out.println("Apenas o mestre pode cadastrar adminsitradores.");
        }else{
            int idNovo = id + 1;
            id = id + 1;
            String nomeNovo = leitor.lerString("Digite o novo nome do administrador: ");
            String emailNovo = EscolherEmail(leitor);
            String senhaNovo = leitor.lerString("Digite a nova senha do administrador: ");
            System.out.println("Novo administrador criado com sucesso!" + "\nid novo:" + idNovo + "\nNome: " + nomeNovo + "\nEmail: " + emailNovo + "\nSenha: " + senhaNovo);
            Administrador novoAdministrador = new Administrador(idNovo, nomeNovo, emailNovo, senhaNovo);
            administradores.add(novoAdministrador);
            ListagemAdministradores();


        }
    }

    public static String EscolherEmail(Leitor leitor){
        String emailNovo = leitor.lerString("Digite o novo email do administrador: ");
        for (int i = 0; i < administradores.size(); i++) {
            Administrador admin = administradores.get(i);
            String emailCadastrado = admin.getEmailEmpresa();
            if (emailCadastrado.equals(emailNovo)) {
                System.out.println("Email já cadastrado, escolha outro email. ");
                return EscolherEmail(leitor);
            }
        }
        return emailNovo;
    }

    public static void ListagemAdministradores(){
        Main.limparConsole();
        System.out.println("\nListagem dos administradores cadastrados:\n");
        for (int i = 0; i < administradores.size(); i++) {
            Administrador admin = administradores.get(i);
            System.out.println("ID: " + admin.getAdministradorId() + ", Nome: " + admin.getPrimeiroNome() + ", Email: " + admin.getEmailEmpresa());
        }
        if (administradores.size() == 0) {
            System.out.println("\nNenhum administrador cadastrado!");
        }
    }

}




