package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestStudents {

    private Students students;

    @Before
    public void setup() {
        students = Students.getInstance();
    }

    @Test
    public void testStudents(){
        students = Students.getInstance();
        Assert.assertNotNull(students);
    }

    @Test
    public void testStudents2(){
        Students students2 = Students.getInstance();
        Assert.assertEquals(students, students2);
    }

    @Test
    public void testStudents3(){
        Integer expected = 4;
        Integer actual = Students.getInstance().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInstructors4(){
        String expected = "Anish";
        String actual = Students.getInstance().findByID(1010L).getName();
        Assert.assertEquals(expected, actual);
    }




}
