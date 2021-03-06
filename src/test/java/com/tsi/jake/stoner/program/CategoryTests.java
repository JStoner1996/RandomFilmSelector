package com.tsi.jake.stoner.program;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

 class CategoryTests {
    private int Expected;
    private int Actual;

    private String ExpectedS;
    private String ActualS;

    private Category testCategory = new Category(10, "Animated");

    @Test
     void testGetCategory_id(){
        Expected = 10;
        Actual = testCategory.getCategoryId();
        Assertions.assertEquals(Expected, Actual, "Returns incorrect Category ID");
    }

    @Test
     void testSetCategory_id(){
        Expected = 5;
        testCategory.setCategoryId(Expected);
        Actual = testCategory.getCategoryId();
        Assertions.assertEquals(Expected, Actual , "Category ID set incorrectly");
    }

    @Test
     void testGetName(){
        ExpectedS = "Animated";
        ActualS = testCategory.getName();
        Assertions.assertEquals(ExpectedS, ActualS, "Returns incorrect Name");
    }

    @Test
     void testSetName(){
        ExpectedS = "Horror";
        testCategory.setName(ExpectedS);
        ActualS = testCategory.getName();
        Assertions.assertEquals(ExpectedS, ActualS, "Name set incorrectly");
    }

    @Test
    void testEmptyCategory(){
       Category testEmptyCategory = new Category();

       Assertions.assertEquals(0, testEmptyCategory.getCategoryId(), "Empty category constructor not working");
    }
}
