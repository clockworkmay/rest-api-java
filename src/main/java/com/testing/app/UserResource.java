package com.testing.app;

import com.testing.app.model.Systemuser;
import com.testing.app.repository.UserRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.Optional;

@Path("/")
public class UserResource {
    @Inject
    UserRepository userRepository;

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello World! Update v2";
    }

    @GET
    @Path("/systemuser/emails")
    @Produces(MediaType.TEXT_PLAIN)
    public String getEmails() {
        Optional<Systemuser> emails = userRepository.getEmails();
        return emails.isPresent() ? emails.get().getLoginemail() : "No emails was found!";
    }
}
