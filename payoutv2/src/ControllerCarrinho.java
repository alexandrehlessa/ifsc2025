import java.util.ArrayList;
import java.util.Scanner;

public class ControllerCarrinho {
    static ArrayList<Carrinho> carrinhos = new ArrayList<Carrinho>();
    static Leitor leitor = new Leitor();
    static String funcionando = "";
    static int numeroSerie = 0;
    static int diaVistoria = 0;
    static int mesVistoria = 0;
    static int anoVistoria = 0;
    static int diaAtual = ControllerData.Data()[0];
    static int mesAtual = ControllerData.Data()[1];
    static int anoAtual = ControllerData.Data()[2];
    static boolean funcionado = false;
    static boolean carrinhoEncontrado = false;

    public static void Carrinho() {
        ListagemCarrinho();
        while(true) {

            System.out.println("\n(1) Cadastrar um carrinho\n(2) Atualizar vistoria de um carrinho\n(0) Sair\n");
            int opcao = leitor.lerInt("Digite a opção: ");
            if (opcao == 0) {
            return;
            }
            if (opcao == 1) {
                CadastrarCarrinho();
            }
            if (opcao == 2) {
                System.out.println("\nEm desenvolvimento (Update)");;
            }
        }
    }

    public static void ListagemCarrinho() {
        System.out.println("\nListagem dos carrinhos cadastradas:");
        if (carrinhos.size() > 0) {
            for (int i = 0; i < carrinhos.size(); i++) {
                Carrinho carrinho = carrinhos.get(i);
                if(carrinho.isFuncionando() == false){
                    funcionando = "Não";
                }else{
                    funcionando = "Sim";
                }
                System.out.println("\nNúmero de série: " + carrinho.getNumeroSerie() + "\nFuncionando: " + funcionando + "\nData da última vistoria: " + carrinho.getDiaUltimaVistoria() + "/" + carrinho.getMesUltimaVistoria() + "/" + carrinho.getAnoUltimaVistoria());

            }
            System.out.println("\nFim da Listagem dos carrinhos cadastradas");
        }

        if (carrinhos.size() == 0) {
            System.out.println("\nNenhum carrinho cadastrado!");
        }
    }

    public static void CadastrarCarrinho() {
        int novoNumeroSerie = numeroSerie + 1;
        numeroSerie ++;
        int diaVistoria = leitor.lerInt("\nDigite o dia da última vistoria: ");
        int mesVistoria = leitor.lerInt("Digite o mes da última vistoria: ");
        int anoVistoria = leitor.lerInt("Digite o ano da última vistoria: ");
        while(true) {
            String estaFuncionando = leitor.lerString("Está funcionando? s/n");
            if (estaFuncionando.equals("n")) {
                funcionado = false;
                break;
            }
            if (estaFuncionando.equals("s")) {
                funcionado = true;
                break;
            }
        }
        Carrinho novoCarrinho = new Carrinho(novoNumeroSerie, diaVistoria, mesVistoria, anoVistoria, funcionado);
        System.out.println("\nCarrinho cadastrado com sucesso!\nNúmero de série: " + novoNumeroSerie + "\nÚltima data de vistoria: " + diaVistoria + "/" + mesVistoria + "/" + anoVistoria);
        if (funcionado == false) {
            System.out.println("\nNecessita manutenção!");
        }
        if (funcionado == true) {
            System.out.println("\nPronto para funcionar!");
        }
        carrinhos.add(novoCarrinho);
    }

}
