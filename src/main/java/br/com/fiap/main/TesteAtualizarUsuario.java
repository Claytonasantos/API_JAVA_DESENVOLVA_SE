package br.com.fiap.main;

import br.com.fiap.beans.Usuario;
import br.com.fiap.dao.UsuarioDAO;

import javax.swing.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteAtualizarUsuario {
    static String texto (String t) {return JOptionPane.showInputDialog(t);}
    static int inteiro (String i) {return Integer.parseInt(JOptionPane.showInputDialog(i));}
    static double real (String r) {return Double.parseDouble(JOptionPane.showInputDialog(r));}

    public static void main(String[] args) throws SQLException, ClassNotFoundException, ParseException {
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        Usuario objUsuario = new Usuario();

        objUsuario.setId_usu(inteiro("Informe o Id do usuario que será atualizado"));
        objUsuario.setNome(texto("Informe o nome do usuario que sera atualizado"));
        objUsuario.setIdade(inteiro("Informe a idade do usuario que sera atualizada"));
        objUsuario.setProfissao_atual(texto("Informe a nova profissao que sera inserida"));
        objUsuario.setNivel_formacao(texto("Informe o seu novo nivel de formação"));

        System.out.println(usuarioDAO.atualizarUsuario(objUsuario));
    }
}
