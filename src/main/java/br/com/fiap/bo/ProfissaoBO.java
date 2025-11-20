package br.com.fiap.bo;

import br.com.fiap.beans.Profissao;
import br.com.fiap.dao.ProfissaoDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public class ProfissaoBO {
    ProfissaoDAO profissaoDAO;

    // Selecionar
    public ArrayList<Profissao> selecionarProfissaoBo() throws SQLException, ClassNotFoundException {
        profissaoDAO = new ProfissaoDAO();

        // Regra de negócio
        return (ArrayList<Profissao>) profissaoDAO.selecionarProfissao();
    }

    // Inserir
    public void inserirProfissaoBo(Profissao profissao) throws SQLException, ClassNotFoundException {
        profissaoDAO = new ProfissaoDAO();

        // Regra de negócios
        profissaoDAO.inserirProfissao(profissao);
    }

    // Atualizar
    public void atualizarProfissaoBo(Profissao profissao) throws SQLException, ClassNotFoundException {
        profissaoDAO = new ProfissaoDAO();

        // Regra de negócios
        profissaoDAO.atualizarProfissao(profissao);
    }

    // Deletar
    public void deletarProfissaoBo(int id_profissao) throws SQLException, ClassNotFoundException {
        profissaoDAO = new ProfissaoDAO();

        //Regra de negócios
        profissaoDAO.deletarProfissao(id_profissao);
    }
}
