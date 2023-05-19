package com.artotoy.resource;

import com.artotoy.model.User;
import io.quarkus.security.identity.SecurityIdentity;
import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.Map;

@Path("/api/users")
public class UserResource {
    @Inject
    SecurityIdentity identity;

    @GET
    @Path("/me")
    @Produces(MediaType.APPLICATION_JSON)
    @RolesAllowed("user")
    public User me(){
        return new User(identity);
    }

    @GET
    @Path("/info")
    @Produces(MediaType.APPLICATION_JSON)
    @RolesAllowed("user")
    public Response info(){
        return Response.ok(Map.of("userInfo", identity.getPrincipal())).build();
    }
}
