package br.com.fiap;

import br.com.fiap.beans.Recomendacao;
import br.com.fiap.bo.RecomendacaoBO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import jakarta.ws.rs.ext.Provider;

import java.sql.SQLException;
import java.util.ArrayList;

@Provider
@Path("/recomendacao")
public class RecomendacaoResource {

    private RecomendacaoBO recomendacaoBO = new RecomendacaoBO();

    // Selecionar
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Recomendacao> selecionarRecomendacaoRs() throws ClassNotFoundException, SQLException {
        return (ArrayList<Recomendacao>) recomendacaoBO.selecionarRecomendacaoBo();
    }

    // Inserir
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response inserirRecomendacaoRs(Recomendacao objRecomendacao, @Context UriInfo uriInfo)
            throws ClassNotFoundException, SQLException {

        recomendacaoBO.inserirRecomendacaoBo(objRecomendacao);
        UriBuilder builder = uriInfo.getAbsolutePathBuilder();
        builder.path(Integer.toString(objRecomendacao.getId_recomendacao()));
        return Response.created(builder.build()).build();
    }

    // Atualizar
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response atualizarRecomendacaoRs(Recomendacao objRecomendacao, @PathParam("id_recomendacao") int id_recomendacao)
            throws ClassNotFoundException, SQLException {

        recomendacaoBO.atualizarRecomendacaoBo(objRecomendacao);
        return Response.ok().build();
    }

    // Deletar
    @DELETE
    @Path("/{id_recomendacao}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deletarRecomendacaoRs(@PathParam("id_recomendacao") int id_recomendacao)
            throws ClassNotFoundException, SQLException {

        recomendacaoBO.deletarRecomendacaoBo(id_recomendacao);
        return Response.ok().build();
    }
}
