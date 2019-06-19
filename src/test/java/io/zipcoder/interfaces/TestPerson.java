package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPerson {

    private Person person;

    @Before
    public void setup() {
        person = new Person(4949L, "Dwight");
    }

    @Test
    public void constructorTest(){
        Long expectedID = 4949L;
        String expectedName = "Dwight";

        Long actualID = person.getId();
        String actualName = person.getName();

        Assert.assertEquals(expectedID, actualID);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setNameTest(){
        person.setName("Garth");

        String expectedName = "Garth";
        String actualName = person.getName();

        Assert.assertEquals(expectedName, actualName);
    }



}
