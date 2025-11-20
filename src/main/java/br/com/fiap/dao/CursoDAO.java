package br.com.fiap.dao;

import br.com.fiap.beans.Curso;
import br.com.fiap.conexoes.ConexaoFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CursoDAO {

    private Connection minhaConexao;

    public CursoDAO() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConexaoFactory().conexao();
    }

    // INSERT
    public String inserirCurso(Curso curso) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement(
                "INSERT INTO cursos (nome_curso, area, duracao) VALUES (?, ?, ?)"
        );

        stmt.setString(1, curso.getNome_curso());
        stmt.setString(2, curso.getArea());
        stmt.setInt(3, curso.getDuracao());

        stmt.execute();
        stmt.close();

        return "Curso inserido com sucesso!";
    }

    // DELETE
    public String deletarCurso(int id_curso) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement(
                "DELETE FROM cursos WHERE id_curso = ?"
        );

        stmt.setInt(1, id_curso);
        stmt.execute();
        stmt.close();

        return "Curso deletado com sucesso!";
    }

    // UPDATE
    public String atualizarCurso(Curso curso) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement(
                "UPDATE cursos SET nome_curso = ?, area = ?, duracao = ? WHERE id_curso = ?"
        );

        stmt.setString(1, curso.getNome_curso());
        stmt.setString(2, curso.getArea());
        stmt.setInt(3, curso.getDuracao());
        stmt.setInt(4, curso.getId_curso());

        stmt.executeUpdate();
        stmt.close();

        return "Curso atualizado com sucesso!";
    }

    // SELECT
    public List<Curso> selecionarCurso() throws SQLException {
        ArrayList<Curso> lista = new ArrayList<>();

        PreparedStatement stmt = minhaConexao.prepareStatement(
                "SELECT id_curso, nome_curso, area, duracao FROM cursos"
        );

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Curso objCurso = new Curso();
            objCurso.setId_curso(rs.getInt(1));
            objCurso.setNome_curso(rs.getString(2));
            objCurso.setArea(rs.getString(3));
            objCurso.setDuracao(rs.getInt(4));
            lista.add(objCurso);
        }

        return lista;
    }
}
