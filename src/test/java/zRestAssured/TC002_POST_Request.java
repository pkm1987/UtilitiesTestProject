package zRestAssured;


import org.apache.xmlbeans.XmlObject;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC002_POST_Request {
 
 @Test
 void RegistrationSuccessful()
 {
  
  //Specify base URI
  RestAssured.baseURI="http://restapi.demoqa.com/customer";
  
  //Request object
  RequestSpecification httpRequest=RestAssured.given();
  
   
  //Request paylaod sending along with post request
  JSONObject requestParams=new JSONObject();
  
  requestParams.put("FirstName","PradipXYZ1");
  requestParams.put("LastName","xyz1Pradip");
  requestParams.put("UserName","PradipXYZ1");
  requestParams.put("Password","pradipXYZ1");
  requestParams.put("Email","PradipXYZ1@gmail.com");
  
  httpRequest.header("Content-Type","application/json");
  
  httpRequest.body(requestParams.toString()); // attach above data to the request
  
  //Response object
  Response response=httpRequest.request(Method.POST,"/register");
    
  
  //print response in console window
  
  String responseBody=response.getBody().asString();
  System.out.println("Response Body is:" +responseBody);
  
  //status code validation
  int statusCode=response.getStatusCode();
  System.out.println("Status code is: "+statusCode);
  Assert.assertEquals(statusCode, 201);
  
  //success code validation
  String successCode=response.jsonPath().get("SuccessCode");
  Assert.assertEquals(successCode, "OPERATION_SUCCESS");
  
 }
 

}