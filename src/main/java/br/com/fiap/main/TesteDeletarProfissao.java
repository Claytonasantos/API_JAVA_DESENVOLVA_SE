package br.com.fiap.main;

import br.com.fiap.beans.Profissao;
import br.com.fiap.dao.ProfissaoDAO;

import javax.swing.*;
import java.sql.SQLException;

public class TesteDeletarProfissao {
    static int inteiro(String i) { return Integer.parseInt(JOptionPane.showInputDialog(i)); }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ProfissaoDAO profissaoDAO = new ProfissaoDAO();
        Profissao objProfissao = new Profissao();

        objProfissao.setId_profissao(inteiro("Informe o ID da profissão que vai ser deletada"));

        System.out.println(profissaoDAO.deletarProfissao(objProfissao.getId_profissao()));
    }
}
