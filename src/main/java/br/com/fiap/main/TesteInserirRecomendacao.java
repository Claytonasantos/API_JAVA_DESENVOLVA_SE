package br.com.fiap.main;

import br.com.fiap.beans.Recomendacao;
import br.com.fiap.dao.RecomendacaoDAO;

import javax.swing.*;
import java.sql.SQLException;

public class TesteInserirRecomendacao {
    static double real(String r) { return Double.parseDouble(JOptionPane.showInputDialog(r)); }
    static int inteiro(String i) { return Integer.parseInt(JOptionPane.showInputDialog(i)); }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        RecomendacaoDAO recomendacaoDAO = new RecomendacaoDAO();
        Recomendacao objRecomendacao = new Recomendacao();

        objRecomendacao.setIndice_empregabilidade(real("Índice de empregabilidade"));
        System.out.println(recomendacaoDAO.inserirRecomendacao(objRecomendacao));
    }
}
