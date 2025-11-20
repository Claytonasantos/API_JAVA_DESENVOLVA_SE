package br.com.fiap.bo;

import br.com.fiap.beans.Recomendacao;
import br.com.fiap.dao.RecomendacaoDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public class RecomendacaoBO {
    RecomendacaoDAO recomendacaoDAO;

    // Selecionar
    public ArrayList<Recomendacao> selecionarRecomendacaoBo() throws SQLException, ClassNotFoundException {
        recomendacaoDAO = new RecomendacaoDAO();

        // Regra de negócio
        return (ArrayList<Recomendacao>) recomendacaoDAO.selecionarRecomendacao();
    }

    // Inserir
    public void inserirRecomendacaoBo(Recomendacao recomendacao) throws SQLException, ClassNotFoundException {
        recomendacaoDAO = new RecomendacaoDAO();

        // Regra de negócios
        recomendacaoDAO.inserirRecomendacao(recomendacao);
    }

    // Atualizar
    public void atualizarRecomendacaoBo(Recomendacao recomendacao) throws SQLException, ClassNotFoundException {
        recomendacaoDAO = new RecomendacaoDAO();

        // Regra de negócios
        recomendacaoDAO.atualizarRecomendacao(recomendacao);
    }

    // Deletar
    public void deletarRecomendacaoBo(int id_recomendacao) throws SQLException, ClassNotFoundException {
        recomendacaoDAO = new RecomendacaoDAO();

        //Regra de negócios
        recomendacaoDAO.deletarRecomendacao(id_recomendacao);
    }
}
