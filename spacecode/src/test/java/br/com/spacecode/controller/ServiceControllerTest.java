package br.com.spacecode.controller;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

class ServiceControllerTest {

	  @Test
	    public void testFindAll() {
	        given()
	          .when().get("/user/search")
	          .then()
	             .statusCode(200)
	             .body(is("hello"));
	    }

}
