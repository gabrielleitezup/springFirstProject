package org.example.ws.service;

import org.example.ws.modal.Greeting;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class GreetingServiceBean implements GreetingService {

    @Override
    public Collection<Greeting> findAll() {
        return null;
    }

    @Override
    public Greeting findOne(Long id) {
        return null;
    }

    @Override
    public Greeting create(Greeting greeting) {
        return null;
    }

    @Override
    public Greeting update(Greeting greeting) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
