package org.example;


import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void ValidateId()
    {

        //RequestSpecification r = RestAssured.given();
        //r.baseUri("https://reqres.in/api/users").get().then().statusCode(200).log().all();

        RestAssured.given().baseUri("https://reqres.in/api/users").get().then().statusCode(200).log().all();

    }
}
