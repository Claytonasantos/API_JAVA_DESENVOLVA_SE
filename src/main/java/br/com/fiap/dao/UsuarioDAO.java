package br.com.fiap.dao;

import br.com.fiap.beans.Usuario;
import br.com.fiap.conexoes.ConexaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    public Connection minhaConexao;

    public UsuarioDAO() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConexaoFactory().conexao();
    }

    //insert
    public String inserirUsuario(Usuario usuario) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement
                ("Insert into usuarios (nome, idade, profissao_atual, nivel_formacao) values (?, ?, ?, ?)");
        stmt.setString(1,usuario.getNome());
        stmt.setInt(2,usuario.getIdade());
        stmt.setString(3,usuario.getProfissao_atual());
        stmt.setString(4,usuario.getNivel_formacao());

        stmt.execute();
        stmt.close();

        return "Usuario inserido com sucesso!";
    }

    //Deletar
    public String deletarUsuario(Integer id_usu) throws SQLException {
        PreparedStatement stmt =
                minhaConexao.prepareStatement("Delete from usuarios where id_usu = ?");
        stmt.setInt(1, id_usu);
        stmt.execute();
        stmt.close();

        return "Usuario deletado com sucesso!";
    }

    //Update
    public String atualizarUsuario(Usuario usuario) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement("Update usuarios set nome = ?, idade = ?, profissao_atual = ?, nivel_formacao = ? where id_usu = ?");
        stmt.setString(1, usuario.getNome());
        stmt.setInt(2,usuario.getIdade());
        stmt.setString(3, usuario.getProfissao_atual());
        stmt.setString(4, usuario.getNivel_formacao());
        stmt.setInt(5,usuario.getId_usu());

        stmt.executeUpdate();
        stmt.close();

        return "Usuario atualizado com sucesso!";
    }

    // Select
    public List<Usuario> selecionarUsuario() throws SQLException {
        ArrayList<Usuario> listUsuario = new ArrayList<Usuario>();

        PreparedStatement stmt = minhaConexao.prepareStatement("select id_usu, nome, idade, profissao_atual, nivel_formacao from usuarios");

        ResultSet rs = stmt.executeQuery();

        while(rs.next()){
            Usuario objUsuario = new Usuario();
            objUsuario.setId_usu(rs.getInt(1));
            objUsuario.setNome(rs.getString(2));
            objUsuario.setIdade(rs.getInt(3));
            objUsuario.setProfissao_atual(rs.getString(4));
            objUsuario.setNivel_formacao(rs.getString(5));
            listUsuario.add(objUsuario);
        }
        return listUsuario;
    }
}
