package com.tsi.jake.stoner.program;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


import java.util.Optional;

@ExtendWith(MockitoExtension.class)

public class addActorStepsDef {


    //Creates mock or fake data
    @Mock
    Actor testActor = new Actor (1, "First", "Last");

    @Mock
    private MyFirstMicroserviceApplication myFirstMicroserviceApplication;
    @Mock
    private ActorRepository actorRepository;
    @Mock
    private FilmRepository filmRepository;
    @Mock
    private FilmCategoryRepository filmCategoryRepository;
    @Mock
    private CategoryRepository categoryRepository;
    @Mock
    private LanguageRepository languageRepository;


    //Used for Assertions
    String Expected;
    String Actual;


    @BeforeEach
    void setup(){

        // sets up the mock data
        languageRepository = mock(LanguageRepository.class);
        actorRepository= mock(ActorRepository.class);
        filmRepository= mock(FilmRepository.class);
        categoryRepository= mock(CategoryRepository.class);
        filmCategoryRepository= mock(FilmCategoryRepository.class);

        myFirstMicroserviceApplication = new MyFirstMicroserviceApplication(actorRepository, filmRepository, filmCategoryRepository, categoryRepository, languageRepository);

    }

    @Given("I have Actor information")
    public void i_have_actor_information() {
        setup();
    }

    @When("The information is inputted")
    public void the_information_is_inputted() {
    Actual = myFirstMicroserviceApplication.addActor(testActor.getFirst_name(), testActor.getLast_name());
    }

    @Then("I get a return string, confirming the success")
    public void i_get_a_return_string_confirming_the_success() {
    Expected = "Actor added.";
    Assertions.assertEquals(Expected, Actual, "Actor not added.");
    }

}
