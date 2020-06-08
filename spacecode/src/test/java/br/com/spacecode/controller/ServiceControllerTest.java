package br.com.spacecode.controller;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;

@QuarkusTest
class ServiceControllerTest {


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

//	  @Test
//		public void createSuccessTest() {
//		  User user = new User();
//		  user.setEmail("email");
//		  user.setMessage("message");
//		  user.setName("name");
//		  user.setPhone("phone");
//		  user.setSubject("subject");
//		  
//		  String headerLocation = given()
//					.contentType(ContentType.JSON)
//					.body(user)
//				.when()
//					.post("/products")
//				.then()
//					.statusCode(HttpServletResponse.SC_CREATED)
//					.header(HttpHeaderNames.LOCATION, containsString("products/"))
//					.extract()
//					.header(HttpHeaderNames.LOCATION);
//	  }

}
