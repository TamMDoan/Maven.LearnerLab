package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation(){
        String name = "Tam";
        long id = 1L;
        Instructor instructor = new Instructor(id, name);

        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        String name = "Tam";
        long id = 1L;
        Instructor instructor = new Instructor(id, name);

        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testInstructorTeach(){
        // create instructor
        String name = "Tam";
        long id = 1L;
        Instructor instructor = new Instructor(id, name);

        // create student
        String studentName = "Maria";
        long studentId = 2L;
        Student student = new Student(studentId, studentName);

        double numHoursTaught = 5.0;

        instructor.teach(student, numHoursTaught);


        Assert.assertEquals(numHoursTaught, student.getTotalStudyTime(), 1);
    }

    @Test
    public void testInstructorLecture(){
        // create instructor
        String name = "Tam";
        long id = 1L;
        Instructor instructor = new Instructor(id, name);

        // create students
        String studentName = "Maria";
        long studentId = 2L;
        Student student = new Student(studentId, studentName);
        String studentName2 = "Dog";
        long studentId2 = 3L;
        Student student2 = new Student(studentId2, studentName2);

        Student[] students = new Student[]{student, student2};
        double numHoursTaught = 15.0;

        instructor.lecture(students, numHoursTaught);

        Assert.assertEquals(numHoursTaught/2, student.getTotalStudyTime(), 1);
        Assert.assertEquals(numHoursTaught/2, student2.getTotalStudyTime(), 1);
    }
}
