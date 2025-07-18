package br.edu.ifsc.sistema.mercado.controle;

import br.edu.ifsc.sistema.mercado.modelo.Carne;
import br.edu.ifsc.sistema.mercado.modelo.Higiene;
import br.edu.ifsc.sistema.mercado.modelo.Padaria;
import br.edu.ifsc.sistema.mercado.modelo.Verdura;
import br.edu.ifsc.sistema.mercado.persistencia.CarneDAO;
import br.edu.ifsc.sistema.mercado.persistencia.HigieneDAO;
import br.edu.ifsc.sistema.mercado.persistencia.PadariaDAO;
import br.edu.ifsc.sistema.mercado.persistencia.VerduraDAO;

import java.util.List;

import static br.edu.ifsc.sistema.mercado.controle.CadastroProduto.leitor;

public class DelecaoProduto {

    public static void deletarCarne() {
        System.out.println("=== REMOVER CARNE ===");
        List<Carne> carnes = CarneDAO.getInstancia().buscarTodos();

        if (carnes.isEmpty()) {
            System.out.println("Nenhuma carne cadastrada.");
            return;
        }

        System.out.println("Carnes disponíveis:");
        for (Carne c : carnes) {
            System.out.println("- " + c.getNome());
        }

        String nomeEscolhido = leitor.lerString("Escolha o nome da carne a remover: ");
        Carne alvo = null;
        for (Carne c : carnes) {
            if (c.getNome().equals(nomeEscolhido)) {
                alvo = c;
                break;
            }
        }

        if (alvo == null) {
            System.out.println("Nome não encontrado. Operação cancelada.");
            return;
        }

        CarneDAO.getInstancia().deletar(alvo);
        System.out.println("Carne \"" + alvo.getNome() + "\" removida com sucesso.");
    }


    public static void deletarHigiene() {
        System.out.println("=== REMOVER HIGIENE ===");
        List<Higiene> lista = HigieneDAO.getInstancia().buscarTodos();

        if (lista.isEmpty()) {
            System.out.println("Nenhum produto de higiene cadastrado.");
            return;
        }

        System.out.println("Produtos de higiene disponíveis:");
        for (Higiene h : lista) {
            System.out.println("- " + h.getNome());
        }

        String nomeEscolhido = leitor.lerString("Escolha o nome do produto de higiene a remover: ");
        Higiene alvo = null;
        for (Higiene h : lista) {
            if (h.getNome().equals(nomeEscolhido)) {
                alvo = h;
                break;
            }
        }

        if (alvo == null) {
            System.out.println("Nome não encontrado. Operação cancelada.");
            return;
        }

        HigieneDAO.getInstancia().deletar(alvo);
        System.out.println("Produto de higiene \"" + alvo.getNome() + "\" removido com sucesso.");
    }


    public static void deletarPadaria() {
        System.out.println("=== REMOVER PADARIA ===");
        List<Padaria> lista = PadariaDAO.getInstancia().buscarTodos();

        if (lista.isEmpty()) {
            System.out.println("Nenhum item de padaria cadastrado.");
            return;
        }

        System.out.println("Itens de padaria disponíveis:");
        for (Padaria p : lista) {
            System.out.println("- " + p.getNome());
        }

        String nomeEscolhido = leitor.lerString("Escolha o nome do item da padaria a remover: ");
        Padaria alvo = null;
        for (Padaria p : lista) {
            if (p.getNome().equals(nomeEscolhido)) {
                alvo = p;
                break;
            }
        }

        if (alvo == null) {
            System.out.println("Nome não encontrado. Operação cancelada.");
            return;
        }

        PadariaDAO.getInstancia().deletar(alvo);
        System.out.println("Item de padaria \"" + alvo.getNome() + "\" removido com sucesso.");
    }


    public static void deletarVerdura() {
        System.out.println("=== REMOVER VERDURA ===");
        List<Verdura> lista = VerduraDAO.getInstancia().buscarTodos();

        if (lista.isEmpty()) {
            System.out.println("Nenhuma verdura cadastrada.");
            return;
        }

        System.out.println("Verduras disponíveis:");
        for (Verdura v : lista) {
            System.out.println("- " + v.getNome());
        }

        String nomeEscolhido = leitor.lerString("Escolha o nome da verdura a remover: ");
        Verdura alvo = null;
        for (Verdura v : lista) {
            if (v.getNome().equals(nomeEscolhido)) {
                alvo = v;
                break;
            }
        }

        if (alvo == null) {
            System.out.println("Nome não encontrado. Operação cancelada.");
            return;
        }

        VerduraDAO.getInstancia().deletar(alvo);
        System.out.println("Verdura \"" + alvo.getNome() + "\" removida com sucesso.");
    }

}
