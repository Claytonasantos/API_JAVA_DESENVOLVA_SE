package br.com.fiap.beans;

public class Profissao {
    private int id_profissao;
    private String nome_profissao;
    private String area_tendencia;

    public Profissao() {
    }

    public Profissao(int id_profissao, String nome_profissao, String area_tendencia) {
        this.id_profissao = id_profissao;
        this.nome_profissao = nome_profissao;
        this.area_tendencia = area_tendencia;
    }

    public int getId_profissao() {
        return id_profissao;
    }

    public void setId_profissao(int id_profissao) {
        this.id_profissao = id_profissao;
    }

    public String getNome_profissao() {
        return nome_profissao;
    }

    public void setNome_profissao(String nome_profissao) {
        this.nome_profissao = nome_profissao;
    }

    public String getArea_tendencia() {
        return area_tendencia;
    }

    public void setArea_tendencia(String area_tendencia) {
        this.area_tendencia = area_tendencia;
    }

    @Override
    public String toString() {
        return "Profissao" +
                "\nid_profissao: " + id_profissao +
                "\nnome_profissao: " + nome_profissao +
                "\narea_tendencia: " + area_tendencia
                ;
    }
}
