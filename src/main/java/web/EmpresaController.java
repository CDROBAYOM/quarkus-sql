package web;


import domain.model.EmpresaDTO;
import domain.service.EmpresaService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/Negocios/v1/Matricular")
public class EmpresaController {

    @Inject
    EmpresaService empresaService;

    @POST
    @Path("/registrar")
    @Produces(MediaType.APPLICATION_JSON)
    public Response postRegistrarSolcitud(@HeaderParam("X-RqUID") String XRqUID,
                                          @HeaderParam("X-Channel") String XChannel,
                                          @HeaderParam("X-CompanyId") String XCompanyId,
                                          EmpresaDTO empresaDTO){
            return Response.ok(empresaService.save(empresaDTO)).build();
    }

    @GET
    @Path("/consultar/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getConsultarEmpresa(@HeaderParam("X-RqUID") String XRqUID,
                                        @HeaderParam("X-Channel") String XChannel,
                                        @HeaderParam("X-CompanyId") String XCompanyId,
                                        @PathParam("id") int id){
        return Response.ok(empresaService.findById(id)).build();
    }

    @GET
    @Path("/empresas")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getObtenerEmpresas(@HeaderParam("X-RqUID") String XRqUID,
                                       @HeaderParam("X-Channel") String XChannel,
                                       @HeaderParam("X-CompanyId") String XCompanyId){
        return Response.ok(empresaService.findAll()).build();
    }

    @PUT
    @Path("/actualizar")
    @Produces(MediaType.APPLICATION_JSON)
    public Response putActualizarEmpresa(@HeaderParam("X-RqUID") String XRqUID,
                                         @HeaderParam("X-Channel") String XChannel,
                                         @HeaderParam("X-CompanyId") String XCompanyId,
                                         EmpresaDTO empresaDTO){
        return Response.ok(empresaService.update(empresaDTO)).build();
    }

    @DELETE
    @Path("/eliminar/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteEliminarEmpresa(@HeaderParam("X-RqUID") String XRqUID,
                                          @HeaderParam("X-Channel") String XChannel,
                                          @HeaderParam("X-CompanyId") String XCompanyId,
                                          @PathParam("id") int id){
        empresaService.delete(id);
        return Response.ok().build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/ping")
    public String ping(){
        return "ping";
    }

}
