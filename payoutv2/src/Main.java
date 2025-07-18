
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Leitor leitor = new Leitor();
        Administrador master = new Administrador(0, "MASTER", "@", "senha");

        Populacao.Popular();


        System.out.println(master.getPrimeiroNome() + master.getPrimeiroNome());

        while (true) {
            limparConsole();
            System.out.println("------------------");
            System.out.println("(1) Entrar como master");
            System.out.println("(2) Entrar como administrador");
            System.out.println("(3) Entrar como usuário Android");
            System.out.println("(4) Listagem/Cadastro de carrinhos");
            System.out.println("(5) Pesquisar produtos");
            System.out.println("(0) Sair");
            System.out.println("------------------");

            int opcao = leitor.lerInt("Digite a opção desejada");
            if (opcao == 0) {
                System.out.println("\nObrigado por utilizar o programa!");
                System.exit(0);
            }
            if (opcao == 1) {
                ControllerMaster.LoginMaster(leitor, master);
                ControllerMaster.MenuMaster(leitor, master);
            }
            if (opcao == 2) {
                ControllerAdministrador.LoginAdministrador(leitor);
            }
            if (opcao == 3) {
                ControllerCompra.FinalizarCompra();
            }
            if (opcao == 4) {
                ControllerCarrinho.Carrinho();
            }
            if (opcao == 5) {
                ControllerPesquisa.Pesquisar();
            }
        }


    }



    public static void limparConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }


}


