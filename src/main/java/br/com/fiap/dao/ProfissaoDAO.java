package br.com.fiap.dao;

import br.com.fiap.beans.Profissao;
import br.com.fiap.conexoes.ConexaoFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProfissaoDAO {

    private Connection minhaConexao;

    public ProfissaoDAO() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConexaoFactory().conexao();
    }

    // INSERT
    public String inserirProfissao(Profissao profissao) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement(
                "INSERT INTO profissoes (nome_profissao, area_tendencia) VALUES (?, ?)"
        );

        stmt.setString(1, profissao.getNome_profissao());
        stmt.setString(2, profissao.getArea_tendencia());
        stmt.execute();
        stmt.close();

        return "Profissão inserida com sucesso!";
    }

    // DELETE
    public String deletarProfissao(int id_profissao) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement(
                "DELETE FROM profissoes WHERE id_profissao = ?"
        );

        stmt.setInt(1, id_profissao);
        stmt.execute();
        stmt.close();

        return "Profissão deletada com sucesso!";
    }

    // UPDATE
    public String atualizarProfissao(Profissao profissao) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement(
                "UPDATE profissoes SET nome_profissao = ?, area_tendencia = ? WHERE id_profissao = ?"
        );

        stmt.setString(1, profissao.getNome_profissao());
        stmt.setString(2, profissao.getArea_tendencia());
        stmt.setInt(3, profissao.getId_profissao());

        stmt.executeUpdate();
        stmt.close();

        return "Profissão atualizada com sucesso!";
    }

    // SELECT
    public List<Profissao> selecionarProfissao() throws SQLException {
        ArrayList<Profissao> lista = new ArrayList<>();

        PreparedStatement stmt = minhaConexao.prepareStatement(
                "SELECT id_profissao, nome_profissao, area_tendencia FROM profissoes"
        );

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Profissao objProfissao = new Profissao();
            objProfissao.setId_profissao(rs.getInt(1));
            objProfissao.setNome_profissao(rs.getString(2));
            objProfissao.setArea_tendencia(rs.getString(3));
            lista.add(objProfissao);
        }

        return lista;
    }
}
