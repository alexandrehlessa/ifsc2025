import java.util.ArrayList;

public class ControllerMercadoParceiro {
    static Leitor leitor = new Leitor();
    static int mercadoId = 0;
    static ArrayList<MercadoParceiro> mercados = new ArrayList<MercadoParceiro>();

    public static void MercadoParceiro() {
        while(true) {
            System.out.println("\n(1) Cadastrar um Mercado parceiro\n(2) Listagem dos mercados\n(0) Sair\n");
            int opcao = leitor.lerInt("Digite a opção: ");
            if (opcao == 1) {
                CadastrarMercadoParceiro();
            }
            if (opcao == 2) {
                ListagemMercadoParceiro();
            }
            if (opcao == 0) {
                break;
            }
        }
    }

    public static void CadastrarMercadoParceiro() {
        int novoMercadoId = mercadoId + 1;
        mercadoId = novoMercadoId;
        String novoRazaoSocial = leitor.lerString("\nDigite a razão social: ");
        String novoCnpj = leitor.lerString("\nDigite o CNPJ: ");
        String novoDominio = leitor.lerString("\nDigite o domínio: ");
        String novoCep = leitor.lerString("\nDigite o CEP: ");

        MercadoParceiro novoMercadoParceiro = new MercadoParceiro(novoMercadoId, novoRazaoSocial, novoCnpj, novoCep, novoDominio);
        mercados.add(novoMercadoParceiro);
        System.out.println("\nMercado cadastrado!\nID: " + novoMercadoParceiro.getMercadoParceiroId() + "\nRazão Social: " + novoMercadoParceiro.getMercadoParceiroRazaoSocial()
                + "\nCNPJ" + novoMercadoParceiro.getMercadoParceiroCnpj() + "\nCEP: " + novoMercadoParceiro.getMercadoParceiroCEP() + "\nDomníio: " + novoMercadoParceiro.getMercadoParceiroDominio() + "\n");
    }

    public static void ListagemMercadoParceiro() {
        System.out.println("\nListagem dos mercados parceiros cadastrados:");
        if (mercados.size() > 0) {
            for (int i = 0; i < mercados.size(); i++) {
                MercadoParceiro mercadoParceiro = mercados.get(i);
                System.out.println("\nMercado cadastrado!\nID: " + mercadoParceiro.getMercadoParceiroId() + "\nRazão Social: " + mercadoParceiro.getMercadoParceiroRazaoSocial()
                        + "\nCNPJ" + mercadoParceiro.getMercadoParceiroCnpj() + "\nCEP: " + mercadoParceiro.getMercadoParceiroCEP() + "\nDomníio: " + mercadoParceiro.getMercadoParceiroDominio() + "\n");
            }
            System.out.println("\nFim da Listagem dos cmercados parceiros cadastrados!\n");
        }

        if (mercados.size() == 0) {
            System.out.println("\nNenhum mercado parceiro cadastrado!");
        }
    }
}
