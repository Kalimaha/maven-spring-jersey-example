package org.geobricks.rest;

import org.geobricks.core.HelloWorldCore;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Component
@Path("/hello")
public class HelloWorldREST {

    @GET
    @Path("{name}")
    public Response sayHello(@PathParam("name") String name) {

        /* Load core library. */
        HelloWorldCore c = new HelloWorldCore();

        /* Stream result */
        return Response.status(200).entity(c.sayHello(name)).build();

    }


}