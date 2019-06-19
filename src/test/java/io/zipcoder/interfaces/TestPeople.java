package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestPeople {

    private People<Person> peopleList;
    private Student gary;
    private Student larry;
    private Instructor jerry;
    private Instructor mary;

    @Before
    public void setup() {
        peopleList = new People<Person>() {};
        gary = new Student(110L, "Gary", 5.0);
        larry = new Student(111L, "Larry", 10.0);
        jerry = new Instructor(112L, "Jerry");
        mary = new Instructor(113L, "Mary");
    }

    @After
    public void tearDown(){
        peopleList.removeAll();
    }


    @Test
    public void sizeTest(){
        Integer expected = 0;
        Integer actual = peopleList.personList.size();
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void testAdd(){
        peopleList.add(gary);

        Integer expected = 1;
        Integer actual = peopleList.count();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAdd2(){
        peopleList.add(gary);
        peopleList.add(jerry);

        Integer expected = 2;
        Integer actual = peopleList.count();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testRemove(){
        peopleList.add(gary);
        peopleList.remove(gary);

        Integer expected = 0;
        Integer actual = peopleList.count();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findById(){
        peopleList.add(gary);
        peopleList.add(larry);
        peopleList.add(jerry);
        peopleList.add(mary);

        Person expected = jerry;
        Person actual = peopleList.findByID(112L);

        Assert.assertEquals(expected, actual);
    }


}
