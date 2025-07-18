package br.edu.ifsc.sistema.mercado.controle;

import br.edu.ifsc.sistema.mercado.modelo.Carne;
import br.edu.ifsc.sistema.mercado.modelo.Higiene;
import br.edu.ifsc.sistema.mercado.modelo.Padaria;
import br.edu.ifsc.sistema.mercado.modelo.Verdura;
import br.edu.ifsc.sistema.mercado.persistencia.*;
import br.edu.ifsc.sistema.mercado.visao.Leitor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastroProduto {

    static Leitor leitor = new Leitor();
    public static void cadastrarCarne(){
        System.out.println("CADASTRO DA CARNE");
        String nomeCarne = leitor.lerString("Digite o nome da carne: ");
        String descricaoCarne = leitor.lerString("Digite o descricao da carne: ");
        float precoKiloCarne = leitor.lerFloat("Digite o preço do kilo da carne:");
        Carne carne  = new Carne(nomeCarne, descricaoCarne, precoKiloCarne);
        CarneDAO carneDAO = CarneDAO.getInstancia();
        carneDAO.criar(carne);
        System.out.println("Carne cadastrada com sucesso!");
    }

    public static void cadastrarHigiene() {
        System.out.println("CADASTRO DE HIGIENE");
        String nome = leitor.lerString("Digite o nome do produto de higiene: ");
        String descricao = leitor.lerString("Digite a descrição do produto: ");
        float preco = leitor.lerFloat("Digite o preço do produto:");

        Higiene higiene = new Higiene(nome, descricao, preco);
        HigieneDAO hygieneDAO = HigieneDAO.getInstancia();
        hygieneDAO.criar(higiene);


        System.out.println("Higiene cadastrada com sucesso!");
    }

    public static void cadastrarPadaria() {
        System.out.println("CADASTRO DE PADARIA");
        String nome = leitor.lerString("Digite o nome do produto da padaria: ");
        String descricao = leitor.lerString("Digite a descrição do produto: ");
        float preco = leitor.lerFloat("Digite o preço do produto:");
        boolean possuiGluten = leitor.lerBoolean("Possui glúten? (true/false): ");

        Padaria padaria = new Padaria(nome, descricao, preco, possuiGluten);
        PadariaDAO padariaDAO = PadariaDAO.getInstancia();
        padariaDAO.criar(padaria);


        System.out.println("Padaria cadastrada com sucesso!");
    }

    public static void cadastrarVerdura() {
        System.out.println("CADASTRO DE VERDURA");
        String nome = leitor.lerString("Digite o nome da verdura: ");
        String descricao = leitor.lerString("Digite a descrição da verdura: ");
        String tipo = leitor.lerString("Digite o tipo de verdura: ");
        Float preco = leitor.lerFloat("Digite o preço da verdura: ");

        Verdura verdura = new Verdura(nome, descricao, tipo, preco);
        VerduraDAO verduraDAO = VerduraDAO.getInstancia();
        verduraDAO.criar(verdura);


        System.out.println("Verdura cadastrada com sucesso!");
    }
}



