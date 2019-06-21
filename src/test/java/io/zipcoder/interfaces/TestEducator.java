package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestEducator {

    private Educator paul;

    private Student larry;
    private Student curly;
    private Student moe;

    private Student[] stooges;

    @Before
    public void setup() {

        paul = Educator.PAUL;

        larry = new Student(101L, "Larry", 20.0);
        curly = new Student(102L, "Curly", 50.0);
        moe = new Student(103L, "Moe", 0.0);


        stooges = new Student[3];
        stooges[0] = larry;
        stooges[1] = curly;
        stooges[2] = moe;
    }


    @Test
    public void testImplementation(){
        Assert.assertTrue(paul instanceof Teacher);
    }



    @Test
    public void testTeach(){
        paul.teach(larry, 15.0);
        Double expected = 35.0;
        Double actual = larry.getTotalStudyTime();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLecture1(){
        paul.lecture(stooges, 90.0);


        Double larryExpected = 50.0;
        Double larryActual = larry.getTotalStudyTime();

        Double curlyExpected = 80.0;
        Double curlyActual = curly.getTotalStudyTime();

        Double moeExpected = 30.0;
        Double moeActual = moe.getTotalStudyTime();


        Assert.assertEquals(larryExpected, larryActual);
        Assert.assertEquals(curlyExpected, curlyActual);
        Assert.assertEquals(moeExpected, moeActual);
    }


}
