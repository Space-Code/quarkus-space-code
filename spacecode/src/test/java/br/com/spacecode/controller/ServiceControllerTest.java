package br.com.spacecode.controller;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import br.com.spacecode.repository.ServiceRepository;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;

@QuarkusTest
class ServiceControllerTest {
	
	@Inject
	ServiceRepository service;

	@Test
	public void testFindAll() {
		given()
			.when()
			.get("/user/search")
			.then()
			.statusCode(200)
			.body("size()", equalTo(1))
			.contentType(ContentType.JSON);
	}	
}