package com.fawadmalik.repoApp;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private App app;

    @BeforeTest
    public void setup(){
        app = new App();
    }
    /**
     * Rigorous Test :-)
     */
    @Test(description="basic one")
    public void shouldAnswerWithTrue()
    {
        Assert.assertEquals(app.greet("Someone"), "Hello World!\nHere comes Someone" );
    }
}
