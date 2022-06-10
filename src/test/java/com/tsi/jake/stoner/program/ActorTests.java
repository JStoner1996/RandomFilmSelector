package com.tsi.jake.stoner.program;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ActorTests {
    private int Expected;
    private int Actual;

    private String ExpectedS;
    private String ActualS;


    private Actor testActor = new Actor(10, "First", "Last");


    @Test
    public void testSetActor_id(){
        Expected = 5;
        testActor.setActor_id(Expected);
        Actual = testActor.getActor_id();
        Assertions.assertEquals(Expected, Actual , "Actor ID set incorrectly");
    }

    @Test
    public void testGetActor_id(){
        Expected = 10;
        Actual = testActor.getActor_id();
        Assertions.assertEquals(Expected, Actual, "Returns incorrect Actor ID");
    }

    @Test
    public void testSetFirstName(){
        ExpectedS = "John";
        testActor.setFirst_name(ExpectedS);
        ActualS = testActor.getFirst_name();
        Assertions.assertEquals(ExpectedS, ActualS , "First Name set incorrectly");
    }

    @Test
    public void testGetFirstName(){
        ExpectedS = "First";
        ActualS = testActor.getFirst_name();
        Assertions.assertEquals(ExpectedS, ActualS, "Returns incorrect First Name");
    }

    @Test
    public void testSetLastName(){
        ExpectedS = "Smith";
        testActor.setLast_name(ExpectedS);
        ActualS = testActor.getLast_name();
        Assertions.assertEquals(ExpectedS, ActualS , "Last Name set incorrectly");
    }

    @Test
    public void testGetLastName(){
        ExpectedS = "Last";
        ActualS = testActor.getLast_name();
        Assertions.assertEquals(ExpectedS, ActualS, "Returns incorrect Last Name");
    }


}