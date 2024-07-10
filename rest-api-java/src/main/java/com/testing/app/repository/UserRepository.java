package com.testing.app.repository;

import com.testing.app.model.Systemuser;
import com.speedment.jpastreamer.application.JPAStreamer;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.Optional;

@ApplicationScoped
public class UserRepository {
    @Inject
    JPAStreamer jpaStreamer;

    public Optional<Systemuser> getEmails() {
        long la = jpaStreamer.stream(Systemuser.class)
                .count();
        Optional<Systemuser> user = jpaStreamer.stream(Systemuser.class)
                .findFirst();
        return user;
    }
}
