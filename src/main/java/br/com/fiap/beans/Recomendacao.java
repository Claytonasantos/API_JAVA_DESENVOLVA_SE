package br.com.fiap.beans;

public class Recomendacao {
    private int id_recomendacao;
    private double indice_empregabilidade;

    public Recomendacao() {
    }

    public int getId_recomendacao() {
        return id_recomendacao;
    }

    public void setId_recomendacao(int id_recomendacao) {
        this.id_recomendacao = id_recomendacao;
    }

    public double getIndice_empregabilidade() {
        return indice_empregabilidade;
    }

    public void setIndice_empregabilidade(double indice_empregabilidade) {
        this.indice_empregabilidade = indice_empregabilidade;
    }

    @Override
    public String toString() {
        return "Recomendacoes" +
                "\nid_recomendacao: " + id_recomendacao +
                "\nindice_empregabilidade: " + indice_empregabilidade
                ;
    }
}
