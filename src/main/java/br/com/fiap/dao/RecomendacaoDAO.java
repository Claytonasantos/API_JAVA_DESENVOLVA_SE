package br.com.fiap.dao;

import br.com.fiap.beans.Recomendacao;
import br.com.fiap.conexoes.ConexaoFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RecomendacaoDAO {

    private Connection minhaConexao;

    public RecomendacaoDAO() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConexaoFactory().conexao();
    }

    // INSERT
    public String inserirRecomendacao(Recomendacao r) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement(
                "INSERT INTO recomendacoes (indice_empregabilidade) VALUES (?)"
        );

        stmt.setDouble(1, r.getIndice_empregabilidade());

        stmt.execute();
        stmt.close();

        return "Recomendação inserida com sucesso!";
    }

    // DELETE
    public String deletarRecomendacao(int id_recomendacao) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement(
                "DELETE FROM recomendacoes WHERE id_recomendacao = ?"
        );

        stmt.setInt(1, id_recomendacao);
        stmt.execute();
        stmt.close();

        return "Recomendação deletada com sucesso!";
    }

    // UPDATE
    public String atualizarRecomendacao(Recomendacao r) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement(
                "UPDATE recomendacoes SET indice_empregabilidade = ? WHERE id_recomendacao = ?"
        );

        stmt.setDouble(1, r.getIndice_empregabilidade());
        stmt.setInt(2, r.getId_recomendacao());

        stmt.executeUpdate();
        stmt.close();

        return "Recomendação atualizada com sucesso!";
    }

    // SELECT
    public List<Recomendacao> selecionarRecomendacao() throws SQLException {
        ArrayList<Recomendacao> lista = new ArrayList<>();

        PreparedStatement stmt = minhaConexao.prepareStatement(
                "SELECT id_recomendacao, indice_empregabilidade, id_usu, id_curso FROM recomendacoes"
        );

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Recomendacao objRecomendacao = new Recomendacao();
            objRecomendacao.setId_recomendacao(rs.getInt(1));
            objRecomendacao.setIndice_empregabilidade(rs.getDouble(2));
            lista.add(objRecomendacao);
        }

        return lista;
    }
}
