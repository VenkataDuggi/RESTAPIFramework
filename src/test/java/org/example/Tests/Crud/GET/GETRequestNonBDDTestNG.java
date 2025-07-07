package org.example.Tests.Crud.GET;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GETRequestNonBDDTestNG {


    @Test
    public void testGetAllBookingpositiveTestcase()
    {
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com/");
        r.basePath("booking/255").log().all();

        r.when().get();

        r.then().statusCode(200).log().all();


    }
    @Test
    public void testGetAllBookingNegativeTestcase()
    {

        System.out.println("Negative");
    }
    @Test
    public void testGetAllBookingNegative2Testcase()
    {
        System.out.println("Negative_2");

    }



}
