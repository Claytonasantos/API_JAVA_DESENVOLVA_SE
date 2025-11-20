package br.com.fiap.bo;

import br.com.fiap.beans.Curso;
import br.com.fiap.dao.CursoDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public class CursoBO {
    CursoDAO cursoDAO;

    // Selecionar
    public ArrayList<Curso> selecionarCursoBo() throws SQLException, ClassNotFoundException {
        cursoDAO = new CursoDAO();

        // Regra de negócio
        return (ArrayList<Curso>) cursoDAO.selecionarCurso();
    }

    // Inserir
    public void inserirCursoBo(Curso curso) throws SQLException, ClassNotFoundException {
        cursoDAO = new CursoDAO();

        // Regra de negócios
        cursoDAO.inserirCurso(curso);
    }

    // Atualizar
    public void atualizarCursoBo(Curso curso) throws SQLException, ClassNotFoundException {
        cursoDAO = new CursoDAO();

        // Regra de negócios
        cursoDAO.atualizarCurso(curso);
    }

    // Deletar
    public void deletarCursoBo(int id_curso) throws SQLException, ClassNotFoundException {
        cursoDAO = new CursoDAO();

        //Regra de negócios
        cursoDAO.deletarCurso(id_curso);
    }
}
