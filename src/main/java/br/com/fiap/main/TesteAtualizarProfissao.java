package br.com.fiap.main;

import br.com.fiap.beans.Profissao;
import br.com.fiap.dao.ProfissaoDAO;

import javax.swing.*;
import java.sql.SQLException;

public class TesteAtualizarProfissao {
    static String texto(String t) { return JOptionPane.showInputDialog(t); }
    static int inteiro(String i) { return Integer.parseInt(JOptionPane.showInputDialog(i)); }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        ProfissaoDAO profissaoDAO = new ProfissaoDAO();
        Profissao objProfissao = new Profissao();

        objProfissao.setId_profissao(inteiro("ID da profissão a atualizar"));
        objProfissao.setNome_profissao(texto("Novo nome da profissão"));
        objProfissao.setArea_tendencia(texto("Nova área/tendência"));

        System.out.println(profissaoDAO.atualizarProfissao(objProfissao));
    }
}
