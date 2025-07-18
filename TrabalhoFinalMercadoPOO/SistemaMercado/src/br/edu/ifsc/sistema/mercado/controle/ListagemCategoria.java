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

public class ListagemCategoria {


    public static void listagemCarne() {
        System.out.println("LISTAGEM DE CARNES");
        List<Carne> carnes = CarneDAO.getInstancia().buscarTodos();
        if (carnes.isEmpty()) {
            System.out.println("Nenhuma carne cadastrada.");
            return;
        }
        for (Carne c : carnes) {
            System.out.printf("Nome: %s | Descrição: %s | Preço/kg: %.2f%n", //tinha esquecido do printf do java
                    c.getNome(), c.getDescricao(), c.getPrecoKilo());
        }
    }

    public static void listagemHigiene() {
        System.out.println("LISTAGEM DE HIGIENE");
        List<Higiene> itens = HigieneDAO.getInstancia().buscarTodos();
        if (itens.isEmpty()) {
            System.out.println("Nenhum produto de higiene cadastrado.");
            return;
        }
        for (Higiene h : itens) {
            System.out.printf("Nome: %s | Descrição: %s | Preço: %.2f%n",
                    h.getNome(), h.getDescricao(), h.getPreco());
        }
    }

    public static void listagemPadaria() {
        System.out.println("LISTAGEM DE PADARIA");
        List<Padaria> itens = PadariaDAO.getInstancia().buscarTodos();
        if (itens.isEmpty()) {
            System.out.println("Nenhum item de padaria cadastrado.");
            return;
        }
        for (Padaria p : itens) {
            System.out.printf("Nome: %s | Descrição: %s | Preço: %.2f | Glúten: %s%n",
                    p.getNome(), p.getDescricao(), p.getPreco(),
                    p.isPossuiGluten() ? "Sim" : "Não");
        }
    }

    public static void listagemVerdura() {
        System.out.println("LISTAGEM DE VERDURAS");
        List<Verdura> itens = VerduraDAO.getInstancia().buscarTodos();
        if (itens.isEmpty()) {
            System.out.println("Nenhuma verdura cadastrada.");
            return;
        }
        for (Verdura v : itens) {
            System.out.printf("Nome: %s | Descrição: %s | Tipo: %s | Preço: %.2f%n",
                    v.getNome(), v.getDescricao(), v.getTipo(), v.getPreco());
        }
    }



}
