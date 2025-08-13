package com.kavyavuragayala.Sample.RestAssured_HTTP_Methods.DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NonBDDStyle {

    // token , booking id /auth / cookie = "token"
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_delete_nonBDD() {

        String bookingid = "21188";
        String token = "829ded68e7ed97e";

        //given
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingid);
        r.contentType(ContentType.JSON);
        // r.header("Cookie","token="+token);
        r.cookie("token", token);
        r.log().all();

        //when()
        response = r.log().all().delete();

        //then()
        vr = response.then().log().all();
        vr.statusCode(201);
    }
}
