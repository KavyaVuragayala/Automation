package com.kavyavuragayala.Sample.RestAssured_HTTP_Methods.PATCH;

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
        public void test_Patch_nonBDD() {
            String payload = "{\n" +
                    "    \"firstname\" : \"James\",\n" +
                    "    \"lastname\" : \"Brown\"\n" +
                    "}";

            String bookingid = "9262";
            String token = "4cdc2dee8d168a6";

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
            response = r.log().all().patch();

            //then()
            vr= response.then().log().all();
            vr.statusCode(200);


        }


}
