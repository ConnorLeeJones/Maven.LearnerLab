package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    private ZipCodeWilmington cohort = ZipCodeWilmington.getInstance();
    private Educator ringo = Educator.RINGO;

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
        Double expected = 475.0;
        Double actual = cohort.getStudents().getArray()[0].getTotalStudyTime();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHostLecture2(){
        cohort.hostLecture(ringo, 100.0);
        Double expected = 425.0;
        Double actual = cohort.getStudents().getArray()[0].getTotalStudyTime();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHostLecture3(){
        cohort.hostLecture(cohort.getInstructors().getArr()[0].getId(), 100.0);
        Double expected = 450.0;
        Double actual = cohort.getStudents().getArray()[0].getTotalStudyTime();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMap(){
        System.out.println(cohort.getStudyMap().toString());
        Assert.assertTrue(cohort.getStudyMap().size() == 4);
    }





}
