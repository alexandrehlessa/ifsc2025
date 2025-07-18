Trabalho feito, confesso que poderia estar mais polido, acabei subestimando a dificuldade de criar o programa e não tendo tanto tempo para "Detalhes".
A maioria dos fluxos não tem como dar erro, os únicos erros possíveis são:
- Dados inputados: mas como usei a classe Leitor que o professor disponibilizou, notei que ele mesmo já tem uma mensagem de erro que pede correção do usuário
- Dados "impossíveis": Não criei validação de dados como, por exemplo, não deixar o usuário digitar uma data como "123/123/321313131"
Quando digo que não tem como dar erro é porque o usuário não tem opção, além dos erros falados, de sair do fluxo sem que o programa reclame/entenda. A princípio não tem*.
Alterei algumas boas coisas da apresntação de BDD, vou passar as principais regras:
- Master -> é um objeto administrador, mas tem mais poderes que os adms, inclusive de CRUD adms
- Administradores -> cadastram/listam a categorias, subcategorias e produtos
    Master é hardcoded.

- Categoria: Ex: (nome = Padaria, seção do mercado = Corredor)
- Subcategoria: Ex: (nome = Pães, categoria = Padaria)
- Produto: Ex: (nome = Pão de Queijo, ...outros dados..., subcategoria = Pães)
    É necessário subcategoria para produto e categoria para subcategoria

Classes com atributos do projeto estão nos nomes simples(MercadoParceiro, Carrinho, Compra, etc) com excessão do Main, População, Leitor

Classes com Controller: são únicas que possuem método com exceção do Main, População e Leitor. Antes de começar, pesquisei algumas ""arquiteturas"" pra ajudar na organização, achei essa extremamente boa, e finalizando o projeto, percebo que ela ajudou MUITO a parte da organização.

População: Pedi pro gpt criar dados, para facilitar testes e etc, para zerar os dados (as respostas mudam) basta apagar ou comentar o método que os chama.

Utilizei alguns comentários // mas com razões não sendo "Essa parte do código faz tal coisa", mas sim coisas ou academicas, que eu tava aprendendo no momento, ou coisas qyue quero mostrar na apresentação.

Apesar de achar que poderia melhorar muito, inclusive já penso em possíveis melhorias, o trabalho fez esclarecer muito a visão sobre POO (agora vejo o quão "simples" e "difícil" é fazer qualquer programa, como rede social, site de carros etc.)

De novo, por dar uma subestimada no projeto e me apertar no tempo, algumas partes do código ficaram feias, porém com os métodos divididos por Controllers creio que esta fácil de se encontrar.

Não sei se controller é a palavra certa mas achei legal de usar aqui

Tinha receio do Java, mas apesar de parecer e de ser famosa por ser difícil, faz muito sentido todos as ferramentas que usei dessa linguagem

Não utilizei a formatação padrão para metodosAssim e listasAssim, usei ClassesAssim e variaveisAssim.
Sei que não é o jeito certo, mas como foi um trabalho individual tomei essa liberdade e sinceramente senti melhora nas compreensões em vários momentos.

Desenhei os fluxos presentes no projeto:
FLUXOS https://whimsical.com/payout-BTcuvTtuFnRjuKJgY1vDTB