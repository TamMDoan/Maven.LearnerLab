package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        long id = 1L;
        String name = "Tam";
        Student student = new Student(id, name);

        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        long id = 1L;
        String name = "Tam";
        Student student = new Student(id, name);

        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        long id = 1L;
        String name = "Tam";
        double numberOfHours = 10.0;
        Student student = new Student(id, name);

        student.learn(numberOfHours);

        Assert.assertEquals(numberOfHours, student.getTotalStudyTime(), 1);

    }
}
