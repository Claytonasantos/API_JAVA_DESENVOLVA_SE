package br.com.fiap.main;

import br.com.fiap.beans.Curso;
import br.com.fiap.dao.CursoDAO;

import javax.swing.*;
import java.sql.SQLException;

public class TesteDeletarCurso {
    static int inteiro(String i) { return Integer.parseInt(JOptionPane.showInputDialog(i)); }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        CursoDAO cursoDAO = new CursoDAO();
        Curso objCurso = new Curso();

        objCurso.setId_curso(inteiro("Informe o ID do curso que vai ser deletado"));

        System.out.println(cursoDAO.deletarCurso(objCurso.getId_curso()));
    }
}
