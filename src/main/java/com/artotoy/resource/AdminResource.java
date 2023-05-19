package com.artotoy.resource;

import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/admin")
public class AdminResource {


    @Produces(MediaType.APPLICATION_JSON)
    @RolesAllowed("admin")
    public String admin(){
        return "Granted!!!";
    }
}
