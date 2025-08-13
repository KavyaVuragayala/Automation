package com.kavyavuragayala.Sample.RestAssurance_Basics;

import io.restassured.RestAssured;

public class RestAssuredHelloWorld {
    public static void main(String[] args) {

        // checking for restful booker ping health uri
        // https://restful-booker.herokuapp.com/ping


        // RestAssured follows Gherkin Syntax
        // given()  --> pre request -> url,headers,auth,body....
        // .when()  --> HTTP methods
        // .then()  --> validation 


        RestAssured.given()
                    .baseUri("https://restful-booker.herokuapp.com")
                    .basePath("/ping")

                .when()
                    .log().all().get()
                    // without log().all() we dont see any logs in the output

                .then()
                    .log().all().statusCode(201);

    }
}
