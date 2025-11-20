package br.com.fiap.beans;

public class Usuario {
    private int id_usu;
    private String nome;
    private int idade;
    private String profissao_atual;
    private String nivel_formacao;

    public Usuario() {
    }

    public Usuario(int id_usu, String nome, int idade, String profissao_atual, String nivel_formacao) {
        this.id_usu = id_usu;
        this.nome = nome;
        this.idade = idade;
        this.profissao_atual = profissao_atual;
        this.nivel_formacao = nivel_formacao;
    }

    public int getId_usu() {
        return id_usu;
    }

    public void setId_usu(int id_usu) {
        this.id_usu = id_usu;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao_atual() {
        return profissao_atual;
    }

    public void setProfissao_atual(String profissao_atual) {
        this.profissao_atual = profissao_atual;
    }

    public String getNivel_formacao() {
        return nivel_formacao;
    }

    public void setNivel_formacao(String nivel_formacao) {
        this.nivel_formacao = nivel_formacao;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "\nid_usu" + id_usu +
                "\nnome" + nome +
                "\nidade" + idade +
                "\nprofissao_atual" + profissao_atual +
                "\nnivel_formacao" + nivel_formacao
                ;
    }
}
