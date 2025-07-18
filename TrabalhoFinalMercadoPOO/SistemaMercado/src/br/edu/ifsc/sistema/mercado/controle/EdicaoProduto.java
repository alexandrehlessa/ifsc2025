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

public class EdicaoProduto {

    public static void atualizarCarne() {
        System.out.println("=== ATUALIZAR CARNE ===");
        List<Carne> carnes = CarneDAO.getInstancia().buscarTodos();

        System.out.println("Carne(s) disponível(is):");
        for (Carne c : carnes) {
            System.out.println("- " + c.getNome());
        }

        String nomeAntigo = leitor.lerString("Escolha o nome da carne a atualizar: ");
        boolean existe = false;
        for (Carne c : carnes) {
            if (c.getNome().equals(nomeAntigo)) {
                existe = true;
                break;
            }
        }
        if (!existe) {
            System.out.println("Nome não encontrado. Operação cancelada.");
            return;
        }

        String novoNome = leitor.lerString("Novo nome: ");
        String novaDescricao = leitor.lerString("Nova descrição: ");
        float novoPreco = leitor.lerFloat("Novo preço do quilo: ");
        Carne nova = new Carne(novoNome, novaDescricao, novoPreco);
        CarneDAO.getInstancia().atualizar(nova, nomeAntigo);
        System.out.println("Carne atualizada com sucesso!");
    }

    public static void atualizarHigiene() {
        System.out.println("=== ATUALIZAR HIGIENE ===");
        List<Higiene> lista = HigieneDAO.getInstancia().buscarTodos();

        System.out.println("Higiene disponível:");
        for (Higiene h : lista) {
            System.out.println("- " + h.getNome());
        }

        String nomeAntigo = leitor.lerString("Escolha o nome do produto de higiene a atualizar: ");
        boolean existe = false;
        for (Higiene h : lista) {
            if (h.getNome().equals(nomeAntigo)) {
                existe = true;
                break;
            }
        }
        if (!existe) {
            System.out.println("Nome não encontrado. Operação cancelada.");
            return;
        }

        String novoNome = leitor.lerString("Novo nome: ");
        String novaDesc = leitor.lerString("Nova descrição: ");
        float novoPreco = leitor.lerFloat("Novo preço: ");
        Higiene h = new Higiene(novoNome, novaDesc, novoPreco);
        HigieneDAO.getInstancia().atualizar(h, nomeAntigo);
        System.out.println("Higiene atualizada com sucesso!");
    }

    public static void atualizarPadaria() {
        System.out.println("=== ATUALIZAR PADARIA ===");
        List<Padaria> lista = PadariaDAO.getInstancia().buscarTodos();

        System.out.println("Padarias disponíveis:");
        for (Padaria p : lista) {
            System.out.println("- " + p.getNome());
        }

        String nomeAntigo = leitor.lerString("Escolha o nome do produto da padaria a atualizar: ");
        boolean existe = false;
        for (Padaria p : lista) {
            if (p.getNome().equals(nomeAntigo)) {
                existe = true;
                break;
            }
        }
        if (!existe) {
            System.out.println("Nome não encontrado. Operação cancelada.");
            return;
        }

        String novoNome = leitor.lerString("Novo nome: ");
        String novaDesc = leitor.lerString("Nova descrição: ");
        float novoPreco = leitor.lerFloat("Novo preço: ");
        boolean gluten = leitor.lerBoolean("Possui glúten? (true/false): ");
        Padaria p = new Padaria(novoNome, novaDesc, novoPreco, gluten);
        PadariaDAO.getInstancia().atualizar(p, nomeAntigo);
        System.out.println("Padaria atualizada com sucesso!");
    }

    public static void atualizarVerdura() {
        System.out.println("=== ATUALIZAR VERDURA ===");
        List<Verdura> lista = VerduraDAO.getInstancia().buscarTodos();

        System.out.println("Verduras disponíveis:");
        for (Verdura v : lista) {
            System.out.println("- " + v.getNome());
        }

        String nomeAntigo = leitor.lerString("Escolha o nome da verdura a atualizar: ");
        boolean existe = false;
        for (Verdura v : lista) {
            if (v.getNome().equals(nomeAntigo)) {
                existe = true;
                break;
            }
        }
        if (!existe) {
            System.out.println("Nome não encontrado. Operação cancelada.");
            return;
        }

        String novoNome = leitor.lerString("Novo nome: ");
        String novaDesc = leitor.lerString("Nova descrição: ");
        String novoTipo = leitor.lerString("Novo tipo: ");
        float novoPreco = leitor.lerFloat("Novo preço: ");
        Verdura v = new Verdura(novoNome, novaDesc, novoTipo, novoPreco);
        VerduraDAO.getInstancia().atualizar(v, nomeAntigo);
        System.out.println("Verdura atualizada com sucesso!");
    }


}
