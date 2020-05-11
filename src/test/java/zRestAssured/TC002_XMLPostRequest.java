package zRestAssured;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC002_XMLPostRequest {

    @Test
    public void xmlPostRequest_Test() {

        RestAssured.baseURI = "http://localhost:8006";

        String requestBody = "<client>\r\n" +
            "    <clientNo>101</clientNo>\r\n" +
            "    <name>Tom Cruise1</name>\r\n" +
            "    <ssn>124-542-5553</ssn>\r\n" +
            "</client>";

        Response response = null;

        response = given().
        contentType(ContentType.XML)
            .accept(ContentType.XML)
            .body(requestBody)
            .when()
            .post("/addClient");

        System.out.println("Post Response :" + response.asString());
        System.out.println("Status Code :" + response.getStatusCode());
        System.out.println("Does Reponse contains '100 Tom Cruise 124-542-5555'? :" + response.asString().contains("100 Tom Cruise 124-542-5555"));
    }

}