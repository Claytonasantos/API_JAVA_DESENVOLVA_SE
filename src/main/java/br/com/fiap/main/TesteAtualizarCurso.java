package br.com.fiap.main;

import br.com.fiap.beans.Curso;
import br.com.fiap.dao.CursoDAO;

import javax.swing.*;
import java.sql.SQLException;
import java.text.ParseException;

public class TesteAtualizarCurso {
    static String texto(String t) { return JOptionPane.showInputDialog(t); }
    static int inteiro(String i) { return Integer.parseInt(JOptionPane.showInputDialog(i)); }

    public static void main(String[] args) throws SQLException, ClassNotFoundException, ParseException {

        CursoDAO cursoDAO = new CursoDAO();
        Curso objCurso = new Curso();

        objCurso.setId_curso(inteiro("Informe o ID do curso que será atualizado"));
        objCurso.setNome_curso(texto("Novo nome do curso"));
        objCurso.setArea(texto("Nova área"));
        objCurso.setDuracao(inteiro("Nova duração"));

        System.out.println(cursoDAO.atualizarCurso(objCurso));
    }
}
