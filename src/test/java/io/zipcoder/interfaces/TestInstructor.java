package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestInstructor {

    private Instructor instructor;
    private Student student1;
    private Student student2;
    private Student student3;
    private Student student4;
    private Student student5;
    private Student[] students;

    @Before
    public void setup() {
        instructor = new Instructor();
        student1 = new Student();
        student2 = new Student();
        student3 = new Student();
        student4 = new Student();
        student5 = new Student();

        students = new Student[5];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;
    }

    @Test
    public void testImplementation(){
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        instructor.teach(student1, 15.0);

        Double expected = 15.0;
        Double actual = student1.getTotalStudyTime();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLecture(){
        instructor.lecture(students, 25.0);

        Double expected = 5.0;
        Double actual = student1.getTotalStudyTime();

        Double expected2 = 5.0;
        Double actual2 = student2.getTotalStudyTime();

        Double expected3 = 5.0;
        Double actual3 = student3.getTotalStudyTime();

        Double expected4 = 5.0;
        Double actual4 = student4.getTotalStudyTime();

        Double expected5 = 5.0;
        Double actual5 = student5.getTotalStudyTime();


        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
        Assert.assertEquals(expected4, actual4);
        Assert.assertEquals(expected5, actual5);
    }


}
