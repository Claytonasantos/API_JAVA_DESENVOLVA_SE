package br.com.fiap.main;

import br.com.fiap.beans.Curso;
import br.com.fiap.dao.CursoDAO;

import javax.swing.*;
import java.sql.SQLException;

public class TesteInserirCurso {

    static String texto(String t) { return JOptionPane.showInputDialog(t); }
    static int inteiro(String i) { return Integer.parseInt(JOptionPane.showInputDialog(i)); }
    static double real(String r) { return Double.parseDouble(JOptionPane.showInputDialog(r)); }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        CursoDAO cursoDAO = new CursoDAO();
        Curso objCurso = new Curso();

        objCurso.setNome_curso(texto("Nome do curso"));
        objCurso.setArea(texto("Area do curso"));
        objCurso.setDuracao(inteiro("Duração"));

        System.out.println(cursoDAO.inserirCurso(objCurso));
    }
}
