package br.edu.ifsc.sistema.mercado.persistencia;

import java.util.List;

/**
 * Interface Genérica para operações de Acesso a Dados (CRUD).
 *
 * @param <TipoClasse> O tipo da entidade.
 * @param <TipoChavePrimaria> O tipo da chave para busca.
 */
public interface DAO<TipoClasse, TipoChavePrimaria> {

    void criar(TipoClasse entidade);

    void atualizar(TipoClasse entidade, TipoChavePrimaria arg);

    void deletar(TipoClasse entidade);

    TipoClasse buscar(TipoChavePrimaria arg);

    List<TipoClasse> buscarTodos();

}