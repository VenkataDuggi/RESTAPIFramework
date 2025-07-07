package org.example.Tests.Crud.GET;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class NonBDDStyleGET {

    public static void main(String[] args) {


        RequestSpecification r = RestAssured.given();
        r.baseUri("https://google.com/");
        r.when().log().all().get();
        r.then().statusCode(201).log().all();




        /*
        RequestSpecification r = RestAssured.given();  //given will be stored in the RequestSpec.. Interface
        r.baseUri("https://api.zippopotam.us/");
        r.basePath("IN/560037/");

        r.when().log().all().get();


        r.then().statusCode(200).log().all();
*/


    }
}
