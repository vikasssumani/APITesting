package api;

import java.net.URI;
import java.net.URISyntaxException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	
	static RequestSpecification request;
	static ResponseOptions<Response> response;
	public BaseClass() {
		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.setBaseUri("http://localhost:3000/");
		builder.setContentType(ContentType.JSON);
		RequestSpecification req= builder.build();
		request = RestAssured.given().spec(req);
	}
	
	public static void getMethod() {
		response = request.get("/posts");
	}
	
	public static ResponseOptions<Response> getMethod(String url) {
		try {
			return request.get(new URI(url));
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static void validateResponse() {
		response.getBody().print();
	}
	
}
