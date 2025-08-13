package com.kavyavuragayala.Sample.RestAssurance_Basics;

import io.restassured.RestAssured;

public class RestAssurance_1 {

    public static void main(String[] args) {

        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")


                .when().log().all().get()

                .then().log().all().statusCode(201);

    }


}

