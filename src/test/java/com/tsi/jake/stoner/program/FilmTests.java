package com.tsi.jake.stoner.program;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

 class FilmTests {
    private int Expected;
    private int Actual;

    private String ExpectedS;
    private String ActualS;

    private Film testFilm = new Film(1,"Chicken Run", "Chicken's Run", 125, 1 );

    @Test
     void testGetFilmId(){
        Expected = 1;
        Actual = testFilm.getFilmId();
        Assertions.assertEquals(Expected, Actual, "Returns incorrect Film ID");
    }

    @Test
     void testSetFilmId(){
        Expected = 5;
        testFilm.setFilmId(Expected);
        Actual = testFilm.getFilmId();
        Assertions.assertEquals(Expected, Actual , "Film ID set incorrectly");
    }

    @Test
     void testGetTitle(){
        ExpectedS = "Chicken Run";
        ActualS = testFilm.getTitle();
        Assertions.assertEquals(ExpectedS, ActualS, "Returns incorrect Title");
    }

    @Test
     void testSetTitle(){
        ExpectedS = "Resident Evil";
        testFilm.setTitle(ExpectedS);
        ActualS = testFilm.getTitle();
        Assertions.assertEquals(ExpectedS, ActualS , "Name set incorrectly");
    }

    @Test
     void testGetDescription(){
        ExpectedS = "Chicken's Run";
        ActualS = testFilm.getDescription();
        Assertions.assertEquals(ExpectedS, ActualS, "Returns incorrect Description");
    }

    @Test
     void testSetDescription(){
        ExpectedS = "Scary Zombies";
        testFilm.setDescription(ExpectedS);
        ActualS = testFilm.getDescription();
        Assertions.assertEquals(ExpectedS, ActualS , "Description set incorrectly");
    }

    @Test
     void testGetLength(){
        Expected = 125;
        Actual = testFilm.getLength();
        Assertions.assertEquals(Expected, Actual, "Returns incorrect Length");
    }

    @Test
     void testSetLength(){
        Expected = 150;
        testFilm.setLength(Expected);
        Actual = testFilm.getLength();
        Assertions.assertEquals(Expected, Actual , "Film Length set incorrectly");
    }

    @Test
     void testGetLanguageId(){
        Expected = 1;
        Actual = testFilm.getLanguageId();
        Assertions.assertEquals(Expected, Actual, "Returns incorrect Film ID");
    }

    @Test
     void testSetLanguageId(){
        Expected = 2;
        testFilm.setLanguageId(Expected);
        Actual = testFilm.getLanguageId();
        Assertions.assertEquals(Expected, Actual , "Film ID set incorrectly");
    }

    @Test
    void testFilmConstructor(){
       String testTitle = "Test Film";
       Film testFilm = new Film(testTitle, "Film Test", 100, 1);

       Assertions.assertEquals(testTitle, testFilm.getTitle());
    }

    @Test
    void testEmptyFilm(){
       Film testEmptyFilm= new Film();

       Assertions.assertEquals(0, testEmptyFilm.getFilmId(), "Empty category constructor not working");
    }
}
