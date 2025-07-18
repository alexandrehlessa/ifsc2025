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

public class BuscaProduto {

    public static void buscarCarne() {
        System.out.println("BUSCAR CARNE");
        List<Carne> carnes = CarneDAO.getInstancia().buscarTodos();

        if (carnes.isEmpty()) {
            System.out.println("Nenhuma carne cadastrada.");
            return;
        }

        System.out.println("Carnes disponíveis:");
        for (Carne c : carnes) {
            System.out.println("- " + c.getNome());
        }

        String nomeEscolhido = leitor.lerString("Digite o nome da carne que deseja ver: ");
        Carne c = CarneDAO.getInstancia().buscar(nomeEscolhido);
        if (c != null) {
            System.out.printf("Nome: %s | Descrição: %s | Preço/kg: %.2f%n",
                    c.getNome(), c.getDescricao(), c.getPrecoKilo());
        } else {
            System.out.println("Nenhuma carne encontrada com o nome: " + nomeEscolhido);
        }
    }

    public static void buscarHigiene() {
        System.out.println("BUSCAR  HIGIENE");
        List<Higiene> itens = HigieneDAO.getInstancia().buscarTodos();
        if (itens.isEmpty()) {
            System.out.println("Nenhum produto de higiene cadastrado.");
            return;
        }

        System.out.println("Produtos de higiene disponíveis:");
        for (Higiene h : itens) {
            System.out.println("- " + h.getNome());
        }

        String nome = leitor.lerString("Digite o nome do produto que deseja ver: ");
        Higiene h = HigieneDAO.getInstancia().buscar(nome);
        if (h != null) {
            System.out.printf("Nome: %s | Descrição: %s | Preço: %.2f%n",
                    h.getNome(), h.getDescricao(), h.getPreco());
        } else {
            System.out.println("Nenhum produto de higiene encontrado com o nome: " + nome);
        }
    }

    public static void buscarPadaria() {
        System.out.println("BUSCAR  PADARIA");
        List<Padaria> itens = PadariaDAO.getInstancia().buscarTodos();
        if (itens.isEmpty()) {
            System.out.println("Nenhum item de padaria cadastrado.");
            return;
        }

        System.out.println("Itens de padaria disponíveis:");
        for (Padaria p : itens) {
            System.out.println("- " + p.getNome());
        }

        String nome = leitor.lerString("Digite o nome do item que deseja ver: ");
        Padaria p = PadariaDAO.getInstancia().buscar(nome);
        if (p != null) {
            System.out.printf("Nome: %s | Descrição: %s | Preço: %.2f | Glúten: %s%n",
                    p.getNome(), p.getDescricao(), p.getPreco(),
                    p.isPossuiGluten() ? "Sim" : "Não");
        } else {
            System.out.println("Nenhum item de padaria encontrado com o nome: " + nome);
        }
    }

    public static void buscarVerdura() {
        System.out.println("BUSCAR VERDURA");
        List<Verdura> itens = VerduraDAO.getInstancia().buscarTodos();
        if (itens.isEmpty()) {
            System.out.println("Nenhuma verdura cadastrada.");
            return;
        }

        System.out.println("Verduras disponíveis:");
        for (Verdura v : itens) {
            System.out.println("- " + v.getNome());
        }

        String nome = leitor.lerString("Digite o nome da verdura que deseja ver: ");
        Verdura v = VerduraDAO.getInstancia().buscar(nome);
        if (v != null) {
            System.out.printf("Nome: %s | Descrição: %s | Tipo: %s | Preço: %.2f%n",
                    v.getNome(), v.getDescricao(), v.getTipo(), v.getPreco());
        } else {
            System.out.println("Nenhuma verdura encontrada com o nome: " + nome);
        }
    }



}
