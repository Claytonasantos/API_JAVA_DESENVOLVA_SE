package br.com.fiap.main;

import br.com.fiap.beans.Usuario;
import br.com.fiap.dao.UsuarioDAO;

import javax.swing.*;
import java.sql.SQLException;
import java.text.ParseException;


public class TesteInserirUsuario {
    static String texto (String t) {return JOptionPane.showInputDialog(t);}
    static int inteiro (String i) {return Integer.parseInt(JOptionPane.showInputDialog(i));}
    static double real (String r) {return Double.parseDouble(JOptionPane.showInputDialog(r));}



    public static void main(String[] args) throws SQLException, ClassNotFoundException, ParseException {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario objUsuario = new Usuario();

        objUsuario.setNome(texto("Nome"));
        objUsuario.setIdade(inteiro("Idade"));
        objUsuario.setProfissao_atual(texto("Profissão atual"));
        objUsuario.setNivel_formacao(texto("Nivel de formação"));


        System.out.println(usuarioDAO.inserirUsuario(objUsuario));
    }
}
