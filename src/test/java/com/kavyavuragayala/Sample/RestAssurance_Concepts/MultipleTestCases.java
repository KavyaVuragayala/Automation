package com.kavyavuragayala.Sample.RestAssurance_Concepts;

import io.restassured.RestAssured;

public class MultipleTestCases {
    public static void main(String[] args) {

        String pincode;

        pincode = "560016";

        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)

                .when().log().all().get()

                .then().log().all().statusCode(200);



        pincode = "&";

        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)

                .when().log().all().get()

                .then().log().all().statusCode(200);


        pincode = " ";

        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)

                .when().log().all().get()

                .then().log().all().statusCode(200);




    }
}
