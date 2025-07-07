package org.example.Tests.Crud.GET;

import org.testng.annotations.Test;

public class GETRequestNonBDDTestNG2 {




        @Test
        public void testGetAllBookingpositiveTestcase()
        {
            System.out.println("Positve");

        }
        @Test
        public void testGetAllBookingNegativeTestcase()
        {

            System.out.println("Negative");
        }
        
        @Test(enabled = false)
        public void testGetAllBookingNegative2Testcase()
        {
            System.out.println("Negative_2");

        }



    }


