package br.com.sicredi.deli.config;

import org.hamcrest.Matchers;
import org.junit.BeforeClass;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;

public class BaseTeste implements IConstants{

	@BeforeClass//configuração
	public static void setup() {
		RestAssured.baseURI = APP_BASE_URL;		
		RestAssured.port = APP_PORT;
		RestAssured.basePath = APP_PATH;
		
		RequestSpecBuilder request = new RequestSpecBuilder();
		request.setContentType(APP_CONTENT_TYPE);
		RestAssured.requestSpecification = request.build();
		
		ResponseSpecBuilder response = new ResponseSpecBuilder();
		response.expectResponseTime(Matchers.lessThan(MAX_TIMEOUT));
		RestAssured.responseSpecification = response.build();
		RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
		
	}
}
