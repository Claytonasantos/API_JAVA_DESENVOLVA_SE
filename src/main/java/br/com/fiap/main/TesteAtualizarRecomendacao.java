package br.com.fiap.main;

import br.com.fiap.beans.Recomendacao;
import br.com.fiap.dao.RecomendacaoDAO;

import javax.swing.*;
import java.sql.SQLException;

public class TesteAtualizarRecomendacao {
    static int inteiro(String i) { return Integer.parseInt(JOptionPane.showInputDialog(i)); }
    static double real(String r) { return Double.parseDouble(JOptionPane.showInputDialog(r)); }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        RecomendacaoDAO recomendacaoDAO = new RecomendacaoDAO();
        Recomendacao objRecomendacao = new Recomendacao();

        objRecomendacao.setId_recomendacao(inteiro("ID da recomendação a atualizar"));
        objRecomendacao.setIndice_empregabilidade(real("Novo índice de empregabilidade"));

        System.out.println(recomendacaoDAO.atualizarRecomendacao(objRecomendacao));
    }
}
