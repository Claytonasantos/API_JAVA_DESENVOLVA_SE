package br.com.fiap;

import br.com.fiap.beans.Profissao;
import br.com.fiap.bo.ProfissaoBO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import jakarta.ws.rs.ext.Provider;

import java.sql.SQLException;
import java.util.ArrayList;

@Provider
@Path("/profissao")
public class ProfissaoResource {

    private ProfissaoBO profissaoBO = new ProfissaoBO();

    // Selecionar
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Profissao> selecionarProfissaoRs() throws ClassNotFoundException, SQLException {
        return (ArrayList<Profissao>) profissaoBO.selecionarProfissaoBo();
    }

    // Inserir
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response inserirProfissaoRs(Profissao objProfissao, @Context UriInfo uriInfo)
            throws ClassNotFoundException, SQLException {

        profissaoBO.inserirProfissaoBo(objProfissao);
        UriBuilder builder = uriInfo.getAbsolutePathBuilder();
        builder.path(Integer.toString(objProfissao.getId_profissao()));
        return Response.created(builder.build()).build();
    }

    // Atualizar
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response atualizarProfissaoRs(Profissao objProfissao, @PathParam("id_profissao") int id_profissao)
            throws ClassNotFoundException, SQLException {

        profissaoBO.atualizarProfissaoBo(objProfissao);
        return Response.ok().build();
    }

    // Deletar
    @DELETE
    @Path("/{id_profissao}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deletarProfissaoRs(@PathParam("id_profissao") int id_profissao)
            throws ClassNotFoundException, SQLException {

        profissaoBO.deletarProfissaoBo(id_profissao);
        return Response.ok().build();
    }
}
