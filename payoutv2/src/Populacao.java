public class Populacao {


    public static void Popular() {
        //EXEMPLOS DE ADMINISTRADORES
        Administrador ex101adm;
        Administrador ex102adm;
        Administrador ex103adm;
        Administrador ex104adm;
        Administrador ex105adm;
        Administrador ex106adm;
        Administrador ex107adm;
        Administrador ex108adm;
        Administrador ex109adm;
        Administrador ex110adm;
        {
            ex101adm = new Administrador(101, "ale", "ale", "ale"); //ESSA LINHA
            ControllerAdministrador.administradores.add(ex101adm); //ESSA LINHA

            ex102adm = new Administrador(102, "Mariana Lima", "mariana@empresa.com", "senha456"); //ESSA LINHA
            ControllerAdministrador.administradores.add(ex102adm); //ESSA LINHA

            ex103adm = new Administrador(103, "João Pereira", "joao@empresa.com", "senha789"); //ESSA LINHA
            ControllerAdministrador.administradores.add(ex103adm); //ESSA LINHA

            ex104adm = new Administrador(104, "Ana Oliveira", "ana@empresa.com", "senha321"); //ESSA LINHA
            ControllerAdministrador.administradores.add(ex104adm); //ESSA LINHA

            ex105adm = new Administrador(105, "Felipe Costa", "felipe@empresa.com", "senha654"); //ESSA LINHA
            ControllerAdministrador.administradores.add(ex105adm); //ESSA LINHA

            ex106adm = new Administrador(106, "Juliana Silva", "juliana@empresa.com", "senha987"); //ESSA LINHA
            ControllerAdministrador.administradores.add(ex106adm); //ESSA LINHA

            ex107adm = new Administrador(107, "Ricardo Gomes", "ricardo@empresa.com", "senha111"); //ESSA LINHA
            ControllerAdministrador.administradores.add(ex107adm); //ESSA LINHA

            ex108adm = new Administrador(108, "Patrícia Mendes", "patricia@empresa.com", "senha222"); //ESSA LINHA
            ControllerAdministrador.administradores.add(ex108adm); //ESSA LINHA

            ex109adm = new Administrador(109, "Thiago Fernandes", "thiago@empresa.com", "senha333"); //ESSA LINHA
            ControllerAdministrador.administradores.add(ex109adm); //ESSA LINHA

            ex110adm = new Administrador(110, "Camila Rocha", "camila@empresa.com", "senha444"); //ESSA LINHA
            ControllerAdministrador.administradores.add(ex110adm); //ESSA LINHA
        }

        //EXEMPLOS DE CATEGORIAS
        Categoria ex1cat;
        Categoria ex2cat;
        Categoria ex3cat;
        {
            ex1cat = new Categoria(101, "Hortifruti", "Frutas, legumes e verduras");
            ControllerCategoria.categorias.add(ex1cat); //ESSA LINHA

            ex2cat = new Categoria(102, "Padaria", "Pães, bolos e doces");
            ControllerCategoria.categorias.add(ex2cat); //ESSA LINHA

            ex3cat = new Categoria(103, "Limpeza", "Produtos de higiene e limpeza"); //ESSA LINHA
            ControllerCategoria.categorias.add(ex3cat); //ESSA LINHA
        }


        //EXEMPLOS DE SUBCATEGORIAS
        Subcategoria ex1subcat;
        Subcategoria ex2subcat;
        Subcategoria ex3subcat;
        Subcategoria ex4subcat;
        Subcategoria ex5subcat;
        Subcategoria ex6subcat;
        {
            ex1subcat = new Subcategoria(201, "Frutas tropicais", ex1cat); //ESSA LINHA
            ControllerSubcategoria.subcategorias.add(ex1subcat); //ESSA LINHA

            ex2subcat = new Subcategoria(202, "Verduras folhosas", ex1cat); //ESSA LINHA
            ControllerSubcategoria.subcategorias.add(ex2subcat); //ESSA LINHA

            ex3subcat = new Subcategoria(203, "Pães doces", ex2cat); //ESSA LINHA
            ControllerSubcategoria.subcategorias.add(ex3subcat); //ESSA LINHA

            ex4subcat = new Subcategoria(204, "Salgados assados", ex2cat); //ESSA LINHA
            ControllerSubcategoria.subcategorias.add(ex4subcat); //ESSA LINHA

            ex5subcat = new Subcategoria(205, "Desinfetantes", ex3cat); //ESSA LINHA
            ControllerSubcategoria.subcategorias.add(ex5subcat); //ESSA LINHA

            ex6subcat = new Subcategoria(206, "Sabões e detergentes", ex3cat); //ESSA LINHA
            ControllerSubcategoria.subcategorias.add(ex6subcat); //ESSA LINHA
        }

        //EXEMPLOS DE PRODUTOS
        Produto ex1pro;
        Produto ex2pro;
        Produto ex3pro;
        Produto ex4pro;
        Produto ex5pro;
        Produto ex6pro;
        Produto ex7pro;
        Produto ex8pro;
        Produto ex9pro;
        Produto ex10pro;
        Produto ex11pro;
        Produto ex12pro;

        {
            ex1pro = new Produto(301, "Banana", "TropFruit", 4.50f, "111001", 100, ex1subcat); //ESSA LINHA
            ControllerProduto.produtos.add(ex1pro); //ESSA LINHA

            ex2pro = new Produto(302, "Manga", "DoceSol", 5.20f, "111002", 80, ex1subcat); //ESSA LINHA
            ControllerProduto.produtos.add(ex2pro); //ESSA LINHA

            ex3pro = new Produto(303, "Alface", "VerdeVida", 2.30f, "112001", 60, ex2subcat); //ESSA LINHA
            ControllerProduto.produtos.add(ex3pro); //ESSA LINHA

            ex4pro = new Produto(304, "Couve", "HortaFeliz", 3.10f, "112002", 70, ex2subcat); //ESSA LINHA
            ControllerProduto.produtos.add(ex4pro); //ESSA LINHA

            ex5pro = new Produto(305, "Pão de leite", "PadariaBom", 1.50f, "113001", 150, ex3subcat); //ESSA LINHA
            ControllerProduto.produtos.add(ex5pro); //ESSA LINHA

            ex6pro = new Produto(306, "Rosquinha", "DoceCasa", 2.00f, "113002", 90, ex3subcat); //ESSA LINHA
            ControllerProduto.produtos.add(ex6pro); //ESSA LINHA

            ex7pro = new Produto(307, "Coxinha", "SalgadinhosTop", 3.50f, "114001", 200, ex4subcat); //ESSA LINHA
            ControllerProduto.produtos.add(ex7pro); //ESSA LINHA

            ex8pro = new Produto(308, "Empada", "MassaBoa", 3.20f, "114002", 180, ex4subcat); //ESSA LINHA
            ControllerProduto.produtos.add(ex8pro); //ESSA LINHA

            ex9pro = new Produto(309, "Veja Multiuso", "Veja", 7.80f, "115001", 120, ex5subcat); //ESSA LINHA
            ControllerProduto.produtos.add(ex9pro); //ESSA LINHA

            ex10pro = new Produto(310, "Desinfetante Lavanda", "Urca", 6.40f, "115002", 100, ex5subcat); //ESSA LINHA
            ControllerProduto.produtos.add(ex10pro); //ESSA LINHA

            ex11pro = new Produto(311, "Sabão em pó", "Omo", 9.90f, "116001", 130, ex6subcat); //ESSA LINHA
            ControllerProduto.produtos.add(ex11pro); //ESSA LINHA

            ex12pro = new Produto(312, "Detergente neutro", "Ypê", 2.70f, "116002", 160, ex6subcat); //ESSA LINHA
            ControllerProduto.produtos.add(ex12pro); //ESSA LINHA
        }

        //EXEMPLOS DE CARRINHOS
        Carrinho carrinho1;
        Carrinho carrinho2;
        Carrinho carrinho3;
        Carrinho carrinho4;
        {
            carrinho1 = new Carrinho(201, 18, 5, 2025, true);
            ControllerCarrinho.carrinhos.add(carrinho1); //ESSA LINHA

            carrinho2 = new Carrinho(202, 10, 5, 2025, true);
            ControllerCarrinho.carrinhos.add(carrinho2); //ESSA LINHA

            carrinho3 = new Carrinho(203, 3, 5, 2025, false);
            ControllerCarrinho.carrinhos.add(carrinho3); //ESSA LINHA

            carrinho4 = new Carrinho(204, 1, 4, 2025, false);
            ControllerCarrinho.carrinhos.add(carrinho4); //ESSA LINHA
        }

        //EXEMPLOS DE MERCADOS PARCEIROS
        MercadoParceiro mp1;
        MercadoParceiro mp2;
        MercadoParceiro mp3;
        {
            mp1 = new MercadoParceiro(301, "Supermercado Estrela Ltda", "12.345.678/0001-90", "01001-000", "www.estrela.com");
            ControllerMercadoParceiro.mercados.add(mp1); //ESSA LINHA

            mp2 = new MercadoParceiro(302, "Comercial Aurora ME", "98.765.432/0001-55", "02002-000", "www.auroracomercial.com");
            ControllerMercadoParceiro.mercados.add(mp2); //ESSA LINHA

            mp3 = new MercadoParceiro(303, "Mercado Central LTDA", "11.222.333/0001-77", "03003-000", "www.centralmercado.com");
            ControllerMercadoParceiro.mercados.add(mp3); //ESSA LINHA
        }

    }

}
