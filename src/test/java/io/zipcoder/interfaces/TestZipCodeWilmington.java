package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    ZipCodeWilmington cohort = ZipCodeWilmington.getInstance();

    @Test
    public void testZCW(){
        Assert.assertNotNull(cohort);
    }

    @Test
    public void testZCW2(){
        ZipCodeWilmington zipCodeWilmington2 = ZipCodeWilmington.getInstance();
        Assert.assertEquals(cohort, zipCodeWilmington2);
    }

    @Test
    public void testHostLecture(){
        cohort.hostLecture(cohort.getInstructors().getArr()[0], 100.0);
        Double expected = 425.0;
        Double actual = cohort.getStudents().getArray()[0].getTotalStudyTime();
        Assert.assertEquals(expected, actual);
    }



}
