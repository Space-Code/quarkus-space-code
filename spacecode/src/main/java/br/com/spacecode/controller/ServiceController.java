package br.com.spacecode.controller;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.spacecode.model.User;
import br.com.spacecode.repository.ServiceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ServiceController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceController.class);

    @Inject
    ServiceRepository serviceRepository;

    @GET
    @Path("/search")
    public List<User> findAllUser() {
        LOGGER.info("All user search");
        return serviceRepository.findAll();
    }
}
