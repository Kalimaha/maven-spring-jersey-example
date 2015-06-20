package org.geobricks.rest;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Component
@Path("/hello")
public class HelloWorld {

    @GET
    @Path("{name}")
    public Response sayHello(@PathParam("name") String name) {

        /* Stream result */
        return Response.status(200).entity("Hello " + name + "!").build();

    }


}