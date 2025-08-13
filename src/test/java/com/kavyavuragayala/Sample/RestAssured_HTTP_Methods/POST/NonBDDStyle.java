package com.kavyavuragayala.Sample.RestAssured_HTTP_Methods.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NonBDDStyle {

    RequestSpecification r;   // pre request -- given()
    Response response ; // making request -- when()
    ValidatableResponse vr;

    @Test
    public void test_postNonBDD_CreateToken(){

        // URL - https://restful-booker.herokuapp.com/auth
        // PAYLOAD
        // HEADER
        // Auth ? -- for now not req for this url
        // Cookie ?
        //Validate - 200 OK
        // Body Response - Token generation or not

        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        // given()
        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(payload).log().all();
      //  r.header("Content-length","1000");
      //  r.auth().basic("admin","password123");
      //  r.auth().oauth2("ey-098765434567890-");
      //  r.header("Authorization","Bearer ey-989765432345678");

        //when()
        response = r.when().log().all().post();

        //then()
        vr= response.then().log().all();
        vr.statusCode(200);

    }
}
