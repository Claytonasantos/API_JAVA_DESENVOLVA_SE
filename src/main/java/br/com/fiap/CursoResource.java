package br.com.fiap;

import br.com.fiap.beans.Curso;
import br.com.fiap.bo.CursoBO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import jakarta.ws.rs.ext.Provider;

import java.sql.SQLException;
import java.util.ArrayList;

@Provider
@Path("/curso")
public class CursoResource {

    private CursoBO cursoBO = new CursoBO();

    // Selecionar
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Curso> selecionarCursoRs() throws ClassNotFoundException, SQLException {
        return (ArrayList<Curso>) cursoBO.selecionarCursoBo();
    }

    // Inserir
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response inserirCursoRs(Curso objCurso, @Context UriInfo uriInfo) throws ClassNotFoundException, SQLException {
        cursoBO.inserirCursoBo(objCurso);
        UriBuilder builder = uriInfo.getAbsolutePathBuilder();
        builder.path(Integer.toString(objCurso.getId_curso()));
        return Response.created(builder.build()).build();
    }

    // Atualizar
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response atualizarCursoRs(Curso objCurso, @PathParam("id_curso") int id_curso) throws ClassNotFoundException, SQLException {
        cursoBO.atualizarCursoBo(objCurso);
        return Response.ok().build();
    }

    // Deletar
    @DELETE
    @Path("/{id_curso}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deletarCursoRs(@PathParam("id_curso") int id_curso) throws ClassNotFoundException, SQLException {
        cursoBO.deletarCursoBo(id_curso);
        return Response.ok().build();
    }
}
