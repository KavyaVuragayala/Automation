package com.kavyavuragayala.Sample.RestAssured_HTTP_Methods.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class BDDStyle {

    // BDD Style --> with proper given() , when() , then()

    @Test

    public void test_BDDStyle(){
        String pincode;

        pincode = "560016";

        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)

                .when().log().all().get()

                .then().log().all().statusCode(200);
    }

}
