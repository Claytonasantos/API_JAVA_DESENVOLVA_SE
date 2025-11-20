package br.com.fiap.main;

import br.com.fiap.beans.Profissao;
import br.com.fiap.dao.ProfissaoDAO;

import javax.swing.*;
import java.sql.SQLException;

public class TesteInserirProfissao {

    static String texto(String t) { return JOptionPane.showInputDialog(t); }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ProfissaoDAO profissaoDAO = new ProfissaoDAO();
        Profissao objProfissao = new Profissao();

        objProfissao.setNome_profissao(texto("Nome da profissão"));
        objProfissao.setArea_tendencia(texto("Área de tendência"));

        System.out.println(profissaoDAO.inserirProfissao(objProfissao));
    }
}
