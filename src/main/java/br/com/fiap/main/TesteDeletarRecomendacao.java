package br.com.fiap.main;

import br.com.fiap.beans.Recomendacao;
import br.com.fiap.dao.RecomendacaoDAO;

import javax.swing.*;
import java.sql.SQLException;

public class TesteDeletarRecomendacao {
    static int inteiro(String i) { return Integer.parseInt(JOptionPane.showInputDialog(i)); }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        RecomendacaoDAO recomendacaoDAO = new RecomendacaoDAO();
        Recomendacao objRecomendacao = new Recomendacao();

        objRecomendacao.setId_recomendacao(inteiro("Informe o ID da recomendação que será deletada"));

        System.out.println(recomendacaoDAO.deletarRecomendacao(objRecomendacao.getId_recomendacao()));
    }
}
