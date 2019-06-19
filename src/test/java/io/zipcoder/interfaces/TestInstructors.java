package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestInstructors {

    private Instructors instructors;

    @Before
    public void setup() {
        instructors = Instructors.getInstance();
    }

    @Test
    public void testInstructors(){
        instructors = Instructors.getInstance();
        Assert.assertNotNull(instructors);
    }

    @Test
    public void testInstructors2(){
        Instructors instructors2 = Instructors.getInstance();
        Assert.assertEquals(instructors, instructors2);
    }

    @Test
    public void testInstructors3(){
        Integer expected = 4;
        Integer actual = Instructors.getInstance().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInstructors4(){
        String expected = "Ringo";
        String actual = Instructors.getInstance().findByID(1010L).getName();
        Assert.assertEquals(expected, actual);
    }



}
