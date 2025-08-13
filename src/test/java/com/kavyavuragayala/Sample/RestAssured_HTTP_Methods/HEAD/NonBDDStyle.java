package com.kavyavuragayala.Sample.RestAssured_HTTP_Methods.HEAD;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NonBDDStyle {
    RequestSpecification r;   // pre request -- given()
    Response response ; // making request -- when()
    ValidatableResponse vr; // post request -- then()
    String pincode ;

    @Test
    public void test_NonBDDStyle() {

        pincode = "560048";

        // given()
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pincode);

        // when()
        response = r.log().all().head();

        //then()
        vr = response.then().log().all();
        vr.statusCode(200);
    }

        @Test
        public void test_NonBDDStyle_NegativeCase(){

            pincode= "@";

            // given()
            r = RestAssured.given();
            r.baseUri("https://api.zippopotam.us");
            r.basePath("/IN/" + pincode);

            // when()
            response = r.log().all().get();

            //then()
            vr= response.then().log().all();
            vr.statusCode(404);


        }


    }

