package org.example.Tests.Crud.GET;

import io.restassured.RestAssured;

public class BDDStyleGET {
    public static void main(String[] args) {


        //GET Request
        //URL - https://api.zippopotam.us/IN/560037
        //Headers
        //Get Method
        //Base URL - https://api.zippopotam.us/
        //Base path - /IN/560037
        //Payload - No
        //Auth - No

        //Status Code
        //Response Body
        //Cookies,Headers


//Gerkin Syntax - (Given, when, then) -follows DSL (domain Specific Language)

        //Given()
        //URL, Basepath, Header
        //Auth

        //When
        //Payload, Method of what

        //Then
        //Status code, Response,Response Code,
        //Time,Headers, Cookies


RestAssured.

        given().
        baseUri("https://api.zippopotam.us/").
        basePath("/IN/560037").

        when().log().all().
        get().

        then().log().all().
        statusCode(200);


    }
}
