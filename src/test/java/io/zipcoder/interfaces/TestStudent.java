package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestStudent {

    private Student student;

    @Before
    public void setup() {
        student = new Student();
    }

    @Test
    public void testImplementation(){
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void learnTest(){
        student.learn(10.0);

        Double expected = 10.0;
        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nameTest(){
        String expected = "";
        String actual = student.getName();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void idTest(){
        Long expected = Long.MIN_VALUE;
        Long actual = student.getId();

        Assert.assertEquals(expected, actual);
    }






}
