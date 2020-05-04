package br.com.sicredi.deli.api;

import static org.hamcrest.Matchers.*;
import org.junit.Test;
import br.com.sicredi.deli.config.BaseTeste;
import static io.restassured.RestAssured.given;

public class SimuladorAPITeste extends BaseTeste{

	@Test
	public void visualizarInvestimentoAssociado() {
		given()			
		.when()
			.get("/v1/simulador")
		.then()
			.statusCode(200)
			.body("meses", hasItems("112","124","136","148"))
			.body("valor", hasItems("2.802","3.174","3.564","3.971"))
		;			
	}
	
	@Test
	public void validarAPIErro() {
		given()			
		.when()
			.get("/v1/simul")
		.then()
			.statusCode(404)		
		;			
	}
}
