package com.kavyavuragayala.Sample.RestAssured_HTTP_Methods.PUT;

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
    public void test_PUT_nonBDD() {
        String payload = "{\n" +
                "    \"firstname\" : \"Alice\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2025-08-01\",\n" +
                "        \"checkout\" : \"2025-08-09\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Dinner\"\n" +
                "}";

        String bookingid = "1816";
        String token = "2a92fdbc90f3d64";

        //given
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+bookingid);
        r.contentType(ContentType.JSON);
       // r.header("Cookie","token="+token);
        r.cookie("token",token);
        r.body(payload);
        r.log().all();

        //when()
        response = r.log().all().put();

        //then()
        vr= response.then().log().all();
        vr.statusCode(200);


    }
}
