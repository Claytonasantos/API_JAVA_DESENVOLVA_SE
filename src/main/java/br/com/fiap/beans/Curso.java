package br.com.fiap.beans;

public class Curso {
    private int id_curso;
    private String nome_curso;
    private String area;
    private int duracao;
    private String link_curso;

    public Curso() {
    }

    public Curso(int id_curso, String nome_curso, String area, int duracao, String link_curso) {
        this.id_curso = id_curso;
        this.nome_curso = nome_curso;
        this.area = area;
        this.duracao = duracao;
        this.link_curso = link_curso;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public String getNome_curso() {
        return nome_curso;
    }

    public void setNome_curso(String nome_curso) {
        this.nome_curso = nome_curso;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getLink_curso() {
        return link_curso;
    }

    public void setLink_curso(String link_curso) {
        this.link_curso = link_curso;
    }

    @Override
    public String toString() {
        return "Curso" +
                "\nid_curso: " + id_curso +
                "\nnome_curso: " + nome_curso +
                "\narea: " + area +
                "\nduracao: " + duracao +
                "\nlink_curso: " + link_curso
                ;
    }
}
