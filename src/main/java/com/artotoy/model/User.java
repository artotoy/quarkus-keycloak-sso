package com.artotoy.model;

import io.quarkus.security.identity.SecurityIdentity;
import jakarta.ws.rs.core.Response;

import java.util.Map;

public class User {
    private final String userName;

    public User(SecurityIdentity identity){
        this.userName = identity.getPrincipal().getName();
    }

    public String getUserName(){
        return this.userName;
    }

}
