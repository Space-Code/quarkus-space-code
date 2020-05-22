package br.com.spacecode.repository;

import br.com.spacecode.model.User;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class ServiceRepository {

    public List<User> findAll() {
        return User.findAll().list();
    }

}
