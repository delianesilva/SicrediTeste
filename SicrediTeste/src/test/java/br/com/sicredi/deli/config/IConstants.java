package br.com.sicredi.deli.config;

import io.restassured.http.ContentType;

public interface IConstants {
	String CHROME_DRIVER = "/home/delianesilva/eclipse-workspace/pageObject_java-master/drives/chromedriver";
	String APP_BASE_URL = "http://5b847b30db24a100142dce1b.mockapi.io/api";
	Integer APP_PORT = 80;
	String APP_PATH = "";
	ContentType APP_CONTENT_TYPE = ContentType.JSON;
	Long MAX_TIMEOUT = 3000L;
}
